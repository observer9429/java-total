<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmación de registro</title>
</head>
<body>
<!-- nombre de la variable de interfaz modelo del metodo procesafORMULARIO+. nombre de la variable -->
El alumno con nombre: <strong>${envioAlumno.nombre}</strong> y apellido <strong>${envioAlumno.apellido}</strong>
y edad <strong> ${envioAlumno.edad}</strong>;  con email: <strong>${envioAlumno.email}</strong>
 y codigo postal <strong>${envioAlumno.codigoPostal}</strong>

 se ha
registrado con éxito
<br/><br/><br/>
<!-- el nombre que se le da en el formulario y en los metodos deben ser iguales -->
La asignatura escogida es: <strong>${envioAlumno.optativa}</strong>
<br/><br/><br/>
La provincia de estudios será <strong>${envioAlumno.ciudadEstudios} </strong>
<br/><br/><br/>
Los ididomas escogidos por el alumno son: ${envioAlumno.idiomasAlumno}

</body>
</html>