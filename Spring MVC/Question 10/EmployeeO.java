package com.capgemini.springmvc;

public class EmployeeO {
    
	// data
	private int id;
    private String name;
    private float salary;

    // getting the constructor
    public EmployeeO(int id, String name, float salary) {
    	this.id = id;
    	this.name = name;
    	this.salary = salary;
    }
    
    // getters and setters
    public int getId() {
        return id;}
    public void setId(int id) {
        this.id = id;}
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public float getSalary() {
        return salary;}
    public void setSalary(float salary) {
        this.salary = salary;}

    // toString method
	/*
	 * @Override public String toString() { return "Employee [id=" + id + ", name="
	 * + name + ", salary=" + salary + "]"; }
	 */
    
    
}
