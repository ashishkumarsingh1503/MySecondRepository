<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Contact Info Form</h2>

	<font color='green'> ${SuccessMsg} </font>
	<font color='red '> ${ErrMsg} </font>

	<form:form action="saveContact" method="POST" modelAttribute="contact">

		<table>

			<tr>
				<td>Name</td>
				<td><form:input path="Name" /></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><form:input path="Email" /></td>
			</tr>
			<tr>
				<td>Pwd</td>
				<td><form:input path="Pwd" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><form:radiobutton path="gender" value="male" /> Male <form:radiobutton
						path="gender" value="female" /> Fe-Male</td>
			</tr>
			<tr>
				<td>phNo</td>
				<td><form:input path="phNo" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="saveContact" /></td>

			</tr>
		</table>

	</form:form>

	<a href="#">View All Contact</a>

</body>
</html>
