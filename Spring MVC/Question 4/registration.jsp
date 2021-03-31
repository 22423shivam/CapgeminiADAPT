<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<%-- 	<form:errors path="customer1.*"/> --%>
	
	<h1>Please register your DETAILS : </h1>
	
	<form action = "/FirstSpringMVCProject/registerUser.html" method = "post">
	
		<p>
			User Name : <input type="text" name="username" required/>
		</p>
		<p>
			Password : <input type="text" name="password" required/>
		</p>		
		<p>
			Email : <input type="text" name="email" required/>
		</p>
		
				
		<input type="submit" value="Register"/>
	
	</form>

</body>
</html>