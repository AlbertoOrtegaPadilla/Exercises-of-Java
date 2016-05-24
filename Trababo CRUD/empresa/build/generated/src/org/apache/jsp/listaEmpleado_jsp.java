package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class listaEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <input class=\"btn btn-default\" value=\"LISTA DEPARTAMENTO\" name=\"submit\" type=\"button\" onclick=\"window.location.href = 'listaDepartamento.jsp';\" />\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <input class=\"btn btn-default\" value=\"PRINCIPAL\" name=\"submit\" type=\"button\" onclick=\"window.location.href = 'index.jsp';\" />\n");
      out.write("            <br><br>\t\t\t\n");
      out.write("      \n");
      out.write("            <div>\n");
      out.write("                \n");
      out.write("                <div class=\"panel panel-default text-center\"><h2>Lista empleados</h2></div>\n");
      out.write("                    \n");
      out.write("                ");

                      Class.forName("com.mysql.jdbc.Driver");
                      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root", "");
                      Statement s = conexion.createStatement();
                      ResultSet listado2 = s.executeQuery ("SELECT codigo, nombre FROM departamento");
                      
                
                    
                     
                     
                
      out.write("\n");
      out.write("\n");
      out.write("                    <table class=\"table table-striped\">\n");
      out.write("                        \n");
      out.write("                        <tr><th>Codigo</th>\n");
      out.write("                            <th>Nombre</th>\n");
      out.write("                            <th>Apellidos</th>\n");
      out.write("                            <th>Edad</th>\n");
      out.write("                            <th>Salario</th>\n");
      out.write("                            <th>Comisión</th>\n");
      out.write("                            <th>Codigo departamento</th>\n");
      out.write("                            <th>Nombre departamento</th></tr>                       \n");
      out.write("                        \n");
      out.write("                        <form method=\"get\" action=\"añadeEmpleado.jsp\">\n");
      out.write("                            \n");
      out.write("                          <tr><td><input type=\"text\" class=\"form-control\" name=\"codigo\" size=\"5\"></td>\n");
      out.write("                              <td><input type=\"text\" class=\"form-control\" name=\"nombre\" size=\"10\"></td>\n");
      out.write("                              <td><input type=\"text\" class=\"form-control\" name=\"apellidos\" size=\"15\"></td>\n");
      out.write("                              <td><input type=\"text\" class=\"form-control\" name=\"edad\" size=\"5\"></td>\n");
      out.write("                              <td><input type=\"text\" class=\"form-control\" name=\"salario\" size=\"15\"></td>\n");
      out.write("                              <td><input type=\"text\" class=\"form-control\" name=\"comision\" size=\"15\"></td>\n");
      out.write("                              <td><select>\n");
      out.write("                                      ");
  
                                        while (listado2.next()) {
                                      
      out.write("\n");
      out.write("                                  <option value=\"");
      out.print(listado2.getString("codigo"));
      out.write('"');
      out.write('>');
      out.print(listado2.getString("nombre"));
      out.write("                                         \n");
      out.write("             \n");
      out.write("                                      ");

                                      }
                                      
      out.write("\n");
      out.write("                                  </select></td>\n");
      out.write("                              \n");
      out.write("                        \n");
      out.write("                              <td size=\"5\"></td>\n");
      out.write("                              <td><button type=\"submit\" value=\"Añadir\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-plus\"></span> Añadir</button></td><td></td></tr>           \n");
      out.write("                        </form>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                        ");

                          ResultSet listado = s.executeQuery ("SELECT empleado.*, departamento.nombre nomdep FROM empleado LEFT JOIN departamento on empleado.codigoDepartamento = departamento.codigo");

                          while (listado.next()) {
                            out.println("<tr><td>");
                            out.println(listado.getString("codigo") + "</td>");
                            out.println("<td>" + listado.getString("nombre") + "</td>");
                            out.println("<td>" + listado.getString("apellidos") + "</td>");
                            out.println("<td>" + listado.getString("edad") + "</td>");
                            out.println("<td>" + listado.getString("salario") + "</td>");
                            out.println("<td>" + listado.getString("comision") + "</td>");
                            out.println("<td>" + listado.getString("codigoDepartamento") + "</td>");
                            out.println("<td>" + listado.getString("nomDep") + "</td>");
                            
                            
                            
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        <td>\n");
      out.write("                            \n");
      out.write("                            <form method=\"get\" action=\"modificaEmpleado.jsp\">\n");
      out.write("\n");
      out.write("                              <input type=\"hidden\" name=\"codigo\" value=\"");
      out.print(listado.getString("codigo") );
      out.write("\">\n");
      out.write("                              <input type=\"hidden\" name=\"nombre\" value=\"");
      out.print(listado.getString("nombre") );
      out.write("\">\n");
      out.write("                              <input type=\"hidden\" name=\"apellidos\" value=\"");
      out.print(listado.getString("apellidos") );
      out.write("\">\n");
      out.write("                              <input type=\"hidden\" name=\"edad\" value=\"");
      out.print(listado.getString("edad") );
      out.write("\">\n");
      out.write("                              <input type=\"hidden\" name=\"salario\" value=\"");
      out.print(listado.getString("salario") );
      out.write("\">\n");
      out.write("                              <input type=\"hidden\" name=\"comision\" value=\"");
      out.print(listado.getString("comision") );
      out.write("\">\n");
      out.write("                              <input type=\"hidden\" name=\"codigoDepartamento\" value=\"");
      out.print(listado.getString("codigoDepartamento") );
      out.write("\">\n");
      out.write("                              <button type=\"submit\"  class=\"btn btn-default\"><span class=\" glyphicon glyphicon-pencil\"></span>  Modificar</button>\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                        <td>\n");
      out.write("                            \n");
      out.write("                            <form method=\"get\" action=\"borrarEmpleado.jsp\">\n");
      out.write("                                \n");
      out.write("                              <input type=\"hidden\" name=\"codigo\" value=\"");
      out.print(listado.getString("codigo") );
      out.write("\"/>\n");
      out.write("                              <button type=\"submit\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-trash\"></span>  Eliminar</button>\n");
      out.write("                            </form>\n");
      out.write("                              \n");
      out.write("                        </td>\n");
      out.write("                    \n");
      out.write("                        ");

                          } // while   

                          conexion.close();
                        
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                <div class=\"text-center\">&copy; Alberto Ortega Padilla</div>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("       <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>    \n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
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
