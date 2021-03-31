package com.capgemini.springmvc;

public class Employee {
	
	// data
	private int employeeId;
	private String employeeName;
	private String employeeDepartment;
	private String employeeDesignation;
	private int employeeSalary;
	
	// getters and setters
	public int getEmployeeId() {
		return employeeId;}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;}
	public String getEmployeeName() {
		return employeeName;}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;}
	public String getEmployeeDepartment() {
		return employeeDepartment;}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;}
	public String getEmployeeDesignation() {
		return employeeDesignation;}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;}
	public int getEmployeeSalary() {
		return employeeSalary;}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;}
	/*
	 * @Override public String toString() { return "Employee [employeeId=" +
	 * employeeId + ", employeeName=" + employeeName + ", employeeDepartment=" +
	 * employeeDepartment + ", employeeDesignation=" + employeeDesignation +
	 * ", employeeSalary=" + employeeSalary + "]"; }
	 */
}
