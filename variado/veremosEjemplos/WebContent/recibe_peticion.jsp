<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String ciudad_favorita=request.getParameter("ciudad_favorita");

//creamos la cookie

Cookie laCookie=new Cookie("agencia_viajes.ciudad_favorita",ciudad_favorita);
//definimos tiempo de vida de la cooklie

laCookie.setMaxAge(600);
//enviamos la cookie al ususario

response.addCookie(laCookie);


%>


Gracias por enviar tus preferencias

<a href="agencia_viajes.jsp"> Ir a la agencia de viajes</a>
</body>
</html>