<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

para agregar la libreria digamos
<%@ page import="java.sql.*"  %>;

<%

String nombre=request.getParameter("nombre");
String apellido=request.getParameter("apellido");
String usuario=request.getParameter("usuario");
String contra=request.getParameter("contra");
String pais=request.getParameter("pais");
String tecno=request.getParameter("tecnologias");

try{
 Class.forName("com.mysql.jdbc.Driver");

java.sql.Connection miConexion=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto-jsp","root","");
java.sql.Statement miStatement=miConexion.createStatement();

String ordensql="INSERT INTO USUARIOS(Nombre,Apellido,Usuario,Contrasena,Pais,Tecnologia) VALUES('"+nombre+"','"+apellido+"','"+usuario+"','"+contra+"','"+pais+"','"+tecno+"')";
miStatement.executeUpdate(ordensql);
out.println("registro exitoso");

}catch(Exception e){
	
	out.println("falla al conectar");
}




%>

</body>
</html>