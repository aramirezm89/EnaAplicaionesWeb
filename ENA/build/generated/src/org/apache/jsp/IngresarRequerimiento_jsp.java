package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.*;
import BaseDatos.Conexion;

public final class IngresarRequerimiento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("    </head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <div class=\"card-panel teal lighten-2\">\n");
      out.write("                <h1>Ingresar Requerimiento</h1>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <form action=\"control.co\" merthod=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <label>Gerencia</label>\n");
      out.write("                    <select name=\"gerencia\"  class=\"browser-default\">\n");
      out.write("\n");
      out.write("                        ");


                            Conexion cnn = new Conexion();

                            try {
                                String query = "select gerencia from REQ_gerencia";
                                cnn.Conectar();
                                PreparedStatement st = cnn.getConexion().prepareStatement(query);
                                ResultSet rs = st.executeQuery();
                                while (rs.next()) {

                        
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("                        <option>");
      out.print(rs.getString("gerencia"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                        ");
}
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        
      out.write(" \n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("\n");
      out.write("                    <label>Departamento</label>\n");
      out.write("                    <select name=\"departamento\" class=\"browser-default\">\n");
      out.write("                        ");

                            try {
                                String query = "select departamento from REQ_gerencia";
                                cnn.Conectar();
                                PreparedStatement st = cnn.getConexion().prepareStatement(query);
                                ResultSet rs = st.executeQuery();
                                while (rs.next()) {

                        
      out.write("  \n");
      out.write("                        <option selected>");
      out.print(rs.getString("departamento"));
      out.write("</option>  \n");
      out.write("                        ");
}
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        
      out.write(" \n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("\n");
      out.write("                    <label>Asignar a:</label>\n");
      out.write("                    <select name=\"asignado\" class=\"browser-default\">\n");
      out.write("                        ");

                            try {
                                String query = "select asignado from REQ_gerencia";
                                cnn.Conectar();
                                PreparedStatement st = cnn.getConexion().prepareStatement(query);
                                ResultSet rs = st.executeQuery();
                                while (rs.next()) {

                        
      out.write(" \n");
      out.write("                        <option selected=\"\">");
      out.print(rs.getString("asignado"));
      out.write("</option>  \n");
      out.write("                        ");
}
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        
      out.write(" \n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("\n");
      out.write("                    <label>Encargado:</label>\n");
      out.write("                    <select name=\"encargado\" class=\"browser-default\">\n");
      out.write("                        ");

                            try {
                                String query = "select encargado from REQ_gerencia";
                                cnn.Conectar();
                                PreparedStatement st = cnn.getConexion().prepareStatement(query);
                                ResultSet rs = st.executeQuery();
                                while (rs.next()) {

                        
      out.write(" \n");
      out.write("                        <option selected=\"\">");
      out.print(rs.getString("encargado"));
      out.write("</option>  \n");
      out.write("                        ");
}
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        
      out.write(" \n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"input-field col s12\" >\n");
      out.write("                    <textarea class=\"materialize-textarea\" name=\"requerimiento\"  placeholder=\"requerimiento\"></textarea>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <input type=\"reset\" value=\"Borrar\"class=\"waves-effect waves-light btn\">\n");
      out.write("                <input type=\"submit\" value=\"Enviar\" class=\"waves-effect waves-light btn\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
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
