package com.ddd.example.fabriccontext.tests;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.ddd.example.fabriccontext.model.Box;
import com.ddd.example.fabriccontext.service.impl.FabricServiceImpl;

import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@RunWith(MockitoJUnitRunner.class)
public class FabricServiceImplTest {

	@Before
	public void init() {

	}

	@Test
	public void when_registerProcess_correct() {
		FabricServiceImpl fac = new FabricServiceImpl();
		Mono<Box> res = fac.processShipment("GIFT");
		StepVerifier.create(res.log())
		.expectNext(new Box())
		.verifyComplete();
	}
}
