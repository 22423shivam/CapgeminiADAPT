package com.capgemini.springrest;

import java.util.Date;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {

	@Id
	public int _id;
	public float total;
	public Date date;
	public NCustomer customer;
	public LineItem lineItem;
	
	// constructor
	public Order(int _id, float total, Date date, NCustomer customer) {
		this._id = _id;
		this.total = total;
		this.date = date;
		this.customer = customer;
	}

	// getters and setters
	public int get_id() {
		return _id;}
	public void set_id(int _id) {
		this._id = _id;}
	public float getTotal() {
		return total;}
	public void setTotal(float total) {
		this.total = total;}
	public Date getDate() {
		return date;}
	public void setDate(Date date) {
		this.date = date;}
	public NCustomer getCustomer() {
		return customer;}
	public void setCustomer(NCustomer customer) {
		this.customer = customer;}
	
	public LineItem getLineItem() {
		return lineItem;}
	public void setLineItem(LineItem lineItem) {
		this.lineItem = lineItem;}
	/*
	 * public void addLineItem(LineItem lineItem) { lineItem.set_id(ObjectId.get());
	 * lineItem.setProduct(lineItem.product); lineItem.setQuantity(3); // implement
	 * to take quantity
	 * 
	 * return; }
	 */
	/*
	 * public void removeLineItem(LineItem lineItem) {
	 * 
	 * for(LineItem i : LineItem[]) {
	 * 
	 * if(lineItem.get_id()==i.get_id()) { //TODO remove line Item } } }
	 */
}










