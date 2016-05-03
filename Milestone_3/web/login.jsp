<%-- 
    Document   : login
    Created on : 3-mag-2016, 19.11.38
    Author     : Pili
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <jsp:include page="header.jsp"/>

        <!-- sezione di navigazione-->
        <nav id="sidebar2"><a href='cliente.html'>vai a 'cliente'</a><br/>
            <a href='venditore.html'>vai a 'venditore'</a><br/>
            <a href='descrizione.html'>vai a 'descrizione'</a><br/>
        </nav>
        <div id="content">
            <h1>Login</h1>
            <!--dovrò cambiare l'action e il method-->
            <form method="post" action="Login">
                <input type="hidden" name="cmd" value="login">
                <label for="user">Username</label>
                <input type="text" name="user" id="user" value="username"/><br/>
                <label for="pass">Password</label>
                <input type="password" name="password" id="pass" value="cinciallegra"/><br/>
                <input type="submit" value="Login"/>
            </form> 
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
