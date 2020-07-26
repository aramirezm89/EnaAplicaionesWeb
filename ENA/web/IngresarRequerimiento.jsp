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
         <script type="text/javascript" src="js/script.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
    <body>

        <header>
            <div class="card-panel blue lighten-2">
                <h1>Ingresar Requerimiento</h1>
                <a href="Menu.jsp" class="btn-floating btn-large waves-effect  waves-light black">
                 <i class="material-icons">home</i>
                 </a>
            </div>
        </header>
        <div class="row">
            <form action="InsertarRequerimiento.co" method="post">


                <div>
                   <label>Gerencia</label>
                   <select name="gerencia"  class="browser-default" style=" width:225px" required>

                        <%

                            Conexion cnn = new Conexion();

                            try {
                                String query = "select distinct gerencia from REQ_gerencia";
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
                    <select name="departamento" class="browser-default" style=" width:225px" required>
                        <%
                            try {
                                String query = "select distinct departamento from REQ_gerencia";
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
                    <select name="asignado" class="browser-default" style=" width:225px" required>
                        <%
                            try {
                                String query = "select distinct asignado from REQ_gerencia";
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
                    <select name="encargado" class="browser-default" style=" width:225px" required>
                        <%
                            try {
                                String query = "select distinct  encargado from REQ_gerencia";
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
                    <textarea class="materialize-textarea" name="requerimiento"  placeholder="Ingrese su requerimiento" required></textarea>

                </div>





                <input type="reset" value="Borrar"class="waves-effect blue btn">
                <input type="submit" value="Guardar" class="waves-effect blue btn" onclick="Registrado()">

                </div>
               
                   ${msg}
            </form>

         

        </div>

    </div>

</body>
</html>
