<%-- 
    Document   : publicarReceta
    Created on : 02-jun-2019, 15:47:31
    Author     : ubald
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Publicar Recetas</title>
    </head>
    <body>
    <center>
        <h3>Registra tu Plan</h3>
        <form action="registrarDieta" method="post">
            <input type="text" name="nombre" id="nombre" placeholder="Ingrese el nombre del Plan">
            <br>
            <br>
            <textarea id="descripcion" name="descripcion" rows="5"  placeholder="Descipcion del Plan"></textarea>
            <br><br>
            <input placeholder="Costo del Plan" name="costo" id="costo">
            <br><br>
            <input placeholder="Duracion del Plan" name="tiempo" id="tiempo">
            <br><br>
            <input placeholder="Resultados del Plan" name="resultados" id="resultados">
            <br><br>
            <input type="submit" value="Registrar">
        </form>
    </center>
    </body>
</html>
