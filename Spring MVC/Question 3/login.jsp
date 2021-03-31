<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	<form:errors path="user1.*"/>
	
	<h1>Please enter your DETAILS : </h1>
	
	<form action = "/FirstSpringMVCProject/submit.html" method = "post">
	
		<p>
			User Name : <input type="text" name="username"/>
		</p>
		
		<p>
			Password : <input type="text" name="password"/>
		</p>		
	
		<input type="submit" value="Authenticate"/>
	
	</form>

</body>
</html>