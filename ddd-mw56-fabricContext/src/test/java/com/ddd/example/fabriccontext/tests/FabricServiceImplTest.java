package com.ddd.example.fabriccontext.tests;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ddd.example.fabriccontext.infrastructure.RequestRepository;
import com.ddd.example.fabriccontext.model.Box;
import com.ddd.example.fabriccontext.service.impl.FabricServiceImpl;

import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@RunWith(MockitoJUnitRunner.class)
public class FabricServiceImplTest {
	
	@Mock
	RequestRepository requestRepository;
	
	private FabricServiceImpl fac;

	@Before
	public void init() {
		
	}

	@Test
	public void when_registerProcess_correct() {
		fac = new FabricServiceImpl(requestRepository);
		Mono<Box> res = fac.processShipment("GIFT");
		StepVerifier.create(res.log())
		.expectNext(new Box())
		.verifyComplete();
	}
}
