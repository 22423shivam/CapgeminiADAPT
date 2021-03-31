<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.cj.jdbc.Driver"); %>
<!DOCTYPE html>
<html>
<body>
	<%Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/crudapi", "root", "admin@123");
      Statement statement = connection.createStatement() ;
      ResultSet r = statement.executeQuery("select * from employee") ;%>
      
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Department</th>
                <th>Designation</th>
                <th>Salary</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
            <% while(r.next()){ %>
            <tr>
                <td contenteditable='true'> <%= r.getInt(1) %></td>
                <td> <%= r.getString(2) %></td>
                <td> <%= r.getString(3) %></td>
                <td> <%= r.getString(4) %></td>
                <td> <%= r.getInt(5)  	%></td>
                <td> <a href="/deleteEmployee.html/		<%= r.getInt(1) %>">Delete</a> </td>
                <td> <a href="/editEmployeeDetail.html/	<%= r.getInt(1) %>">Edit</a> </td>
            </tr>
            <% } %>
        </table>
        
</body>
</html>