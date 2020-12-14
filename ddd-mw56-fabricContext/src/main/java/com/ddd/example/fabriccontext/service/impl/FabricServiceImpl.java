package com.ddd.example.fabriccontext.service.impl;

import java.util.function.UnaryOperator;

import org.springframework.stereotype.Service;

import com.ddd.example.fabriccontext.model.Box;
import com.ddd.example.fabriccontext.service.ConveyorBeltService;
import com.ddd.example.fabriccontext.service.FabricService;
import com.ddd.example.fabriccontext.web.client.TransportClient;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * Process shipment service
 * 
 * @author sergio.ruiz
 *
 */
@Slf4j
@Service
public class FabricServiceImpl implements FabricService {

	private UnaryOperator<Box> conveyorBelt1;
	private UnaryOperator<Box> conveyorBelt2;
	private UnaryOperator<Box> conveyorBelt3;

	public FabricServiceImpl() {
		conveyorBelt1 = new ConveyorBeltService("1");
		conveyorBelt2 = new ConveyorBeltService("2");
		conveyorBelt3 = new ConveyorBeltService("3");
	}

	/**
	 * Process shipment method
	 * 
	 * @param request
	 * @return
	 */
	public Mono<Box> processShipment(String request) {
		
		log.info("\n Request received " + request);
		log.info("\n Box created");
		Box box = new Box(1,request);
		Mono<Box> boxMono = Mono.just(box);
		
		log.info("Box in fabric");
		TransportClient transportClient = new TransportClient();
		
		boxMono
	    .map(box1 -> conveyorBelt1.andThen(conveyorBelt2).andThen(conveyorBelt3).apply(box))
	    .doOnNext(box1-> {
	    	log.info("Sending box");
		    transportClient.getResult().subscribe(log::info);
	    })
	    .subscribe();
	    
	    return boxMono;
	}
}
