package com.capgemini.springrest;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

// REST CONTROLLER
@RestController
public class LoginRESTController {
	
	// getting the message
	@RequestMapping(value="/vcheck.html" , method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public String success(@ModelAttribute ("user9") UserLogin user9) {
		
		/*
		 * here we have added an admin,
		 * we can add more admins too
		 */
		UserLogin admin1 = new UserLogin();
		admin1.setUsername("sagar");
		admin1.setPassword("admin");
		
		// validation
		if(user9.getUsername().equals(admin1.getUsername())){
			if(user9.getPassword().equals(admin1.getPassword())){
				return "Valid User";	
			}else {
				return "Invalid User";}
		}else {
			return "Invalid User";}
	}
}
