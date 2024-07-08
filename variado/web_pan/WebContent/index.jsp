<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Warez</title>

<link rel="stylesheet" href="estilo.css"/>
</head>
<body>

<% if(11>10){ %>

<jsp:include page="opcUser.html"></jsp:include>
<% } %>

<h1 align="center"><span id="eltitulo">La Panaderia ZZ</span></h1>
 

        <nav id="navprincipal">
            <ul><!-- listas desordenadas , para ordenarlo ponemos ol-->
                <li>Quienes somos</li>
                <li>Misión</li>
                <li>Visión</li>
                <li>Contactanos</li>
                
            </ul>
        </nav>
        
        <nav id="cabezaLista">
        <header id="nombreLista">Lista de productos</header>
        	<ol>
        		<li class="objetos">Tortas</li>
                <li class="objetos">Panes</li>
                <li class="objetos">Bocaditos</li>
                <li class="objetos">Bebidas</li>
        	</ol>
        	
        	<img src="pete.gif" id="pitufo">
        </nav>
        
        <img src=fondoPan.jpg id="fotoFondo">

</body>
</html>