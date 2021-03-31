<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<body>
	<form:errors path="user1.*"/>
	<a href="/FirstSpringMVCProject/login.html?siteLanguage=en">Login(English)</a>
	<a href="/FirstSpringMVCProject/login.html?siteLanguage=fr">Login(French)</a>  
	<a href="/FirstSpringMVCProject/login.html?siteLanguage=vi">Login(Vietnamese)</a>
	
	<h1>Please enter your DETAILS : </h1>
	
	<form>
		<p>
			<spring:message code="username"/> <input type="text" name="username"/>
		</p>
		<p>
			<spring:message code="password"/> <input type="text" name="password"/>
		</p>
				
			<spring:message code="submit.login"/> <input type="submit" value="Login"/>
	</form>
</body>
</html>