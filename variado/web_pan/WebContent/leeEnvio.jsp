<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ page import="acciones.LosUsuarios" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
//LosUsuarios elUsu=(LosUsuarios)request.getAttribute("envioProducto");

String elUsu=(String)request.getAttribute("envioProducto");
%>

<body>

<td><%= elUsu%></td>

<td><%= elUsu %></td>
<td><%= elUsu%></td>



</body>
</html>