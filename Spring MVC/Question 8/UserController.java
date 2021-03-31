package com.capgemini.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	// getting the LOGIN view
	@RequestMapping(value = "/login.html", method = RequestMethod.GET)
	public ModelAndView loginDetails() {

		ModelAndView m = new ModelAndView("login");
		return m;
	}
	
	
	
	
	
	
	
	/*
	 * // getting the CREDENTIALS view
	 * 
	 * @RequestMapping(value = "/submit.html" , method = RequestMethod.POST) public
	 * ModelAndView ReturnDetails(@ModelAttribute("user1") User user1){
	 * 
	 * ModelAndView m = new ModelAndView("success");
	 * m.addObject("top","AUTHENTICATION SUCCESSFUL....." ); return m; }
	 */
}
