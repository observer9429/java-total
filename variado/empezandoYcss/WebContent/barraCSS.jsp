<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Barra_navegaci&oacute;n</title>
<style type="text/css">
/* reset css */
html, body, h1, h2, h3, h4, h5, h6, p, ol, ul, li, pre, code, address, variable, form, fieldset, blockquote {
 padding: 0;
 margin: 0;
 font-size: 100%;
 font-weight: normal;
}
table { border-collapse: collapse; border-spacing: 0; }
td, th, caption { font-weight: normal; text-align: left; }
img, fieldset { border: 0; }
ol { padding-left: 1.4em; list-style: decimal; }
ul { padding-left: 1.4em; list-style:square; }
q:before, q:after { content:''; }
/* final reset */


body {
	font: 62.5% Verdana, Arial, Helvetica, sans-serif;
	padding: 20px;
}

#barra{

margin:0;
padding:0;
list-style:none;
width:185px;
border-bottom:1px dashed #53C486;
}

#barra a {

color:BLACK;
font-size:11PX;
text-transform:uppercase;
text-decoration:none;
border: 1px dashed #53C486;



padding: 7px 5px;
display:block;
width:185px;
background-color:#D1CBC4;
background-image: url(fondolink.png);
background-repeat:no-repeat;
background-position: 0 2px;

padding:7px 5px 7px 30px;
border-bottom:none;

}

#barra a:hover{

font-weight:bold;
background-color:#6D97CE;

/* reposisiconamermos la foto para q muestre lo del centro */
background-position:3px 50%;

}

#inicio #linkinicio{

	background-color:WHITE;
	background-position:97% 100%;
	font-weight:bold;

}




</style>
</head>
<body id="inicio">
  <ul id="barra">
    <li><a href="index.html" id="linkinicio">Inicio</a></li>
    <li><a href="caracteristicas.html">Caracter&iacute;sticas</a></li>
    <li><a href="expertos.html">Expertos</a></li>
    <li><a href="preguntas.html">Preguntas</a></li>
    <li><a href="proyectos.html">Proyectos</a></li>
    <li><a href="foros.html">Foro</a></li>
  </ul>
</body>
</html>