<%-- 
    Document   : login
    Created on : 3-mag-2016, 19.11.38
    Author     : Pili
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="img/vinyl_blue.ico">
        <meta name="author" content="Angelo Pili">
        <meta name="description" content="pag login">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/style.css" rel="stylesheet" type="text/css" media="screen"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div id="pag">
            <jsp:include page="parts/header.jsp"/>

            <!-- sezione di navigazione-->
            <jsp:include page="parts/sidebar2.jsp"/>
            <div id="content">
                <h1>Login</h1>
                <p>${errore}</p>
                <p>Per poter accedere al sito, compila il seguente form:</p>
                <jsp:include page="parts/formlogin.jsp"/>
            </div>
            <jsp:include page="parts/footer.jsp"/>
        </div>
    </body>
</html>
