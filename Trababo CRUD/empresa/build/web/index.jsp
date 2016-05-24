<%-- 
    Document   : index
    Created on : 23-may-2016, 18:54:11
    Author     : K
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        
        <br><br><br>
        <div class="panel panel-default">
            <div class="panel-heading text-center"><h1>CUALITAS</h1></div>
               <div class="panel-body text-center">
                 
                 <h3>Listado Emplado:</h3>     
                 <input class="btn btn-default" value="EMPLEADO" name="submit" type="button" onclick="window.location.href = 'listaEmpleado.jsp';" />
                 
                 <br><hr>
                 
                 <h3>Listado Departamento:</h3>
                 <input class="btn btn-default" value="DEPARTAMENTO" name="submit" type="button" onclick="window.location.href = 'listaDepartamento.jsp';" />
                 
                 <br><br>
               </div>
        </div>
        
        <br>
        
        <div class="text-center">&copy; Alberto Ortega Padilla</div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>    
        <script src="js/bootstrap.min.js"></script>    
    </body>
</html>
