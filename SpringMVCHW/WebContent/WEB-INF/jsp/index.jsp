<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	HE HE
	<br />
	<hr>
	<a href="/SpringMVCHW/hello">Click to hello world</a>
	<br />
	<hr>
	<a href="/SpringMVCHW/studentForm">Click to add a Student</a>
	<br />
	<hr>
	<form:form method="GET" action="/SpringMVCHW/redirection">
		<table>
			<tr>
				<td><input type="submit" value="Click to Redirect" /></td>
			</tr>
		</table>
	</form:form>
	<hr>
	<form:form method="GET" action="/SpringMVCHW/myStaticPage">
		<table>
			<tr>
				<td><input type="submit" value="Get HTML Page" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>