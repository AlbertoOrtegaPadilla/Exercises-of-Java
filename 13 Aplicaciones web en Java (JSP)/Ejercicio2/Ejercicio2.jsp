<%-- EJERCICIO 2 programa anterior de tal forma que la apariencia de la página web que muestra
el navegador luzca más bonita mediante la utilización de CSS  --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="estilos.css">

	</head>

	<body>
		<%= "<b><i>" %> Alberto Ortega Padilla <%= "</b></i>" %>
		<br>

		<%= "<i>" %> 09/11/1990 <%= "</b>" %>
		<br>

		<%= "<b>" %> Nacionalidad: <%= "</b>" %><%= "<i>" %> Española <%= "</i>" %>
	</body>
	
</html>