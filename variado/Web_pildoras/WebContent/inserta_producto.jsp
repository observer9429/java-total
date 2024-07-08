<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<H1 style="text-align: center;">Insertar Registros</H1>

<form name="form1" method="get" action="ControladorProductos">

<input type="hidden" name="instruccion" value="insertarBBDD">

<table style="width: 400px;">

 <tbody>
 
  <tr>
   <td>CÓDIGOARTÍCULO</td>
   <td><input maxlength="4" size="24" type="text" name="codigo"/></td>
  </tr>
 
  <tr>
   <td>SECCIÓN</td>
   <td><input maxlength="11" size="24" type="text" name="seccion"/></td>
  </tr>
 
  <tr>
   <td>NOMBREARTÍCULO</td>
   <td><input maxlength="24" size="24" type="text" name="nomart"/></td>
  </tr>
 
  <tr>
   <td>PRECIO</td>
   <td><input maxlength="10" size="24" type="text" name="precio"/></td>
  </tr>
 
  
 
  <tr>
   <td>IMPORTADO</td>
   <td><input maxlength="9" size="24" type="text" name="fecha"/></td>
  </tr>
 
  <tr>
   <td>PAÍSDEORIGEN</td>
   <td><input maxlength="9" size="24" type="text" name="porigen"/></td>
  </tr>
 
  <tr>
   <td><input type="submit" value="Enviar" name="envio"/></td>
   <td><input type="reset" value="Restablecer" name="borrar"/></td>
  </tr>
  
 </tbody>
 
</table>

</form>

</body>
</html>