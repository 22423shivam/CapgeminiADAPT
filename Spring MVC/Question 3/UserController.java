package com.capgemini.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jakarta.validation.Valid;

@Controller
public class UserController {
	
	// getting the LOGIN view
	@RequestMapping(value = "/login.html" , method = RequestMethod.GET)
	public ModelAndView loginDetails() {
		
		ModelAndView m = new ModelAndView("login");
		return m;
	}
	
	// getting the CREDENTIALS view
	@RequestMapping(value = "/submit.html" , method = RequestMethod.POST)
	public ModelAndView ReturnDetails(@Valid @ModelAttribute("user1") User user1 , BindingResult result) throws Exception{
		
		// USED FOR TRIAL ON DATABASE EXCEPTION
		/*
		 * String exceptionOcurred = "SQLEXCEPTION";
		 * if(exceptionOcurred.equalsIgnoreCase("SQLEXCEPTION")) { throw new
		 * SQLException("SQLEXCEPTION"); }
		 */
		
		/*
		 * checking erroe then return the ERROR view
		 */
		if(result.hasErrors()) {
		  
			  ModelAndView m1 = new ModelAndView("error"); 
			  m1.addObject("errorMsg","Wrong Details, Exiting...."); 
			  return m1; 
		  }else {
		 
			  ModelAndView m = new ModelAndView("success");
			  m.addObject("top", "AUTHENTICATION SUCCESSFUL....." );
			  return m;
		  }
		
	}
	
	// USED FOR TRIAL ON DATABASE EXCEPTION
	/*
	 * @ExceptionHandler(value = Exception.class) public String
	 * errorHandle(Exception e) {
	 * 
	 * 
	 * return "error"; }
	 */
	 
}
