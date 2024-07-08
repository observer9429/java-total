<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <% String alumnos[]={"antonio","maria","pablo"}; 
    
    pageContext.setAttribute("losAlumnos", alumnos);
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%--eplo de comentario --%>
<%--ahora de ejempl osin tag --%>

<%
for(String los:alumnos){
	
	out.println(los);
}




%>

<%--ahora con el TAG --%>

<c:forEach var="tempAlumnos" items="${losAlumnos}">

	${tempAlumnos} <br/>

</c:forEach>

</body>
</html>
