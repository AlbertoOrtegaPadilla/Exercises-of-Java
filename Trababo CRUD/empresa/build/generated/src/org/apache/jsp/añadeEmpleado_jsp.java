package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class añadeEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class = \"panel panel-default\">\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        ");

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root", "");
            Statement s = conexion.createStatement();

            request.setCharacterEncoding("UTF-8");

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
        
      out.write("\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    <br>\n");
      out.write("    <a href=\"index.jsp\" class=\"btn btn-primary\"><span class=\"glyphicon glyphicon-home\"></span> Página principal</button>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
