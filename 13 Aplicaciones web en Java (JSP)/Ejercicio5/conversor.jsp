<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="CSS/estilo.css">

	</head>

	<body>
		
		<h1>EL VALOR DE € A PESETAS ES : </h1><br>
		
		<%

		double euro = Integer.valueOf(request.getParameter("euro"));

		out.println(euro * 166.386 );

		%>


	</body>
	
</html>