<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="CSS/estilo.css">

	</head>

	<body>
		
		<h1>LA MEDIA ES: </h1><br>
		
		<%

		int primerNumero = Integer.valueOf(request.getParameter("mate"));
		int segundoNumero = Integer.valueOf(request.getParameter("leng"));
		int tercerNumero = Integer.valueOf(request.getParameter("filo"));
		out.println((primerNumero + segundoNumero + tercerNumero) / 3 );

		%>


	</body>
	
</html>