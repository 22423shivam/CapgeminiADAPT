package com.capgemini.springrest;

import java.lang.Math; 
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorControl {
	
	// addition
	  @RequestMapping(value="/add/{x}/{y}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	  public Calculator add(@PathVariable ("x") int x,@PathVariable ("y") int y) {
	  
	  return new Calculator(x , y , x+y); }
	 
	
	// subtraction
	  @RequestMapping(value="/sub/{x}/{y}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	  public Calculator sub(@PathVariable ("x") int x,@PathVariable ("y") int y) {
	  
	  return new Calculator(x , y , x-y); }
	  
	// multiplication
	  @RequestMapping(value="/mul/{x}/{y}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	  public Calculator mul(@PathVariable ("x") int x,@PathVariable ("y") int y) {
	  
	  return new Calculator(x , y , x*y); }
	  
	// division
	  @RequestMapping(value="/div/{x}/{y}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	  public Calculator div(@PathVariable ("x") int x,@PathVariable ("y") int y) {
	  
		  // kept it as int
		  // can be changed to get the float value or use pre-present methods
		  try { Calculator c = new Calculator(x , y , x/y); return c; } catch(Exception e) 
		  {System.out.println(e.fillInStackTrace());} return null; }
	  
	// square-root
	  @RequestMapping(value="/sqrt/{x}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	  public float sqrt(@PathVariable ("x") int x) {return (float) Math.sqrt(x); }
}
