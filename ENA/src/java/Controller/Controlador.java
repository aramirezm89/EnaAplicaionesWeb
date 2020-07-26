/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import BaseDatos.Conexion;
import static java.lang.System.out;

/**
 *
 * @author Antonio
 */
@WebServlet(name = "Controlador", urlPatterns = {"/control.co"})
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String usuario = request.getParameter("user");
        String contraseña = request.getParameter("pass");

        Conexion cnn = new Conexion();
        try {
            String query = "select * from REQ_usuarios where usuario = ? && contraseña = ?";
            cnn.Conectar();
            PreparedStatement st = cnn.getConexion().prepareStatement(query);
            st.setString(1, usuario);
            st.setString(2, contraseña);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                request.setAttribute("msg", "<div class='chip'>Bienvenido al sistema<i class='close material-icons'>close</i></div>"); 
                request.getRequestDispatcher("/Menu.jsp").forward(request, response);
               
            } else {

                request.getRequestDispatcher("/ErrorLogin.jsp").forward(request, response);
            }

        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
