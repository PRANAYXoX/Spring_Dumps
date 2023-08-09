<%@page import="sample.beans.UserDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>PROFILE PAGE</h1>
<%
	UserDetails ud=(UserDetails)request.getAttribute("data");
%>
USERNAME: <%= ud.getUser() %></br>
PASSWORD: <%= ud.getPassword() %></br>
GENDER: <%= ud.getGender() %>
</body>
</html>