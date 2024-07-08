<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  el action no redirige a la pagina procesarFormulario2 sino al metodo llamado asi con el requestmapping -->
<form action="procesarFormulario2" method="get">

	<input type="text" name="nombreAlumno">
	<input type="submit">
	
</form>

</body>
</html>