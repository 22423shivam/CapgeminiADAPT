package com.capgemini.springrest;

import javax.persistence.Id;

public class NCustomer {
	
	@Id
	public int _id;
	public String fName;
	public String lName;
	public String street;
	public String city;
	public String state;
	public String zip;
	public String country;
	
	// constructor
	public NCustomer(int _id, String fName, String lName, String street, String city, String state, String zip,
			String country) {
		this._id = _id;
		this.fName = fName;
		this.lName = lName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	// getters and setters
	public int get_id() {
		return _id;}
	public void set_id(int _id) {
		this._id = _id;}
	public String getfName() {
		return fName;}
	public void setfName(String fName) {
		this.fName = fName;}
	public String getlName() {
		return lName;}
	public void setlName(String lName) {
		this.lName = lName;}
	public String getStreet() {
		return street;}
	public void setStreet(String street) {
		this.street = street;}
	public String getCity() {
		return city;}
	public void setCity(String city) {
		this.city = city;}
	public String getState() {
		return state;}
	public void setState(String state) {
		this.state = state;}
	public String getZip() {
		return zip;}
	public void setZip(String zip) {
		this.zip = zip;}
	public String getCountry() {
		return country;}
	public void setCountry(String country) {
		this.country = country;}	
}





