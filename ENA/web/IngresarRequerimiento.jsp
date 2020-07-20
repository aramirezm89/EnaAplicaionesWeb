<%-- 
    Document   : IngresarRequerimiento
    Created on : 19-07-2020, 20:08:16
    Author     : Antonio
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%@page import="BaseDatos.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
          <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
    <body>

        <header>
            <div class="card-panel teal lighten-2">
                <h1>Ingresar Requerimiento</h1>
            </div>
        </header>
        <div class="row">
            <form action="control.co" merthod="post">


                <div>






                    <label>Gerencia</label>
                    <select name="gerencia"  class="browser-default">

                        <%

                            Conexion cnn = new Conexion();

                            try {
                                String query = "select gerencia from REQ_gerencia";
                                cnn.Conectar();
                                PreparedStatement st = cnn.getConexion().prepareStatement(query);
                                ResultSet rs = st.executeQuery();
                                while (rs.next()) {

                        %>  


                        <option><%=rs.getString("gerencia")%></option>

                        <%}
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        %> 

                    </select>

                </div>



                <div>

                    <label>Departamento</label>
                    <select name="departamento" class="browser-default">
                        <%
                            try {
                                String query = "select departamento from REQ_gerencia";
                                cnn.Conectar();
                                PreparedStatement st = cnn.getConexion().prepareStatement(query);
                                ResultSet rs = st.executeQuery();
                                while (rs.next()) {

                        %>  
                        <option selected><%=rs.getString("departamento")%></option>  
                        <%}
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        %> 
                    </select>

                </div>


                <div>

                    <label>Asignar a:</label>
                    <select name="asignado" class="browser-default">
                        <%
                            try {
                                String query = "select asignado from REQ_gerencia";
                                cnn.Conectar();
                                PreparedStatement st = cnn.getConexion().prepareStatement(query);
                                ResultSet rs = st.executeQuery();
                                while (rs.next()) {

                        %> 
                        <option selected=""><%=rs.getString("asignado")%></option>  
                        <%}
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        %> 

                    </select>

                </div> 


                <div>

                    <label>Encargado:</label>
                    <select name="encargado" class="browser-default">
                        <%
                            try {
                                String query = "select encargado from REQ_gerencia";
                                cnn.Conectar();
                                PreparedStatement st = cnn.getConexion().prepareStatement(query);
                                ResultSet rs = st.executeQuery();
                                while (rs.next()) {

                        %> 
                        <option selected=""><%=rs.getString("encargado")%></option>  
                        <%}
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        %> 

                    </select>

                </div> 





                <div class="input-field col s12" >
                    <textarea class="materialize-textarea" name="requerimiento"  placeholder="requerimiento"></textarea>

                </div>





                <input type="reset" value="Borrar"class="waves-effect waves-light btn">
                <input type="submit" value="Enviar" class="waves-effect waves-light btn">

                </div>
            </form>



        </div>

    </div>

</body>
</html>
