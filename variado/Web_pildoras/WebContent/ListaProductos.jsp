<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%//al usar tags , no sera necesaria java util  @ page import="java.util.*, usos.*" %>   

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ZZ</title>

<style type="text/css">

.cabecera{
	
	
	font-size:1.2em;
	font-weight:bold;
	color:#FFFFFF;
	background-color: #08088A;

}

.filas{

	text-align:center;
	background-color:#5882FA;

}

table{
	
		float:left;

}

#contenedorBoton{

margin-left:800px;

}

</style>

</head>
<%
//obtiene los prodcutos de controaldor(servlet)

//casteamos ya q el metodo lo devuelve en formato objeto
// List<Productos> losProductos=(List<Productos>) request.getAttribute("listaproductos");



%>


<body>

<table>

<tr>

<td class="cabecera">Código artículo</td>
<td class="cabecera">Sección</td>
<td class="cabecera">Nombre artículo</td>
<td class="cabecera">Precio</td>
<td class="cabecera">Importado</td>
<td class="cabecera">País de origen</td>
<td class="cabecera">Acción</td>



</tr>

<%

// for(Productos vari: losProductos){%>


<c:forEach var="temProd" items="${listaproductos}">

<!-- link para casda producto con su campo clave -->

<c:url var="linkTemp" value="ControladorProductos">

	<c:param name="instruccion" value="cargar">
		
	</c:param>

	<c:param name="codigo" value="${temProd.codigo}">
		
	</c:param>

</c:url>


<!-- link para eliminar cada registro con su campo clave -->

<c:url var="linkTempEliminar" value="ControladorProductos">

	<c:param name="instruccion" value="eliminar">
		
	</c:param>

	<c:param name="codigo" value="${temProd.codigo}">
		
	</c:param>

</c:url>


<tr>
  
<td class="filas">${temProd.codigo}</td>
<td class="filas">${temProd.seccion}</td>
<td class="filas">${temProd.nombreart}</td>
<td class="filas">${temProd.precio}</td>
<td class="filas">${temProd.importado}</td>
<td class="filas">${temProd.porigen}</td>
<td class="filas"><a href="${linkTemp}">Actualizar</a>&nbsp;<a href="${linkTempEliminar}">Eliminar</a></td>



</tr>

</c:forEach>
<% // } %>

</table>

<div id="contenedorBoton">
	
	<input type="button" value="Insertar Registro" onclick="window.location.href='inserta_producto.jsp'" />
		
</div>


</body>
</html>