package com.capgemini.springrest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VEmployees {
  
	@Id
	public String _id; 
	public String employeeName;
	public String employeeDept;
	public String employeeDesignation;
	public int employeeSalary;
 
	// Constructors
	public VEmployees() {}
 
	public VEmployees(String _id, String employeeName, String employeeDept, String employeeDesignation,
			int employeeSalary) {
		this._id = _id;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}

	// GETTERS AND SETTERS
	// ObjectId needs to be converted to string	
	public String get_id() { return _id; }
	public void set_id(String _id) { this._id = _id; }

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDept() {
		return employeeDept;
	}

	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}