<%-- 
    Document   : Login
    Created on : 19-07-2020, 17:31:57
    Author     : Antonio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>
        <link rel="stylesheet" href="css/estilos.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
    <body>
     
            <div class="row">
            <div class="col s6 offset-s3" >
                <div class="card-panel z-depth-5" >
       <header>
                <div class="card-panel teal lighten-2">
                    <h1>Ingrese Uuario y contraseña</h1>
                </div>
            </header>
        <form action="control.co" merthod="post">
            <table cellspacing="3" cellpadding="5" border="1">
                <tr>
                    <td align="right">Usuario:</td>
                    <td><input type="text" name="user" placeholder="Ingrese su usuario"></td>
                </tr>
                
                <tr>
                   <td align="right">Contraseña:</td>
                    <td><input type="text" name="pass" placeholder="Ingrese su contraseña"></td>
                </tr>

            </table>
            
                <input type="reset" value="Borrar"class="waves-effect waves-light btn">
                <input type="submit" value="Enviar" class="waves-effect waves-light btn">
        </form>
                    </div>
                </div>
             </div>
                      
       
        </div>
               
            </div>
    </body>
</html>
