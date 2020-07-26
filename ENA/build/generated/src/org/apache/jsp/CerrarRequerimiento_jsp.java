package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Requerimiento;
import BaseDatos.Conexion;
import java.sql.*;

public final class CerrarRequerimiento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=ISO-8859-1");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Mostrar datos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("  \n");
      out.write("                     \n");
      out.write("        ");
  
           
            try {
                 Conexion cnn = new Conexion();

                
                       String query = "select * from REQ_requerimiento where estado = 'abierto'";
                       cnn.Conectar();
                       PreparedStatement st= cnn.getConexion().prepareStatement(query);
                       ResultSet rs = st.executeQuery();
       
        
      out.write("\n");
      out.write("          <header>\n");
      out.write("            <div class=\"card-panel blue lighten-2\">\n");
      out.write("                <h1>Cerrar Requerimiento</h1>\n");
      out.write("                 <a href=\"Menu.jsp\" class=\"btn-floating btn-large waves-effect  waves-light black\">\n");
      out.write("            <i class=\"material-icons\">home</i>\n");
      out.write("          </a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("               \n");
      out.write("             <select name=\"gerencia\"  class=\"browser-default\"  style=\" width:225px\">\n");
      out.write("\n");
      out.write("                        ");

                              try{
                           
                                String query2 = "select distinct gerencia from REQ_requerimiento";
                                cnn.Conectar();
                                PreparedStatement st2 = cnn.getConexion().prepareStatement(query2);
                                ResultSet rs2 = st2.executeQuery();
                                while (rs2.next()) {

                        
      out.write("  \n");
      out.write("                           <option>");
      out.print(rs2.getString("gerencia"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                        ");
}   cnn.Desconectar();
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
      out.write("                    <select name=\"departamento\" class=\"browser-default\" style=\" width:225px\">\n");
      out.write("                        ");

                            try {
                                String query2 = "select distinct departamento from REQ_requerimiento";
                                cnn.Conectar();
                                PreparedStatement st2 = cnn.getConexion().prepareStatement(query2);
                                ResultSet rs2 = st2.executeQuery();
                                while (rs2.next()) {
                                
                        
      out.write("  \n");
      out.write("                        <option selected>");
      out.print(rs2.getString("departamento"));
      out.write("</option>  \n");
      out.write("                        ");
} cnn.Desconectar();
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
      out.write("                    <select name=\"asignado\" class=\"browser-default \" style=\" width:225px\">\n");
      out.write("                        ");

                            try {
                                String query2 = "select distinct asignado from REQ_requerimiento";
                                cnn.Conectar();
                                PreparedStatement st2 = cnn.getConexion().prepareStatement(query2);
                                ResultSet rs2 = st2.executeQuery();
                                while (rs2.next()) {

                        
      out.write(" \n");
      out.write("                        <option selected=\"\">");
      out.print(rs2.getString("asignado"));
      out.write("</option>  \n");
      out.write("                        ");
} cnn.Desconectar();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        
      out.write(" \n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                </div> \n");
      out.write(" \n");
      out.write("   ");
  while (rs.next()) { 
      out.write("\n");
      out.write("          \n");
      out.write("        <form action=\"EditarEstado.co\" method=\"post\">\n");
      out.write("         \n");
      out.write("            <table class=\"striped\" cellspacing=\"3\" cellpadding=\"5\" border=\"1\" >\n");
      out.write("         \n");
      out.write("            <tr>\n");
      out.write("                <td>ID:</td>\n");
      out.write("                <td>Gerencia</td>\n");
      out.write("                <td>Departamento</td>\n");
      out.write("                <td>Asignado</td>\n");
      out.write("                <td>Encargado</td>\n");
      out.write("                <td>Requerimiento</td>\n");
      out.write("                <td>Estado</td>\n");
      out.write("              \n");
      out.write("                \n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write(" \n");
      out.write("          \n");
      out.write("           \n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td><font color=\"green\"><input type=\"text\" name=\"id\" readonly=\"\" value=\"");
      out.print(rs.getInt("id"));
      out.write("\" </font> </td>\n");
      out.write("                <td><font color=\"green\"><input type=\"text\" name=\"gerencia\" readonly=\"\" value=\"");
      out.print(rs.getString("gerencia"));
      out.write("\"</font></td>\n");
      out.write("                <td><font color=\"green\"><input type=\"text\" name=\"departamento\" readonly=\"\" value=\"");
      out.print(rs.getString("departamento"));
      out.write("\"</font></td>\n");
      out.write("                <td><font color=\"green\"><input type=\"text\" name=\"asignado\" readonly=\"\" value=\"");
      out.print(rs.getString("asignado"));
      out.write("\"</font></td>\n");
      out.write("                <td><font color=\"green\"><input type=\"text\" name=\"encargado\" readonly=\"\" value=\"");
      out.print(rs.getString("encargado"));
      out.write("\"</font></td>\n");
      out.write("                <td><font color=\"green\"><input type=\"text\" name=\"requerimiento\" readonly=\"\" value=\"");
      out.print(rs.getString("requerimiento"));
      out.write("\"</font></td>\n");
      out.write("                <td><font color=\"green\"><input type=\"text\" name=\"estado\" readonly=\"\" value=\"");
      out.print(rs.getString("estado"));
      out.write("\"</font></td>\n");
      out.write("              \n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                <input type=\"submit\" value=\"Cerrar\" class=\"waves-effect blue btn\">  \n");
      out.write("                \n");
      out.write("              \n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write(" \n");
      out.write("           </form>\n");
      out.write("\n");
      out.write("       \n");
      out.write("    ");
 } 
      out.write("   \n");
      out.write("          \n");
      out.write("\n");
      out.write("      \n");
      out.write("    ");

   cnn.Desconectar();
 }catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("     \n");
      out.write("         \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    ");
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
