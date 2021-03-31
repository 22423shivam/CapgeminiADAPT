package com.capgemini.springrest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	// get all the customer
	public List<Customer> getAllCustomer(){
		List<Customer> list = new ArrayList<>();
		customerRepository.findAll().forEach(list::add);
		return list;}
	
	// fetch the customer
	public Optional<Customer> getCustomer(String id) {
		return customerRepository.findById(id);}
	
	// add the customer
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);	}
	
	// update the customer
	public void updateCustomer(String id, Customer customer) {
		customerRepository.save(customer);}
	
	// remove the customer
	public void deleteCustomer(String id) {
		customerRepository.deleteById(id);}
}
