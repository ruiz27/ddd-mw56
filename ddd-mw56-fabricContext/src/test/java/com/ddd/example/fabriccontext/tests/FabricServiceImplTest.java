package com.ddd.example.fabriccontext.tests;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.ddd.example.fabriccontext.service.impl.FabricServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class FabricServiceImplTest {


	@Before
	public void init() {

	}

	@Test
	public void when_registerProcess_correct() {
		FabricServiceImpl fac = new FabricServiceImpl();
		fac.processShipment("GIFT");
	}
}
	