<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="CSS/estilo.css">

	</head>

	<body>
		<% request.setCharacterEncoding("UTF-8"); %> <h1>Hola<h1> <% out.print(request.getParameter("nombre")); %>
	</body>
	
</html>