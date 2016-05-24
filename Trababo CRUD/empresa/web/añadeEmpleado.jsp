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
        
        <br><br><br><br>
        
        <div class = "panel panel-default">
            <div class="panel-heading text-center">
        
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root", "");
                    Statement s = conexion.createStatement();

                    request.setCharacterEncoding("UTF-8");

                    try{
                        // Comprueba la existencia del número de socio introducido
                        String consultaNumEmpleado = "SELECT * FROM empleado WHERE codigo="
                                                  + Integer.valueOf(request.getParameter("codigo"));      

                        ResultSet numeroDeEmpleado = s.executeQuery (consultaNumEmpleado);
                        numeroDeEmpleado.last();

                        if (numeroDeEmpleado.getRow() != 0) {
                          out.println("Lo siento, no se ha podido dar de alta, ya existe un empleado con el codigo "
                                      + request.getParameter("codigo") + ".");
                        } else {


                                String insercion = "INSERT INTO empleado VALUES (" + Integer.valueOf(request.getParameter("codigo"))
                                             + ", '" + request.getParameter("nombre")
                                             + "', '" + request.getParameter("apellidos")
                                             + "', " + Integer.valueOf(request.getParameter("edad"))
                                             + ", " + Double.valueOf(request.getParameter("salario"))
                                             + ", " + Double.valueOf(request.getParameter("comision"))
                                             + ", " + Integer.valueOf(request.getParameter("codigoDepartamento")) + ")";

                          s.execute(insercion);

                          out.println("Empleado dado de alta correctamente.");

                        }
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
