<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Galer&iacute;a P&iacute;ldoras</title>
<link href="estilosGaleria.css" rel="stylesheet" type="text/css" />

<style type="text/css">

.foto img{

border:2px solid BLACK;
background-color:#CCC;
padding:4px;

}

.figura p{

font: 1.1em Arial, Helvetica , sans-serif;
margin: 10px 0 0 0;
height:5em;

}

.figura{
float:left;
width: 210px;
margin: 0px 10px 10px 10px; 
}



</style>

</head>
<body>
<div id="contenido">
  <h1>P&iacute;ldoras inform&aacute;ticas Photo Gallery </h1>
  <p class="intro">Una selecci&oacute;n de im&aacute;genes de naturaleza de <strong>P&iacute;ldoras Inform&aacute;ticas</strong>. </p>
  <div id="galeria">
	    <div class="figura">
	      		<div class="foto"> <img src="die.jpg" alt="Carpet Grass" width="200" height="200" /></div>
	      		<p>Figura 1: &Aacute;rbol en mitad de la pradera.</p>
	    </div>
	    
	    <div class="figura">
			      <div class="foto"> <img src="die.jpg" alt="Bentgrass" width="200" height="200" /></div>
			      <p>Figura 2: Barco rodeado de icebergs.</p>
	    </div>
	    
	    <div class="figura">
			      <div class="foto"> <img src="die.jpg" alt="Bluegrass" width="200" height="200" /></div>
			      <p>Figura 3: Cascada de agua espectacular. </p>
	    </div>
	    
	    <div class="figura">
			      <div class="foto"> <img src="die.jpg" alt="Leaves" width="200" height="200" /></div>
			      <p>Figura 4: <em>Ciervo en soledad</em>. </p>
	    </div>
	    
	    <div class="figura">
		      <div class="foto"> <img src="die.jpg" alt="Pattern Grass" width="200" height="200" /></div>
		      <p>Figura 5: Lago en calma. Espejo perfecto.</p>
	    </div>
	    
	    <div class="figura">
		      <div class="foto"> <img src="die.jpg" alt="Dandelion" width="200" height="200" /></div>
		      <p>Figura 6: Naturaleza bella. </p>
	    </div>
  </div>
</div>
</body>
</html>
