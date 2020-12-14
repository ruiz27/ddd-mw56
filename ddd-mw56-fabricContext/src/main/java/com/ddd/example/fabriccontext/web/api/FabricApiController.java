package com.ddd.example.fabriccontext.web.api;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ddd.example.fabriccontext.model.Box;
import com.ddd.example.fabriccontext.service.FabricService;

import reactor.core.publisher.Mono;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-12-14T09:20:10.890Z")

@RestController
public class FabricApiController {
	
	private FabricService fabricService;
	

    public FabricApiController(FabricService fabricService) {
		this.fabricService = fabricService;
	}


	@RequestMapping(value = "/fabric/startProcess", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public Mono<Box> startProcessFabric(@RequestBody String e) {
          return fabricService.processShipment(e);
    }

}
