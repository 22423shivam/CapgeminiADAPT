package com.capgemini.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeOP e;
	
	// add emp
	@RequestMapping(value = "/addEmployee.html",method = RequestMethod.GET)
	public ModelAndView addEmployee() {
		
		ModelAndView m = new ModelAndView("employeeForm");
		return m;
	}
	
	// isnert OP
	@RequestMapping(value ="/InsertEmployee.html",method =RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute ("employee")Employee employee) throws Exception {
		
		e.insertUser(employee);
		ModelAndView m = new ModelAndView("employeeDetails");
		return m;
	}
	
	// using path variable to get the ID
	@RequestMapping("/deleteEmployee.html/{userId}")
	public ModelAndView deleteEmployee(@PathVariable ("userId") int userId)throws Exception {
		
		e.deleteEmployee(userId);
		ModelAndView m = new ModelAndView("employeeDetails");
		m.addObject("msg",userId);
		return m;
	}
	
	// using path variable to get the ID
	@RequestMapping("/editEmployeeDetail.html/{userId}")
	public ModelAndView editEmployee(@PathVariable ("userId") int userId) {
		
		ModelAndView m = new ModelAndView("updateEmployee");
		m.addObject("userId",userId);
		return m;
	}
	
	// update
	@RequestMapping(value = "/updateEmployee.html",method = RequestMethod.POST)
	public ModelAndView updateDetails(@ModelAttribute ("employee")Employee employee) throws Exception {
		
		e.updateDetails(employee);
		ModelAndView m = new ModelAndView("employeeDetails");
		m.addObject("msg",employee);
		return m;
	}
	

}