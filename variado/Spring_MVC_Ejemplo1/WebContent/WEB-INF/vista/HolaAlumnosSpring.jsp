<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/miestilo.css">


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hola ${param.nombreAlumno}. Bieveniudo al curso de spring

<p>
<br/>
<h2>Atención a todos</h2>

${mensajeClaro}
 
</p>
<!-- pageContext.request.contextPath nos situa en la carpeta raiz, es decir en WebContent -->
<img alt="foto" src="${pageContext.request.contextPath}/recursos/imgs/cer.jpg">
</body>
</html>