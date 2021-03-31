package com.capgemini.springmvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeOP {
	
	// setting the connection
	private Connection c;
	
	// constructor 
	public  EmployeeOP() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	   	    this.c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/crudapi", "root", "admin@123");
			}catch (Exception e) {
				System.out.println(e);
			}
	}
	
	// adding an employee
	public void insertUser(Employee employee) throws Exception {
		 String employeeName		=employee.getEmployeeName();
		 String employeeDepartment	=employee.getEmployeeDepartment();
		 String employeeDesignation	=employee.getEmployeeDesignation();
		 int employeeSalary			=employee.getEmployeeSalary();
		 
		 PreparedStatement p = c.prepareStatement("insert into employee "
		 		+ "(employeeName,employeeDepartment,employeeDesignation,employeeSalary) values(?,?,?,?)");
    	 p.setString(1, employeeName);
    	 p.setString(2,employeeDepartment);
    	 p.setString(3, employeeDesignation);
    	 p.setInt(4,employeeSalary);
    	 p.executeUpdate();
		
	}
	
	// getting an employee by ID
	public ResultSet getDetailById(String id) throws Exception {
			
		PreparedStatement p = c.prepareStatement("select * from employee where employeeId=?");
		p.setString(1, id);
		ResultSet r = p.executeQuery();
		return r;
	}
		
	// deleting an employee by ID
	public void deleteEmployee(int id)throws Exception{
			
		PreparedStatement p = c.prepareStatement("DELETE from employee where employeeId=?");
		p.setInt(1, id);
		p.executeUpdate();
	}
		
	
	//getting all employees
	public ResultSet getDetails() throws Exception{
		PreparedStatement p = c.prepareStatement("select * from employee");
		ResultSet r = p.executeQuery();
		return r;
	}

	
	// update employee
	public void updateDetails(Employee employee) throws Exception {
		String update = "UPDATE employee SET employeeName=?,employeeDepartment=?,employeeDesignation=?,employeeSalary=? where employeeId=?";
		PreparedStatement p = c.prepareStatement(update);
		p.setString(1, employee.getEmployeeName());
		p.setString(2, employee.getEmployeeDepartment());
		p.setString(3, employee.getEmployeeDesignation());
		p.setInt(4, employee.getEmployeeSalary());
		p.setInt(5, employee.getEmployeeId());
		p.executeUpdate();
	}
}