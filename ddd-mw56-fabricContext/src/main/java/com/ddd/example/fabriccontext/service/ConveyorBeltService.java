package com.ddd.example.fabriccontext.service;

import java.util.concurrent.TimeUnit;
import java.util.function.UnaryOperator;

import com.ddd.example.fabriccontext.model.Box;
import com.ddd.example.fabriccontext.web.client.TransportClient;

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
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			log.error("",e);
		}
		
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
		
		TransportClient transportClient = new TransportClient();
		transportClient.sendBelt(t.getName()).subscribe(log::info);
		 
		return t;
	}
}
