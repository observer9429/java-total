<html>

<body>


<h1 style="text-align:center">

Ejemplo de Declaraciones en JSP
</h1>

 <%!
 
 private int resultado;
 public int metodoSuma(int num1, int num2){
	 
	 resultado=num1+num2;
	 
	 return resultado;
	 
	 
 }
 
 public int metodoResta(int num1, int num2){
	 
	 resultado=num1-num2;
	 
	 return resultado;
	 
	 
 }
 
 
 public int metodoMultiplica(int num1, int num2){
	 
	 resultado=num1*num2;
	 
	 return resultado;
	 
	 
 }
 /*
 for(int i=0;i<10;i++){
	 
	 out.println("<br>este es el mensaje "+ i);
	 
	 
 }
 */

 
 %> 
 
  <%= metodoSuma(7,5) %>;

<br>

La suma de 5 y 7 es: <%=5+7 %>

<br>

10 es amyor que 100: <%= 10>100 %>

</body>


</html>