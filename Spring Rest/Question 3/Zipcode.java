package com.capgemini.springrest;

public class Zipcode {
	
	private int zipCode;
	private ZipDetails zipdetails;
	
	// initializing the constructor
	public Zipcode(int zipCode, ZipDetails zipdetails) {
		//super();
		this.zipCode = zipCode;
		this.zipdetails = zipdetails;
	}
	
	// GETTERs and SETTERs
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public ZipDetails getZipdetails() {
		return zipdetails;
	}
	public void setZipdetails(ZipDetails zipdetails) {
		this.zipdetails = zipdetails;
	}
}
