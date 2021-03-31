package com.capgemini.springrest;

import org.bson.types.ObjectId;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 
@Document
public class Users {
  
	@Id
	public ObjectId _id; 
	public String order;
 
	// Constructors
	public Users() {}
 
	public Users(ObjectId _id, String order) {
		this._id = _id;
		this.order = order;
	}
 
	// GETTERS AND SETTERS
	// ObjectId needs to be converted to string	
	public String get_id() { return _id.toHexString(); }
	public void set_id(ObjectId _id) { this._id = _id; }
 
	public String getName() { return order; }
	public void setName(String order) { this.order = order; }
 
}