<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@  page import="java.sql.*" %> 


    <%@  page import="java.util.ArrayList" %>
<%@  page import="javax.swing.ImageIcon" %>

    <%@page import="java.util.Base64"%>
    <%@page import="java.io.*"%>
    

  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

Class.forName("com.mysql.jdbc.Driver");

Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/ver", "root", "");
Statement est=miConexion.createStatement();
String sql="SELECT * FROM FOTOS";

ImageIcon imageIcon=null;
ResultSet rs=est.executeQuery(sql);

byte[] bytesLeidos=null;

Blob bytesImagen=null;

FileInputStream archivolee=new FileInputStream("C:/Users/warez9429/Desktop/ejecutables/we.jpg");

//byte[] imageInBytes = IOUtils.toByteArray(myStream);

%>

<img src="" />


</body>
</html>