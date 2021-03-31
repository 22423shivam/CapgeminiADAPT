package com.capgemini.springrest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VEmployeeService {
	
	@Autowired
	private VEmployeesRepository employeeRepository;
	
	// get all the employees
	public List<VEmployees> getAllEmployees(){
		List<VEmployees> list = new ArrayList<>();
		employeeRepository.findAll().forEach(list::add);
		return list;}
	
	// fetch the employee
	public Optional<VEmployees> getEmployee(String id) {
		
		return employeeRepository.findById(id);
	}
	
	// add the employee
	public void addEmployee(VEmployees employee) {
		employeeRepository.save(employee);	}
	
	// update the employee
	public void updateEmployee(String id, VEmployees employee) {
		employeeRepository.save(employee);}
	
	// remove the employee
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);}
}
