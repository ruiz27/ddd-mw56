package com.ddd.example.fabriccontext.service.impl;

import java.util.function.UnaryOperator;

import com.ddd.example.fabriccontext.model.Box;
import com.ddd.example.fabriccontext.service.ConveyorBeltService;
import com.ddd.example.fabriccontext.service.FabricService;

import reactor.core.publisher.Mono;

/**
 * Process shipment service
 * 
 * @author sergio.ruiz
 *
 */
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
		Box box = new Box();
		box.setName(request);
		conveyorBelt1.andThen(conveyorBelt2).andThen(conveyorBelt3).apply(box);
		return null;
	}

}
