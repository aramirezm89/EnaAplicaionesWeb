package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import BaseDatos.Conexion;
import Modelo.Requerimiento;
import java.util.ArrayList;

public final class ConsultarRequerimiento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"card-panel blue lighten-2\">\n");
      out.write("                <h1>Consultar Requerimiento</h1>\n");
      out.write("                <a href=\"Menu.jsp\" class=\"btn-floating btn-large waves-effect  waves-light black\">\n");
      out.write("                    <i class=\"material-icons\">home</i>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
ArrayList<Requerimiento> lista = (ArrayList<Requerimiento>) request.getAttribute("lista"); 
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"Filtro\" method=\"post\">\n");
      out.write("\n");
      out.write("            <select name=\"gerencia\"  class=\"browser-default\"  style=\" width:225px\">\n");
      out.write("\n");
      out.write("                ");


                    Conexion cnn = new Conexion();

                    try {
                        String query = "select distinct gerencia from REQ_requerimiento";
                        cnn.Conectar();
                        PreparedStatement st = cnn.getConexion().prepareStatement(query);
                        ResultSet rs = st.executeQuery();
                        while (rs.next()) {

                
      out.write("  \n");
      out.write("                <option>");
      out.print(rs.getString("gerencia"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                ");
}
                        cnn.Desconectar();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                
      out.write(" \n");
      out.write("\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("            <label>Departamento</label>\n");
      out.write("            <select name=\"departamento\" class=\"browser-default\" style=\" width:225px\">\n");
      out.write("                ");

                    try {
                        String query = "select distinct departamento from REQ_requerimiento";
                        cnn.Conectar();
                        PreparedStatement st = cnn.getConexion().prepareStatement(query);
                        ResultSet rs = st.executeQuery();
                        while (rs.next()) {

                
      out.write("  \n");
      out.write("                <option selected>");
      out.print(rs.getString("departamento"));
      out.write("</option>  \n");
      out.write("                ");
}
                        cnn.Desconectar();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                
      out.write(" \n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("            <label>Asignar a:</label>\n");
      out.write("            <select name=\"asignado\" class=\"browser-default \" style=\" width:225px\">\n");
      out.write("                ");

                    try {
                        String query = "select distinct asignado from REQ_requerimiento";
                        cnn.Conectar();
                        PreparedStatement st = cnn.getConexion().prepareStatement(query);
                        ResultSet rs = st.executeQuery();
                        while (rs.next()) {

                
      out.write(" \n");
      out.write("                <option selected=\"\">");
      out.print(rs.getString("asignado"));
      out.write("</option>  \n");
      out.write("                ");
}
                        cnn.Desconectar();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                
      out.write(" \n");
      out.write("\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"Buscar\" class=\"waves-effect blue btn\" onclick=\"Registrado()\">\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <table class=\"striped\">\n");
      out.write("        <tr>\n");
      out.write("            <td>ID</td> \n");
      out.write("            <td>Gerencia</td>\n");
      out.write("            <td>Departamento</td>\n");
      out.write("            <td>Asignado</td>\n");
      out.write("            <td>Encargado</td>\n");
      out.write("            <td>Requerimiento</td>\n");
      out.write("            <td>Estado</td>\n");
      out.write("\n");
      out.write("        </tr>  \n");
      out.write("\n");
      out.write("        ");

            for (Requerimiento elemento : lista) {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(elemento.getId());
      out.write("</td> \n");
      out.write("            <td>");
      out.print(elemento.getGerencia());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(elemento.getDepartamento());
      out.write("</td> \n");
      out.write("            <td>");
      out.print(elemento.getAsignado());
      out.write("</td> \n");
      out.write("            <td>");
      out.print(elemento.getEncargado());
      out.write("</td> \n");
      out.write("            <td>");
      out.print(elemento.getRequerimiento());
      out.write("</td> \n");
      out.write("            <td>");
      out.print(elemento.getEstado());
      out.write("</td> \n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </table>  \n");
      out.write("   \n");
      out.write("        \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
