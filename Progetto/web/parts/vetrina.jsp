
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
    <tr>
        <th>Titolo</th>
        <th>Cover</th>
        <th>Autore</th>
        <th>Tipo</th>
        <th>Prezzo (£.)</th>
        <th>Aggiungi al carrello</th>
    </tr>
    <c:forEach items="${listaMusica}" var="album">
        <tr>
            <td>${album.getNomeOgg()}</td>
            <td><img title="${album.getNomeOgg()}" alt="${album.getNomeOgg()}" src="img/${album.getCoverLink()}" width="80" height="80"></td>
            <td>${album.getAutore()}</td>
            <td>${album.getTipo()}</td>
            <td>${album.getPrezzo()}</td>
            <td><a href="cliente.html?codAcquisto=${album.getCodice()}">aggiungi a carrello</a></td>
        </tr>
    </c:forEach>
</table>
