/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.controller;

import cl.model.Cliente;
import cl.model.ServicioLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Antonio
 */
@WebServlet(name = "Controller", urlPatterns = {"/control.co"})
public class Controller extends HttpServlet {

    @EJB
    private ServicioLocal servicio;

   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String bt = request.getParameter("bt");

        switch (bt) {
            case "1":
                guardar(request, response);
                break;
            case "2":
                eliminar(request, response);
                break;
            case "3":
                actualizar(request, response);
                break;
            case "4":
                buscar(request, response);
                break;
        }

    }

    protected void guardar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        Cliente c = new Cliente(rut, nombre, apellido);

        servicio.addCliente(c);

        response.sendRedirect("index.jsp");
    }

    protected void actualizar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");

        servicio.actualizar(rut, nombre, apellido);

        response.sendRedirect("index.jsp");
    }

    protected void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rut = request.getParameter("rut");
        servicio.eliminar(rut);

        response.sendRedirect("index.jsp");
    }

    protected void buscar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rut = request.getParameter("rut");
        Cliente c = servicio.buscar(rut);

        if (c == null) {
            request.setAttribute("msg", "<div class='chip'>Rut no encontrado<i class='close material-icons'>close</i></div>");
        } else {
            request.setAttribute("msg", "<div class='chip'>Cliente:" + c.getNombre() + " " + c.getApellido()+"<i class='close material-icons'>close</i></div>");
        }
        request.getRequestDispatcher("buscar.jsp").forward(request, response);

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
