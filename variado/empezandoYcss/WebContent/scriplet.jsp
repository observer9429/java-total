<html>

<body>


<h1>

Ejemplo de scriplets en JSP
</h1>

 <%
 for(int i=0;i<10;i++){
	 
	 out.println("<br>este es el mensaje "+ i);
	 
	 
 }
 
 %> 

<br>

La suma de 5 y 7 es: <%=5+7 %>

<br>

10 es amyor que 100: <%= 10>100 %>

</body>


</html>