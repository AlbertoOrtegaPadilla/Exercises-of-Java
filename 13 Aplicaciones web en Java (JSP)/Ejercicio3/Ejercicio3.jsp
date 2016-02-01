<%-- EJERCICIO 3 aplicación que pida tu nombre. A continuación mostrará “Hola” seguido del
nombre introducido. El nombre se deberá recoger mediante un formulario --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="CSS/estilo.css">

	</head>

	<body>

	<form method="post" action="hola.jsp">

      ¿Nombre? 

      <input type="text" name="nombre">

      <input type="submit" value="OK">

    </form>

	</body>
	
</html>