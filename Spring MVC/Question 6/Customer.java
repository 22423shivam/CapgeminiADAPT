package com.capgemini.springmvc;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Customer {
	/*
	 * here annotations are used as asked along with
	 * error resolving messages
	 */
	
	// USERNAME REGEXP
	@NotEmpty(message = "Please enter your username.")
	@Size(min=8,max=20, message="uername should be between 8-20 characters")
	@Pattern(regexp="/^[a-zA-Z0-9\\-_]$/", message="no spaces allowed in username")
	private String username;
	
	// PASSWORD REGEXP
	@NotEmpty(message = "Please enter your password.")
	@Size(min=8,max=20,message="password should be between 8-20 characters")
	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[_$#.@])[A-Za-z\\\\d_$#.@]$",
	message="*for password use combination of 1 uppercase,lowercase,digit,special char [$][_][#][.][@]")
	private String password;
	
	// matching the EMAIL
	@NotEmpty(message = "Please enter your email.")
	@Email
	private String email;
	
	// 10 digit phone number
	@Pattern(regexp="^[0-9]{10}$" , message="please enter 10 digit phone-number")
	private Long contact;

	private String city;
	
	// 6 digit zip-code without considering numbers starting with '0'
	@NotEmpty (message = "Please enter your zip-code.")
	@Pattern(regexp="^[0-9]{6}$",message="please enter 6 digit zipcode")
	private Long zipcode;

	
	// GETTERs and SETTERs
	public String getUsername() {
		return username;}
	public void setUsername(String username) {
		this.username = username;}
	
	public String getPassword() {
		return password;}
	public void setPassword(String password) {
		this.password = password;}

	public String getEmail() {
		return email;}
	public void setEmail(String email) {
		this.email = email;}
	
	public Long getContact() {
		return contact;}
	public void setContact(Long contact) {
		this.contact = contact;}
	
	public String getCity() {
		return city;}
	public void setCity(String city) {
		this.city = city;}
	
	public Long getZipcode() {
		return zipcode;}
	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;}
}
