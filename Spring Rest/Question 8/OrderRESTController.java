package com.capgemini.springrest;

import javax.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")		
public class OrderRESTController {
	
	@Autowired
	private OrderEntryService orderService;
	
	//ADD PRODUCT
  	@RequestMapping(value="/{id}", method=RequestMethod.POST)
  	public void addProd(@Valid @RequestBody Product prod) {
	 	orderService.addProduct(prod);
   		return ;
 	}
  	
  	//UPDATE PRODUCT
  	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void UpdateProd(@PathVariable("id") ObjectId id, @Valid @RequestBody Product prod) {
  		orderService.updateProduct(id, prod);
  	}
  	
  	//GET PRODUCT
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public void getOrderById(@PathVariable("id") ObjectId id) {
		orderService.getProduct(id);
	}
	
	// GET ALL ORDERS
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void getAllOrders() {
		orderService.getAllProducts();
	}
	 
	// DELETE ORDER
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteOrder(@PathVariable ObjectId id) {
		orderService.deleteProduct(id);
	}
}
