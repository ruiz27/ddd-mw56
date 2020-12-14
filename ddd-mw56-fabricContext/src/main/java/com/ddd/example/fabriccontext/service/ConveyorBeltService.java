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
		
		String mario = "\n"+"──────────────███████──███████\r\n" + 
				"──────────████▓▓▓▓▓▓████░░░░░██        Procesed box " + t.getName() + " in belt " + belt + "\r\n" + 
				"────────██▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░██\r\n" + 
				"──────██▓▓▓▓▓▓████████████░░░░██\r\n" + 
				"────██▓▓▓▓▓▓████████████████░██\r\n" + 
				"────██▓▓████░░░░░░░░░░░░██████\r\n" + 
				"──████████░░░░░░██░░██░░██▓▓▓▓██\r\n" + 
				"──██░░████░░░░░░██░░██░░██▓▓▓▓██\r\n" + 
				"██░░░░██████░░░░░░░░░░░░░░██▓▓██\r\n" + 
				"██░░░░░░██░░░░██░░░░░░░░░░██▓▓██\r\n" + 
				"──██░░░░░░░░░███████░░░░██████\r\n" + 
				"────████░░░░░░░███████████▓▓██\r\n" + 
				"──────██████░░░░░░░░░░██▓▓▓▓██\r\n" + 
				"────██▓▓▓▓██████████████▓▓██\r\n" + 
				"──██▓▓▓▓▓▓▓▓████░░░░░░████\r\n" + 
				"████▓▓▓▓▓▓▓▓██░░░░░░░░░░██\r\n" + 
				"████▓▓▓▓▓▓▓▓██░░░░░░░░░░██\r\n" + 
				"██████▓▓▓▓▓▓▓▓██░░░░░░████████\r\n" + 
				"──██████▓▓▓▓▓▓████████████████\r\n" + 
				"────██████████████████████▓▓▓▓██\r\n" + 
				"──██▓▓▓▓████████████████▓▓▓▓▓▓██\r\n" + 
				"████▓▓██████████████████▓▓▓▓▓▓██\r\n" + 
				"██▓▓▓▓██████████████████▓▓▓▓▓▓██\r\n" + 
				"██▓▓▓▓██████████──────██▓▓▓▓████\r\n" + 
				"██▓▓▓▓████──────────────██████\r\n" + 
				"──████";
		log.info(mario);
//		t.setName(t.getName().concat(mario));
		return t;
	}
}
