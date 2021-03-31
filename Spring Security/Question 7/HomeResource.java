package com.capgemini.SpringSecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	// for others
	
	
	  @RequestMapping(value="/", method=RequestMethod.GET) public String
	  sayHelloWorld() {
	  
	  return ("<h1>HELLO WORLD</h1>"); }
	  
	  // only for users
	  
	  @RequestMapping(value="/user", method=RequestMethod.GET) public String
	  sayHelloUser() {
	  
	  return ("<h1>HELLO USER</h1>"); }
	  
	  // only for admins
	  
	  @RequestMapping(value="/admin", method=RequestMethod.GET) public String
	  sayHelloAdmin() {
	  
	  return ("<h1>HELLO ADMIN</h1>"); }
	 
}
