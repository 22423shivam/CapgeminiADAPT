package com.capgemini.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	
		/*
		 * creating view to let user enter
		 */
	  @RequestMapping(value="/simpleinterest.html", method = RequestMethod.GET)
	  public ModelAndView simpleInterest() {
	  
	  ModelAndView model = new ModelAndView("SimpleInterestForm"); 
	  return model; 
	  }
	  
		/*
		 * returning a view with calculated SI
		 */
	  @RequestMapping(value="/submitAndCalculateSI.html", method = RequestMethod.POST)
	  public ModelAndView result(@RequestParam ("p") Integer P,
			  					 @RequestParam ("t") Integer T,
			  					 @RequestParam ("r") Integer R) {
	  int simp = (P*R*T)/100;
	  
	  ModelAndView model = new ModelAndView("CalculatedSI"); 
	  model.addObject("si", simp);
	  
	  return model; 
	  }
	 
}







