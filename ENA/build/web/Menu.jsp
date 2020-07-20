<%-- 
    Document   : Menu
    Created on : 19-07-2020, 19:20:38
    Author     : Antonio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
    <body>
        <header class="card-panel teal lighten-2">
            <h1>Menu Principal</h1> 
        </header>
        <div>
            <a href="IngresarRequerimiento.jsp" class="waves-effect waves-light btn"> Ingresar Requerimiento
                <i class="material-icons">arrow_forward</i> 
            </a>
        </div>

        <div>
            <a href="ConsultarRequerimiento.jsp" class="waves-effect waves-light btn"> Consultar Requerimiento
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
