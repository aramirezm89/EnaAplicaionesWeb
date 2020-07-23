<%-- 
    Document   : Menu
    Created on : 19-07-2020, 19:20:38
    Author     : Antonio
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
         <script type="text/javascript" src="js/script.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
    <body onload="bienvenida()">
        
        <header class="card-panel teal lighten-2">
            <h1>Menu Principal</h1> 
        </header>
        <div>
            <a href="IngresarRequerimiento.jsp" class="waves-effect waves-light btn"> Ingresar Requerimiento
                <i class="material-icons">arrow_forward</i> 
            </a>
        </div>

        <div>
            <a href="Consulta" class="waves-effect waves-light btn"> Consultar Requerimiento
                <i class="material-icons">arrow_forward</i>
            </a>

        </div>

        <div>
            <a href="CerrarRequerimiento.jsp" class="waves-effect waves-light btn"> Cerrar Requerimiento
                <i class="material-icons">arrow_forward</i>
            </a>
        </div>
    </body>
</html>
