<%-- 
    Document   : ConsultarRequerimiento
    Created on : 19-07-2020, 20:08:46
    Author     : Antonio
--%>

<%@page import="java.sql.*"%>
<%@page import="BaseDatos.Conexion"%>
<%@page import="Modelo.Requerimiento"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
    <body>
        <header>
            <div class="card-panel blue lighten-2">
                <h1>Consultar Requerimiento</h1>
                <a href="Menu.jsp" class="btn-floating btn-large waves-effect  waves-light black">
                    <i class="material-icons">home</i>
                </a>
            </div>
        </header>



        <%ArrayList<Requerimiento> lista = (ArrayList<Requerimiento>) request.getAttribute("lista"); %> 



        <form action="Filtro" method="post">

            <select name="gerencia"  class="browser-default"  style=" width:225px">

                <%

                    Conexion cnn = new Conexion();

                    try {
                        String query = "select distinct gerencia from REQ_requerimiento";
                        cnn.Conectar();
                        PreparedStatement st = cnn.getConexion().prepareStatement(query);
                        ResultSet rs = st.executeQuery();
                        while (rs.next()) {

                %>  
                <option><%=rs.getString("gerencia")%></option>

                <%}
                        cnn.Desconectar();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %> 

            </select>

        </div>



        <div>

            <label>Departamento</label>
            <select name="departamento" class="browser-default" style=" width:225px">
                <%
                    try {
                        String query = "select distinct departamento from REQ_requerimiento";
                        cnn.Conectar();
                        PreparedStatement st = cnn.getConexion().prepareStatement(query);
                        ResultSet rs = st.executeQuery();
                        while (rs.next()) {

                %>  
                <option selected><%=rs.getString("departamento")%></option>  
                <%}
                        cnn.Desconectar();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %> 
            </select>

        </div>


        <div>

            <label>Asignar a:</label>
            <select name="asignado" class="browser-default " style=" width:225px">
                <%
                    try {
                        String query = "select distinct asignado from REQ_requerimiento";
                        cnn.Conectar();
                        PreparedStatement st = cnn.getConexion().prepareStatement(query);
                        ResultSet rs = st.executeQuery();
                        while (rs.next()) {

                %> 
                <option selected=""><%=rs.getString("asignado")%></option>  
                <%}
                        cnn.Desconectar();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %> 

            </select>

        </div> 

        <input type="submit" value="Buscar" class="waves-effect blue btn" onclick="Registrado()">

    </form>

    <table class="striped">
        <tr>
            <td>ID</td> 
            <td>Gerencia</td>
            <td>Departamento</td>
            <td>Asignado</td>
            <td>Encargado</td>
            <td>Requerimiento</td>
            <td>Estado</td>

        </tr>  

        <%
            for (Requerimiento elemento : lista) {
        %>
        <tr>
            <td><%=elemento.getId()%></td> 
            <td><%=elemento.getGerencia()%></td>
            <td><%=elemento.getDepartamento()%></td> 
            <td><%=elemento.getAsignado()%></td> 
            <td><%=elemento.getEncargado()%></td> 
            <td><%=elemento.getRequerimiento()%></td> 
            <td><%=elemento.getEstado()%></td> 
        </tr>

        <%
            }
        %>

    </table>  
   
        
</body>
</html>

