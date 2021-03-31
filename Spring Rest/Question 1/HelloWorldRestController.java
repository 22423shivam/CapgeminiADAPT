package com.capgemini.springrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;


// the rest controller annotation forf usage as REST service
@RestController
public class HelloWorldRestController {
		
	/*
	 * getting the HELO WORLD msg
	 */
	@RequestMapping(value="/hellomsg.html", method = RequestMethod.GET, 
				produces=MediaType.APPLICATION_JSON_VALUE)
	public String hello() {
		
		return "Hello World";
	}
}
