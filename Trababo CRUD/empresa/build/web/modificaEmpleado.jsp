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
              <div class="panel panel-default text-center"><h3>Modificación de empleado</h3></div>
              <form method="get" action="añadeEmpleadoModificado.jsp">
                <div class="form-group"> 
                  <label>&nbsp;&nbsp;Codigo de empleado:&nbsp;</label><input type="text" class="form-control" size="5" name="codigo" value="<%= request.getParameter("codigo") %>" readonly>
                </div>
                <div class="form-group">
                <label>&nbsp;&nbsp;Nombre del empleado:&nbsp;</label><input type="text" class="form-control" size="35" name="nombre" value="<%= request.getParameter("nombre") %>">
                </div>
                <div class="form-group">
                 <label>&nbsp;&nbsp;Apellidos del empleado:&nbsp;</label><input type="text" class="form-control" size="35" name="apellidos" value="<%= request.getParameter("apellidos") %>">
                </div>
                <div class="form-group">
                 <label>&nbsp;&nbsp;Edad:&nbsp;</label><input type="text" class="form-control" size="5" name="edad" value="<%= request.getParameter("edad") %>">
                </div>
                <div class="form-group">
                 <label>&nbsp;&nbsp;Salario:&nbsp;</label><input type="text" class="form-control" name="salario" size="20" value="<%= request.getParameter("salario") %>">
                </div>
                <div class="form-group">
                 <label>&nbsp;&nbsp;Comision:&nbsp;</label><input type="text" class="form-control" name="comision" size="20" value="<%= request.getParameter("comision") %>">
                </div>
                <div class="form-group">
                 <label>&nbsp;&nbsp;CodigoDepartamento:&nbsp;</label><input type="text" class="form-control" name="codigoDepartamento" size="20" value="<%= request.getParameter("codigoDepartamento") %>">
                </div>
                <hr>
                &nbsp;&nbsp;<a href="listaEmpleado.jsp" class="btn btn-default">Cancelar  <span class="glyphicon glyphicon-remove"></span></a>
                <button type="submit" class="btn btn-default">Aceptar  <span class="glyphicon glyphicon-ok"></span></button><br><br>
              </form>

          </div>
        </div>
                
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>    
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>
