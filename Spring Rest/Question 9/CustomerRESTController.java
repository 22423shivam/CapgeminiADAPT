package com.capgemini.springrest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRESTController {
	
	  @Autowired
	  private CustomerService cService;
	 
	  //ADD CUSTOMER
	  	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	 	public void addCus(@RequestBody Customer c) {
	  		cService.addCustomer(c);
	 	}
	  	
	  //GET CUSTOMER
	  	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
	  	public Optional<Customer> searchCus(@PathVariable("id") String id) {
	  		return cService.getCustomer(id);
	  	} 

	  //DELETE CUSTOMER
	 	@RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
	 	public void deleteCus(@PathVariable String id) {
	 		cService.deleteCustomer(id);
	 		
	   }
	 	
	  // GET ALL CUSTOMER
		@RequestMapping(value = "/customers", method = RequestMethod.GET)
		public List<Customer> getAllCus() {
			return cService.getAllCustomer();
		}

	  //UPDATE CUSTOMER
	 	@RequestMapping(value = "/customer/{id}", method = RequestMethod.PUT)
		public void UpdateCus(@PathVariable("id") String id, @RequestBody Customer c) {
	 		cService.updateCustomer(id,c);
		}
}
