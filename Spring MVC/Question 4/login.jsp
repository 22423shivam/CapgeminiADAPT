<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<body>
	<%-- <form:errors path="user1.*"/> --%>
	<!-- <a href="/FirstSpringMVCProject/login.html?siteLanguage=en">Login(English)</a>
	<a href="/FirstSpringMVCProject/login.html?siteLanguage=fr">Login(French)</a>  
	<a href="/FirstSpringMVCProject/login.html?siteLanguage=vi">Login(Vietnamese)</a>
	 -->
	 <head><title>You are Registered..!!</title></head>
	 
	<h1>Please enter your DETAILS for Login: </h1>
	
	<form action="/FirstSpringMVCProject/Check.html" method="post">
		<p>
			Username : <input type="text" name="username"/>
		</p>
		<p>
			Password : <input type="text" name="password"/>
		</p>
				
			 <input type="submit" value="Login"/>
	</form>
</body>
</html>