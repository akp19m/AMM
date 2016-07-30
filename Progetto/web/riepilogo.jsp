<%-- 
    Document   : riepilogo
    Created on : 20-giu-2016, 12.18.40
    Author     : Pili
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="img/vinyl_blue.ico">
        <meta name="author" content="Angelo Pili">
        <meta name="description" content="pagina di riepilogo">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/style.css" rel="stylesheet" type="text/css" media="screen"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Riepilogo</title>
    </head>
    <body>
        <div id="pag">
            <jsp:include page="parts/header.jsp"/>
            <jsp:include page="parts/sidebar2.jsp"/>
            <div id="content">
                <h1>Cliente</h1>
                <div>
                    <p>
                        ${cliente.nome} ${cliente.cognome}.
                    </p>
                </div>
                <div>
                    <h2>Riepilogo Acquisto</h2>
                    <div>
                        <jsp:include page="parts/anteprima.jsp"/>
                        <p>${carrello}</p>
                        <a href='cliente.html'>Annulla Acquisto</a><br/>
                    </div>
                </div>     
            </div>
            <jsp:include page="parts/footer.jsp"/>
        </div>
    </body>
</html>
