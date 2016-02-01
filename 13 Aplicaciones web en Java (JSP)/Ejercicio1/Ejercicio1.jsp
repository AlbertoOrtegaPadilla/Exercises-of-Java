<%-- EJERCICIO 1 aplicación web en Java que muestre tu nombre y tus datos personales por pantalla. --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	</head>

	<body>
		<%= "<b><i>" %> Alberto Ortega Padilla <%= "</b></i>" %>
		<br>

		<%= "<i>" %> 09/11/1990 <%= "</b>" %>
		<br>

		<%= "<b>" %> Nacionalidad: <%= "</b>" %><%= "<i>" %> Española <%= "</i>" %>
	</body>
	
</html>