package com.capgemini.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EOP {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	// setting the template for jdbc
	@Autowired
	public  void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}

	// quering the db with limit set
	public List<Employee> getEmployeeByPageNO(int page,int lastcout){
		
		String query = "select * from employee limit " + (page-1) + "," + lastcout;
		
		return jdbcTemplate.query(query, new RowMapper<Employee>() {
			public Employee mapRow(ResultSet r, int i) throws SQLException 
			{
				Employee emp = new Employee();
				emp.setId(r.getInt(1));
				emp.setName(r.getString(2));
				emp.setSalary(r.getInt(5));
				return  emp;
        	}
    	});
	}
}