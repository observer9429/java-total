<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Ingrese  con su usario y clave</h2>

<form name="verrifLogin" action="VerificarIngreso" method="post">

	<table>
	
		<tr><td>Usuario:</td><td><input type="text" name="usuario"></td></tr>
		<tr><td>Clave:</td><td><input type="text" name="clave"></td></tr>
		<tr><td><input type="submit" value="Ingresar"></td></tr>
		
	
	</table>

</form>


</body>
</html>