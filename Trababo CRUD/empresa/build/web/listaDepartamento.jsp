<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

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
            
            <input class="btn btn-default" value="LISTA EMPLEADO" name="submit" type="button" onclick="window.location.href = 'listaEmpleado.jsp';" />
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input class="btn btn-default" value="PRINCIPAL" name="submit" type="button" onclick="window.location.href = 'index.jsp';" />
            <br><br>			
      
            <div class="">
                
                <div class="panel panel-default text-center"><h2>Lista de departamentos</h2></div>
                    
                <%
                      Class.forName("com.mysql.jdbc.Driver");
                      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root", "");
                      Statement s = conexion.createStatement();

                      ResultSet listado = s.executeQuery ("SELECT * FROM departamento ");
                    %>

                    <table class="table table-striped">
                        
                        <tr><th> Codigo </th>
                            <th> Nombre </th></tr>
                        
                        <form></form>
                        <form method="get" action="añadeDepartamento.jsp">
                            
                                <tr><td><input type="text" class="form-control" name="codigo" size="5"></td>
                                <td><input type="text" class="form-control" name="nombre" size="10"></td>
                                
                                <td><button type="submit" value="Añadir" class="btn btn-default"><span class="glyphicon glyphicon-plus"></span> Añadir</button></td></tr>           
                        </form>

                        <%
                          while (listado.next()) {
                            out.println("<tr>");
                            out.println("<td>" + listado.getString("codigo") + "</td>");
                            out.println("<td>" + listado.getString("nombre") + "</td>");
                            out.println("<td></td><td></td>");
                            out.println("<td></td><td></td>");
                            out.println("<td></td><td></td>");
                            


                            
                        %>
                       
                        <td>
                            
                            <form method="get" action="modificaDepartamento.jsp">

                              <input type="hidden" name="codigo" value="<%=listado.getString("codigo") %>">
                              <input type="hidden" name="nombre" value="<%=listado.getString("nombre") %>">                         
                              <button type="submit"  class="btn btn-default"><span class=" glyphicon glyphicon-pencil"></span>  Modificar</button>
                            </form>
                              
                            
                        </td>
                        
                        <td>
                            
                            <form method="get" action="borrarDepartamento.jsp">
                                
                              <input type="hidden" name="codigo" value="<%=listado.getString("codigo") %>"/>
                              <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-trash"></span>  Eliminar</button>
                            </form>
                              
                        </td>
                    
                        <%
                          } // while   

                          conexion.close();
                        %>

                    </table>
                </div>
                
                <br>
                <div class="text-center">&copy; Alberto Ortega Padilla</div>
                <br>
            </div>
        
       <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>    
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>
