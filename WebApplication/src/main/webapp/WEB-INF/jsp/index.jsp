<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP - Hello World Tutorial - Programmer Gate</title>
</head>
<body>
	<h1>Register</h1>
    <form action="/users/register" method="post">
        Name: <input type="text" name="name" /><br />
        Email: <input type="text" name="email" /><br />
        Phone Number: <input type="text" name="phoneNumber" /><br />
        <input type="submit" value="Register" />
    </form>
</body>
</html>