//esto apra agregar la clase, como importar, podemos prescindir de pildorasinformaticas. y
poder llamar a la clase defrente
<%@ page import="pildorasinformaticas.Calculos" %>

o
<%@ page import="pildorasinformaticas.*" %>
<html>

<body>


La suma de 5 y 7 es: <%=pildorasinformaticas.Calculos.metodoSuma(5, 7) %>
<br>La suma de 5 y 7 es: <%= Calculos.metodoSuma(5, 7) %>

</body>


</html>