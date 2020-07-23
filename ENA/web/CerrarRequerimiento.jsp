<%-- 
    Document   : CerrarRequerimiento
    Created on : 19-07-2020, 20:09:14
    Author     : Antonio
--%>

<%@page import="Modelo.Requerimiento"%>
<%@page import="BaseDatos.Conexion"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>

<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Mostrar datos</title>
    </head>
    <body>
        
  
                     
        <%  
           
            try {
                 Conexion cnn = new Conexion();

                
                       String query = "select * from REQ_requerimiento where estado = 'abierto'";
                       cnn.Conectar();
                       PreparedStatement st= cnn.getConexion().prepareStatement(query);
                       ResultSet rs = st.executeQuery();
       
        %>
          <header>
            <div class="card-panel teal lighten-2">
                <h1>Cerrar Requerimiento</h1>
                 <a href="Menu.jsp" class="btn-floating btn-large waves-effect  waves-light black">
            <i class="material-icons">home</i>
          </a>
            </div>
        </header>
          
          
               
             <select name="gerencia"  class="browser-default"  style=" width:225px">

                        <%
                              try{
                           
                                String query2 = "select distinct gerencia from REQ_requerimiento";
                                cnn.Conectar();
                                PreparedStatement st2 = cnn.getConexion().prepareStatement(query2);
                                ResultSet rs2 = st2.executeQuery();
                                while (rs2.next()) {

                        %>  
                           <option><%=rs2.getString("gerencia")%></option>

                        <%}   cnn.Desconectar();
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
                                String query2 = "select distinct departamento from REQ_requerimiento";
                                cnn.Conectar();
                                PreparedStatement st2 = cnn.getConexion().prepareStatement(query2);
                                ResultSet rs2 = st2.executeQuery();
                                while (rs2.next()) {
                                
                        %>  
                        <option selected><%=rs2.getString("departamento")%></option>  
                        <%} cnn.Desconectar();
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
                                String query2 = "select distinct asignado from REQ_requerimiento";
                                cnn.Conectar();
                                PreparedStatement st2 = cnn.getConexion().prepareStatement(query2);
                                ResultSet rs2 = st2.executeQuery();
                                while (rs2.next()) {

                        %> 
                        <option selected=""><%=rs2.getString("asignado")%></option>  
                        <%} cnn.Desconectar();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        %> 

                    </select>

                </div> 
 
   <%  while (rs.next()) { %>
          
        <form action="EditarEstado.co" merthod="post">
         
            <table class="striped" cellspacing="3" cellpadding="5" border="1" >
         
            <tr>
                <td>ID:</td>
                <td>Gerencia</td>
                <td>Departamento</td>
                <td>Asignado</td>
                <td>Encargado</td>
                <td>Requerimiento</td>
                <td>Estado</td>
              
                
               
            </tr>
 
          
           
            <tr>
                
                <td><font color="green"><input type="text" name="id" readonly="" value="<%=rs.getInt("id")%>" </font> </td>
                <td><font color="green"><input type="text" name="gerencia" readonly="" value="<%=rs.getString("gerencia")%>"</font></td>
                <td><font color="green"><input type="text" name="departamento" readonly="" value="<%=rs.getString("departamento")%>"</font></td>
                <td><font color="green"><input type="text" name="asignado" readonly="" value="<%=rs.getString("asignado")%>"</font></td>
                <td><font color="green"><input type="text" name="encargado" readonly="" value="<%=rs.getString("encargado")%>"</font></td>
                <td><font color="green"><input type="text" name="requerimiento" readonly="" value="<%=rs.getString("requerimiento")%>"</font></td>
                <td><font color="green"><input type="text" name="estado" readonly="" value="<%=rs.getString("estado")%>"</font></td>
              
                <td>
                    
                <input type="submit" value="Cerrar" class="waves-effect waves-light btn">  
                
            
                </td>
                
            </tr>
            
        </table>
 
           </form>

       
    <% } %>   
          

      
    <%
   cnn.Desconectar();
 }catch (Exception e) {
                e.printStackTrace();
            }
        %>

        
     
         
    </body>
</html>
    