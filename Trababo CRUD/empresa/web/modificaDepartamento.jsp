<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div class="container">
          <br><br>
          <div class="">
              <div class="panel panel-default text-center"><h3>Modificación del departamento</h3></div>
              <form method="get" action="añadeDepartamentoModificado.jsp">
                <div class="form-group"> 
                  <label>&nbsp;&nbsp;Codigo del departamento:&nbsp;</label><input type="text" class="form-control" size="5" name="codigo" value="<%= request.getParameter("codigo") %>" readonly>
                </div>
                <div class="form-group">
                <label>&nbsp;&nbsp;Nombre del departamento:&nbsp;</label><input type="text" class="form-control" size="35" name="nombre" value="<%= request.getParameter("nombre") %>">
                </div>
                
                <hr>
                &nbsp;&nbsp;<a href="listaDepartamento.jsp" class="btn btn-default">Cancelar  <span class="glyphicon glyphicon-remove"></span></a>
                <button type="submit" class="btn btn-default">Aceptar  <span class="glyphicon glyphicon-ok"></span></button><br><br>
              </form>

          </div>
        </div>
                
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>    
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>

