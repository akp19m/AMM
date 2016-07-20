<%-- 
    Document   : venditore
    Created on : 19-mag-2016, 17.14.19
    Author     : Pili
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Venditore</title>
        <meta name="author" content="Angelo Pili">
        <meta name="description" content="pag vista venditore">
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
                        Benvenuto ${venditore.nome} ${venditore.cognome}, qui puoi inserire un nuovo album:
                    </p>
                </div>
                <jsp:include page="parts/nuovo_album.jsp"/>                       
            </div>
            <jsp:include page="parts/footer.jsp"/>
        </div>
    </body>
</html>
