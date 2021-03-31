package com.capgemini.springrest;

import javax.persistence.Id;
public class LineItem {
	
	@Id
	public int _id;
	public int quantity;
	public Product product;
	
	// constructors
	public LineItem(int _id, int quantity, Product product) {
		this._id = _id;
		this.quantity = quantity;
		this.product = product;
	}
	
	// getters and setters
	public int get_id() {
		return _id;}
	public void set_id(int _id) {
		this._id = _id;}
	public int getQuantity() {
		return quantity;}
	public void setQuantity(int quantity) {
		this.quantity = quantity;}
	public Product getProduct() {
		return product;}
	public void setProduct(Product product) {
		this.product = product;}
}
