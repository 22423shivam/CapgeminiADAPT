<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page import="com.sagar.springmvc.EmployeeOP"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<body>
<%EmployeeOP emp= new EmployeeOP();
  ResultSet r = emp.getDetailById(request.getAttribute("userId").toString());%>
  
	<form action="/FirstSpringMVCProject/updateEmployee.html" method="post">
	 <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Department</th>
                <th>Designation</th>
                <th>Salary</th>
           </tr>
            <% while(r.next()){ %>
            <tr>
                <td> <input type="text" value="<%= r.getInt(1) 		%>" name="employeeId"   /></td>
                <td> <input type="text" value="<%= r.getString(2) 	%>" name="employeeName"/></td>
                <td> <input type="text" value="<%= r.getString(3) 	%>" name="employeeDepartment"/></td>
                <td> <input type="text" value="<%= r.getString(4) 	%>" name="employeeDesignation"/></td>
                <td> <input type="text" value="<%= r.getInt(5) 		%>" name="employeeSalary"/></td>
                
            </tr>
            <% } %>  
        </table>
        	<p> 
             <input type="submit" value="Update"/>
            </p>
        </form>
</body>
</html>