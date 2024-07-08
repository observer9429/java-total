<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"  %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registro</title>
</head>
<body>

�<!-- en el modelatribute tiene el nombre tal como se se defini -->
<form:form action="procesarFormulario" modelAttribute="envioAlumno">
<!-- el path lleva ese nombre porque como se ha llamado la variable en la clase alumno -->
<!-- el metodo se llama getNombre se coge despues de la palabra get o set pero con la primera letra en minuscula -->
<!-- al cargar spring llama al get y al enviar la informacion llama a set -->
Nombre: <form:input path="nombre"/>
<form:errors path="nombre" style="color:red"/><!-- en caso este vacio, dir� campo requerido -->

<br/><br/><br/>

Apellido: <form:input path="apellido"/>

<br/><br/><br/>

Edad: <form:input path="edad"/>
<form:errors path="edad" style="color:red"/><!-- en caso este vacio, dir� campo requerido -->



<br/><br/><br/>

E-mail: <form:input path="email"/>
<form:errors path="email" style="color:red"/><!-- en caso este vacio, dir� campo requerido -->
<br/><br/><br/>



C. Postal: <form:input path="codigoPostal"/>
<form:errors path="codigoPostal" style="color:red"/>
<br/><br/><br/>
Asignaturas optativas:<br/>
<!-- se le debe poner el nombre de la variable, iniciando con la priemra letra en minuscula -->
<!-- agregamos la opcion multiple para poder escoger varias opciones  -->
<form:select path="optativa" multiple="true">
	
	<form:option value="Dise�o" label="Dise�o"/>
	<form:option value="Karate" label="Karate"/>
	<form:option value="Comercio" label="Comercio"/>
	<form:option value="Danza" label="Danza"/>


</form:select>

<br/><br/><br/> 

		Barcelona<form:radiobutton path="ciudadEstudios" value="Barcelona"/>
		Lima<form:radiobutton path="ciudadEstudios" value="Lima"/>
		Berl�n<form:radiobutton path="ciudadEstudios" value="Berl�n"/>
		Mosc�<form:radiobutton path="ciudadEstudios" value="Mosc�"/>
<br/><br/><br/>

		Ingl�s<form:checkbox path="idiomasAlumno" value="Ingl�s"/>
		Franc�s<form:checkbox path="idiomasAlumno" value="Franc�s"/>
		Alem�n<form:checkbox path="idiomasAlumno" value="Alem�n"/>
		Chino<form:checkbox path="idiomasAlumno" value="Chino"/>

<br/><br/><br/>


<input type="submit" value="Enviar">

</form:form>

</body>
</html>