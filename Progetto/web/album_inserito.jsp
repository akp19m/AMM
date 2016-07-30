<%-- 
    Document   : album_inserito
    Created on : 26-mag-2016, 12.07.57
    Author     : Pili
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="img/vinyl_blue.ico">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Album Inserito Correttamente</title>
        <meta name="author" content="Angelo Pili">
        <meta name="description" content="Album inserito correttamente">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/style.css" rel="stylesheet" type="text/css" media="screen"/>
    </head>
    <body>
        <div id="pag">
            <jsp:include page="parts/header.jsp"/>
            <jsp:include page="parts/sidebar2.jsp"/>
            <div id="content">
                <h1>Venditore</h1>
                <div>
                    <p>
                        ${venditore.nome} ${venditore.cognome}
                    </p>
                </div>
                <h2>Riepilogo</h2>
                <div>
                    <jsp:include page="parts/anteprima.jsp"/>
                </div>
                <p>Il nuovo album è stato inserito correttamente</p><br/>
                <a href='venditore.html'>Torna a pag principale venditore</a><br/>
            </div>
            <jsp:include page="parts/footer.jsp"/>
        </div>
</html>
