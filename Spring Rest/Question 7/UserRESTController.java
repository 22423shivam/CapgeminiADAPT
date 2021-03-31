package com.capgemini.springrest;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

//INTEGRATED THE SERVICE LAYER WITH THE REST CONTROLLER
@RestController
@RequestMapping("/users")				// to get through to orders and then perform
public class UserRESTController {
	
  @Autowired
  private UsersRepository repository;
 
  	//PLACE ORDER
  	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
 	public Users createOrder(@Valid @RequestBody Users order) {
	 	order.set_id(ObjectId.get());
   		repository.save(order);
   		return order;
 	}
 
 	//UPDATE ORDER
 	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void UpateOrderById(@PathVariable("id") ObjectId id, @Valid @RequestBody Users order) {
 		order.set_id(id);
 		repository.save(order);
	}

	//GET ORDER
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Users getOrderById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	} 
	
	// GET ALL ORDERS
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Users> getAllOrders() {
		return repository.findAll();
	}
 
	// DELETE ORDER
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteOrder(@PathVariable ObjectId id) {
		repository.delete(repository.findBy_id(id));
  }
}