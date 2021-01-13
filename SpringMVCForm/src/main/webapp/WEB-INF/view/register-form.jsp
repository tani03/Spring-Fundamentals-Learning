<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>

<style>
	.error{
		color:red;
	}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="register">

            First name:
            <form:input path="firstName" />

            <br><br> Last name (*):
            <form:input path="lastName" />
            <form:errors path="lastName" cssClass="error" />

            <br><br> Age (*):
            <form:input path="age" />
            <form:errors path="age" cssClass="error" />

            <br><br> Email (*):
            <form:input path="email" />
            <form:errors path="email" cssClass="error" />

           
            <input type="submit" value="Submit" />

        </form:form>
	
</body>
</html>