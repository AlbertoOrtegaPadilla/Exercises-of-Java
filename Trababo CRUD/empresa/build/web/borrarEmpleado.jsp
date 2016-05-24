<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root", "");
      Statement s = conexion.createStatement();

      s.execute ("DELETE FROM empleado WHERE codigo=" + request.getParameter("codigo"));
      
      s.close();
    %>	
    <script>document.location = "listaEmpleado.jsp"</script> 
    </body>
</html>
