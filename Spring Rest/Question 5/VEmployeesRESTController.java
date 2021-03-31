package com.capgemini.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

//INTEGRATED THE SERVICE LAYER WITH THE REST CONTROLLER
@RestController
public class VEmployeesRESTController {
	
  @Autowired
  private VEmployeeService empService;
 
  //PLACE ORDER
  	@RequestMapping(value = "/employee", method = RequestMethod.POST)
 	public void addEmp(@RequestBody VEmployees emp) {
	 	empService.addEmployee(emp);
 	}
  	
  //GET ORDER
  	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
  	public Optional<VEmployees> searchEmp(@PathVariable("id") String id) {
  		return empService.getEmployee(id);
  	} 

  //DELETE ORDER
 	@RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
 	public void deleteEmp(@PathVariable String id) {
 		empService.deleteEmployee(id);
 		
   }
 	
  // GET ALL ORDERS
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<VEmployees> getAllEmps() {
		return empService.getAllEmployees();
	}

  //UPDATE ORDER
 	@RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
	public void UpateEmp(@PathVariable("id") String id, @RequestBody VEmployees emp) {
 		empService.updateEmployee(id, emp);
	}
}




