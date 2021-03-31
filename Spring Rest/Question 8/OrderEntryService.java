package com.capgemini.springrest;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderEntryService {
	
	@Autowired
	private OrdersRepository ordersRepository;
	
	/*
	 * here we can use order to set new line Items
	 * and through it we can set the product as well
	 * but no implemented
	 * 
	 * but we also need to change the repository definition then
	 * 
	 */
	
	// add product
	public Product addProduct(Product product) {
		product.setId(ObjectId.get());
		ordersRepository.insert(product);
		return product;
	}
	
	// update product
	public Product updateProduct(ObjectId id, Product product) {
		product.setId(id);
		ordersRepository.save(product);
		return product;
	}
	
	// get product
	public Product getProduct(ObjectId id) {
		return ordersRepository.findBy_id(id);
	}
	
	// get all products
	public List<Product> getAllProducts() {
		return ordersRepository.findAll();
	}
	
	// delete Product
	public void deleteProduct(ObjectId id) {
		ordersRepository.delete(ordersRepository.findBy_id(id));
	}
}
