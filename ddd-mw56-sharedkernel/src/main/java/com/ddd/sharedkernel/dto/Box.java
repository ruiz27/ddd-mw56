package com.ddd.sharedkernel.dto;

public class Box {
	
	private String identification;
	private String reference;
	
	public Box(String identification, String reference) {
		super();
		this.identification = identification;
		this.reference = reference;
	}

	public String getIdentification() {
		return identification;
	}

	public String getReference() {
		return reference;
	}
	

}
