<%-- 
    Document   : cliente
    Created on : 17-mag-2016, 16.17.10
    Author     : Pili
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="img/vinyl_blue.ico">
        <meta name="author" content="Angelo Pili">
        <meta name="description" content="pag vista cliente">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/style.css" rel="stylesheet" type="text/css" media="screen"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente</title>
    </head>
    <body>
        <div id="pag">
            <jsp:include page="parts/header.jsp"/>
            <jsp:include page="parts/sidebar2.jsp"/>
            <jsp:include page="parts/ricarica_conto.jsp"/>
            <div id="content">
                <h1>Cliente</h1>
                <div>
                    <p>
                        Benvenuto ${cliente.nome} ${cliente.cognome}.
                    </p>
                    <p>
                        Qui puoi trovare tutta la nostra musica!
                    </p>
                </div>
                <div>
                    <jsp:include page="parts/vetrina.jsp"/>
                </div>     
            </div>
            <jsp:include page="parts/footer.jsp"/>
        </div>         
    </body>
</html>