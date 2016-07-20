<%-- 
    Document   : acquisto_confermato
    Created on : 23-giu-2016, 22.12.20
    Author     : Pili
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Acquisto Confermato</title>
    <meta name="author" content="Angelo Pili">
    <meta name="description" content="Acquisto confermato">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/style.css" rel="stylesheet" type="text/css" media="screen"/>
</head>
<body>
    <div id="pag">
        <jsp:include page="parts/header.jsp"/>
        <jsp:include page="parts/sidebar2.jsp"/>
        <div id="content">
            <h1>Cliente</h1>
            <div>
                <p>
                    ${cliente.nome} ${cliente.cognome}
                </p>
            </div>
            <h2>Riepilogo</h2>
            <div>
                <p>${messaggio}</p><br/>
                <a href='cliente.html'>Torna alla vetrina</a><br/>
            </div>
        </div>
        <jsp:include page="parts/footer.jsp"/>
    </div>
</html>