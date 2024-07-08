<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="java.sql.*"  %>

<%


String usuario=request.getParameter("usuario");
String contra=request.getParameter("contrasena");


try{
	
Class.forName("com.mysql.jdbc.Driver");

Connection miConexion=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto-jsp","root","");

PreparedStatement elprep=miConexion.prepareStatement("SELECT * FROM USUARIOS WHERE USUARIO=? AND CONTRASENA=?");

elprep.setString(1, usuario);

elprep.setString(2, contra);

ResultSet tabla=elprep.executeQuery();


if(tabla.absolute(1)){
	
	
	out.println("usuario autorizado");
	
}else{
	
	out.println("no hay usuarios con estos datos");
}

}catch(Exception e){
	
	out.println("falla al conectar");
}




%>



</body>
</html>