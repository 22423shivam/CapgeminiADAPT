package com.capgemini.springrest;
import javax.persistence.Entity;
import javax.persistence.Id;
 
@Entity
public class Customer {
  
	@Id
	public String _id; 
	public String customerName;

	// Constructors
	public Customer() {}
	
	public Customer(String _id, String customerName) {
		//super();
		this._id = _id;
		this.customerName = customerName;
	}

	// getters and setters
	public String get_id() {
		return _id;}
	public void set_id(String _id) {
		this._id = _id;}
	public String getCustomerName() {
		return customerName;}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;}
}
