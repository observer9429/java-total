<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Documento sin t�tulo</title>
<style>

body{
	background-color:#FFC;
}

table{
	background:#FF6;
	padding:10px;
	border:solid 2px #FF0000;
}

td{
	padding:5px 0;
}




</style>
</head>

<body>
<h1 style="text-align:center">Registro</h1>
<form action="Recoge_datos.jsp" method="post">

  <table width="25%">
    <tr>
      <td width="13%"><label for="nombre">Nombre: </label></td>
      <td width="87%"><input type="text" name="nombre" id="nombre"></td>
    </tr>
    <tr>
      <td><label for="apellido">Apellido:  </label></td>
      <td><input type="text" name="apellido" id="apellido"></td>
    </tr>
    <tr>
      <td><label for="usuario">Usuario: </label></td>
      <td><input type="text" name="usuario" id="usuario"></td>
    </tr>
    <tr>
      <td><label for="contra">Contrase�a: </label></td>
      <td><input type="text" name="contra" id="contra"></td>
    </tr>
    <tr>
      <td> <label for="pais">Pa�s:</label></td>
      <td><select name="pais" id="pais">
        <option>M�xico</option>
        <option>Colombia</option>
        <option>Chile</option>
        <option>Per�</option>
        <option>Argentina</option>
        <option>Espa�a</option>
      </select></td>
    </tr>
    <tr>
      <td>Tecnolog�as: </td>
      <td><label>
        <input type="radio" name="tecnologias" value="Java" id="tecnologias_0">
        Java</label>
        <br>
        <label>
          <input type="radio" name="tecnologias" value="PHP" id="tecnologias_1">
          Php</label>
        <br>
        <label>
          <input type="radio" name="tecnologias" value="JavaScript" id="tecnologias_2">
      JavaScript</label></td>
    </tr>
    <tr>
      <td colspan="2" align="center"><input type="submit" name="button" id="button" value="Enviar"></td>
    </tr>
  </table>
  <p><br>
  </p>
</form>
</body>
</html>