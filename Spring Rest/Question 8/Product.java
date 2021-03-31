package com.capgemini.springrest;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.bson.types.ObjectId;

@Entity
public class Product {
	
	@Id
	public ObjectId _id;
	public String prodName;
	public float cost;

	// constructor
	public Product(ObjectId _id, String prodName, float cost) {
		this._id = _id;
		this.prodName = prodName;
		this.cost = cost;
	}
	
	// getters and setters
	public ObjectId get_Id() {
		return  _id;}
	public void setId(ObjectId _id) {
		this._id = _id;}
	public String getProdName() {
		return prodName;}
	public void setProdName(String prodName) {
		this.prodName = prodName;}
	public float getCost() {
		return cost;}
	public void setCost(float cost) {
		this.cost = cost;}
}
