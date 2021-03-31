package com.akshat.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class UserController {
	
	@Autowired
	DataBase db;
	
	// getting the registratiion form
	@RequestMapping(value="/registration.html",method=RequestMethod.GET)
	public ModelAndView Registration() {
		
		ModelAndView modelAndView = new ModelAndView("registration");
		return modelAndView;
	}
	
	// registration of the user 
	@RequestMapping(value="/registerUser.html",method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User1 user) throws Exception {
		
		       db.insertData(user);
	    	 
	    	   ModelAndView modelAndView = new ModelAndView("login");
	    	   return modelAndView;	
	}
	
	// checking
	@RequestMapping(value ="/Check.html",method = RequestMethod.POST)
	public ModelAndView Check(@ModelAttribute ("user") User1 user) throws Exception {
		 
		boolean result = db.getData(user);
		
		// returning the SUCCESS view
		if(result) {
			ModelAndView modelAndView = new ModelAndView("success");
			modelAndView.addObject("top", "Login Successful");
			return modelAndView;
		}
		
		// returning the ERROR view
		else {
			ModelAndView modelAndView = new ModelAndView("error");
			modelAndView.addObject("errorMsg", "Wrong Credentials");
			return modelAndView;
		}
	}
}