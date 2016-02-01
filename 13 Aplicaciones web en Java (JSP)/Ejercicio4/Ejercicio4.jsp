<%-- EJERCICIO 4 aplicación que calcule la media de tres notas  --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="CSS/estilo.css">

	</head>

	<body>
		<form method="get" action="resultado.jsp">
			
			Matemáticas: <input type="text" name="mate"/></br>
			Lengua: <input type="text" name="leng"/></br>
			Filosofia: <input type="text" name="filo"/></br>
			<input type="submit">

		</form>

	</body>
	
</html>