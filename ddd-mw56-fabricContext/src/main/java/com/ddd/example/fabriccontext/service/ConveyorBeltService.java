package com.ddd.example.fabriccontext.service;

import java.util.function.UnaryOperator;

import com.ddd.example.fabriccontext.model.Box;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author sergio.ruiz
 *
 */
@Slf4j
public class ConveyorBeltService implements UnaryOperator<Box> {
	
	private String belt;

	public ConveyorBeltService(String belt) {
		this.belt = belt;
	}
	
	/**
	 * Process box
	 */
	public Box apply(Box t) {
		log.info("Procesed box " + t.getName() + " in belt " + belt);
		return t;
	}

}
