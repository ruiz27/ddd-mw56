package com.ddd.example.fabriccontext.service;

import com.ddd.example.fabriccontext.model.Box;

import reactor.core.publisher.Mono;

public interface FabricService {

	Mono<Box> processShipment(String request);
	
}
