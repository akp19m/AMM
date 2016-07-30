<%-- 
    Document   : accessonegato
    Created on : 20-giu-2016, 20.53.52
    Author     : Pili
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="img/vinyl_blue.ico">
        <title>:::ACCESSO NEGATO:::</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="author" content="Angelo Pili">
        <meta name="description" content="ACCESSO NEGATO">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/style.css" rel="stylesheet" type="text/css" media="screen"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div id="pag">
            <jsp:include page="parts/header.jsp"/>
            <div id="content">
                <h1>:::ACCESSO NEGATO:::</h1>
                <p>${errore}</p>
                <p>effettuare il login per continuare:</p>
                <a href=login.html>LOGIN</a>
            </div>
            <jsp:include page="parts/footer.jsp"/>
        </div>
    </body>
</html>
