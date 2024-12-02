<%--
  Created by IntelliJ IDEA.
  User: Estudiante
  Date: 2/12/2024
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Variables</title>
</head>
<body>
<h1>Mostrar Informacion</h1>
<br>
variables en el alcance request: ${mensaje};
<br>
variable en el alcance de seccion
<br>
Rectangulo
<br>
Base: ${rectangulo.base}
<br>
Altura: ${rectangulo.altura}
<br>
Area: ${rectangulo.area}
<br>
Perimetro: ${rectangulo.getArea()}
<br>
<br>
<a href="${pageContext.request.contextPath}/index.jsp">Ir al inicio </a>
</body>
</html>
