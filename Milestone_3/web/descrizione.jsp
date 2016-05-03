<%-- 
    Document   : descrizione
    Created on : 2-mag-2016, 21.46.32
    Author     : Pili
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Descrizione</title>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <jsp:include page="sidebar1.jsp"/>

        <nav id="sidebar2"><a href='login.html'>LOGIN</a></nav>

        <div id="content">
            <h1><a id="top">Descrizione sito</a></h1>
            <p>Benvenuto in Euterpe, sito di e-commerce dedicato alla musica.<br/>
                Qui puoi trovare tutta la musica che cerchi<a href='#o'>*</a> e acquistarla in formato fisico (CD o vinile) oppure in formato 
                digitale.</p>
            <h2><a id="venditore">Venditore </a></h2>
            <p> Il venditore può controllare il saldo della moneta virtuale, può aggiungere al catalogo nuovi album musicali
                nei formati disponibili(CD, Vinile, MP3)ed eventualmente, rimuoverli dal catalogo multimediale.
                <br/><a href='#ind'>Indice</a> </p>
            <h2><a id="cliente">Cliente </a></h2>
            <p>Il cliente può ricare il proprio saldo per gli acquisti e navigare nel catalogo multimediale 
                e procedere all’acquisto di uno o più album o singoli nei vari formati disponibili.
                <br/><a href='#ind'>Indice</a></p>        
            <h2><a id="musica">Musica</a></h2>
            <p>Qui puoi trovare tutta la musica che cerchi nei seguenti formati disponibili:</p>
            <h3><a id="musica_CD">CD</a></h3>
            <p>I migliori album dei migliori artisti a i migliori prezzi del web</p>
            <h3><a id="musica_vinile">Vinile</a></h3>
            <p>vinili per apprezzare la musica a s'antiga</p>
            <h3><a id="musica_digital">Digitale</a></h3>
            <p>Download in mp3 di singoli brani, album e intere discogafie
                <br/><a href='#ind'>Indice</a></p>
            <p><a id="o">*Ligabue e Vasco Rossi non inclusi</a></p>
        </div>

        <jsp:include page="footer.jsp"/>
    </body>
</html>
