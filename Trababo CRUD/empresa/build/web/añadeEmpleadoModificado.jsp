<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        
    </head>
    <body>
        
        <br><br><br><br>
        
        <div class = "panel panel-default">
            <div class="panel-heading text-center">
                
            
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root", "");
                    Statement s = conexion.createStatement();

                    request.setCharacterEncoding("UTF-8");
                      try{
                            String actualizacion = "UPDATE empleado SET "
                                                 + "nombre='" + request.getParameter("nombre")
                                                 + "',apellidos='" + request.getParameter("apellidos")
                                                 + "', edad=" + Integer.valueOf(request.getParameter("edad"))
                                                 + ", salario=" + Double.valueOf(request.getParameter("salario"))
                                                 + ", comision=" + Double.valueOf(request.getParameter("comision"))
                                                 + ", codigoDepartamento=" + Integer.valueOf(request.getParameter("codigoDepartamento"))
                                                 + " WHERE codigo=" + Integer.valueOf(request.getParameter("codigo"));
                            s.execute(actualizacion);

                            out.println("Empleado actualizado correctamente.");

                            conexion.close();
                        }catch (Exception e){
                            out.print("\"ERROR\": " + e.getMessage());
                            }
                %>
            </div>
        </div>
            
        <br>
        
        <div style="text-align:center; width:600px; margin:auto;">
             
            <input class="btn btn-default" value="Pagina Empleado" name="submit" type="button" onclick="window.location.href = 'listaEmpleado.jsp';" />
        </div>
   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>    
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>
