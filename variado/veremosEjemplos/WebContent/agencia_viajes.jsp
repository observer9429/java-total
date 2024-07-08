<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align:center">Agencia de viajes </h1>

<%

//valor por fefecto

String ciudad_favorita="Madrid";

Cookie[] lasCookies=request.getCookies();

//buscar las prefencias, ciudad favorita

if(lasCookies!=null){
	
	for(Cookie cookie_temporal: lasCookies){
		
		if("agencia_viajes.ciudad_favorita".equals(cookie_temporal.getName())){
			
			ciudad_favorita=cookie_temporal.getValue();
			
			break;
		}
	}
	
}

%>

<h3>Vuelos a <%= ciudad_favorita %></h3>

<p>eplo de texto</p>


</body>
</html>