<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <%@ page import="java.util.*, java.sql.*,lostags.Empleado" %>
    
    <%
    
    ArrayList<Empleado> datos=new ArrayList<>();
    
    Class.forName("com.mysql.jdbc.Driver");
    
    
    
    try{
    	
    	Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto-jsp","root","");
    	
    	Statement miStatement=miConexion.createStatement();
    	
    	String orden="SELECT * FROM EMPLEADOS";
    	
    	ResultSet rs=miStatement.executeQuery(orden);
    	
    	while(rs.next()){
    		
    		datos.add(new Empleado(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
    		
    	}
    	
    	rs.close();
    	
    	miConexion.close();
    	
    	
    	
    }catch(Exception e){
    	
    	out.println("ocurrió un error");
    	
    }
    
    pageContext.setAttribute("losEmpleados", datos);
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

.cabecera{

font-weight:bold;

}

</style>

</head>
<body>

<table border="1">

<tr class="cabecera"><td>Nombre</td><td>Apellido</td><td>Puesto</td><td>Salario</td><td>Bonus</td></tr>

<c:forEach var="empTemp" items="${losEmpleados}">

<!-- el empTemp.nom  despues del punto se le llama a la propiedad tal y como se declaro en la claseEmpleado -->

<tr>
	<td>${empTemp.nom}</td><td> ${empTemp.ape}</td><td> ${empTemp.puesto}</td><td> ${empTemp.salario}</td>
	<td>
	<c:if test="${empTemp.salario<2000}">
	
	5000
	
	</c:if>
	
	<c:if test="${empTemp.salario>2000}">
	
	---
	
	</c:if>
	</td> 
</tr>

</c:forEach>


</table>

</body>
</html>