<%@page import="java.util.HashMap"%>
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
            <input class="btn btn-default" value="LISTA DEPARTAMENTO" name="submit" type="button" onclick="window.location.href = 'listaDepartamento.jsp';" />
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input class="btn btn-default" value="PRINCIPAL" name="submit" type="button" onclick="window.location.href = 'index.jsp';" />
            <br><br>			
      
            <div>
                
                <div class="panel panel-default text-center"><h2>Lista empleados</h2></div>
                    
                <%
                      Class.forName("com.mysql.jdbc.Driver");
                      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root", "");
                      Statement s = conexion.createStatement();
                      ResultSet listado2 = s.executeQuery ("SELECT codigo, nombre FROM departamento");
                      
                
                    
                     
                     
                %>

                    <table class="table table-striped">
                        
                        <tr><th>Codigo</th>
                            <th>Nombre</th>
                            <th>Apellidos</th>
                            <th>Edad</th>
                            <th>Salario</th>
                            <th>Comisión</th>
                            <th>Departamento</th></tr>                       
                        
                        <form method="get" action="añadeEmpleado.jsp">
                            
                          <tr><td><input type="text" class="form-control" name="codigo" size="5"></td>
                              <td><input type="text" class="form-control" name="nombre" size="10"></td>
                              <td><input type="text" class="form-control" name="apellidos" size="15"></td>
                              <td><input type="text" class="form-control" name="edad" size="5"></td>
                              <td><input type="text" class="form-control" name="salario" size="15"></td>
                              <td><input type="text" class="form-control" name="comision" size="15"></td>
                              <td><select name="codigoDepartamento" class="btn btn-default">
                                      <%  
                                        while (listado2.next()) {
                                      %>
                                  <option value="<%=listado2.getString("codigo")%>"><%=listado2.getString("nombre")%>                                         
             
                                      <%
                                      }
                                      %>
                                  </select></td>
                              
                        
                              <td size="5"></td>
                              <td><button type="submit" value="Añadir" class="btn btn-default"><span class="glyphicon glyphicon-plus"></span> Añadir</button></td><td></td></tr>           
                        </form>
                       

                        <%
                          ResultSet listado = s.executeQuery ("SELECT empleado.*, departamento.nombre nomdep FROM empleado LEFT JOIN departamento on empleado.codigoDepartamento = departamento.codigo");

                          while (listado.next()) {
                            out.println("<tr><td>");
                            out.println(listado.getString("codigo") + "</td>");
                            out.println("<td>" + listado.getString("nombre") + "</td>");
                            out.println("<td>" + listado.getString("apellidos") + "</td>");
                            out.println("<td>" + listado.getString("edad") + "</td>");
                            out.println("<td>" + listado.getString("salario") + "</td>");
                            out.println("<td>" + listado.getString("comision") + "</td>");
                            out.println("<td>" + listado.getString("nomDep") + "</td>");
                            
                            
                            
                        %>
                        
                        <td>
                            
                            <form method="get" action="modificaEmpleado.jsp">

                              <input type="hidden" name="codigo" value="<%=listado.getString("codigo") %>">
                              <input type="hidden" name="nombre" value="<%=listado.getString("nombre") %>">
                              <input type="hidden" name="apellidos" value="<%=listado.getString("apellidos") %>">
                              <input type="hidden" name="edad" value="<%=listado.getString("edad") %>">
                              <input type="hidden" name="salario" value="<%=listado.getString("salario") %>">
                              <input type="hidden" name="comision" value="<%=listado.getString("comision") %>">
                              <input type="hidden" name="codigoDepartamento" value="<%=listado.getString("codigoDepartamento") %>">
                              <button type="submit"  class="btn btn-default"><span class=" glyphicon glyphicon-pencil"></span>  Modificar</button>
                            </form>
                        </td>
                        
                        <td>
                            
                            <form method="get" action="borrarEmpleado.jsp">
                                
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
