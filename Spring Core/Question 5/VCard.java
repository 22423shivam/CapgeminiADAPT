package io.org.annote;

import org.springframework.beans.factory.annotation.Required;

public class VCard {

	// made the vNumber to be required or will give error
	@Required
	private String vNumber;


	public String getvNumber() {
		return vNumber;
	}

	@Override
	public String toString() {
		return "VCard [vNumber=" + vNumber + "]";
	}

	
	 public void setvNumber(String vNumber) { this.vNumber = vNumber; }
	 



}
