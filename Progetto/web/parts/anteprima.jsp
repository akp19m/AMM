
<table>
    <tr>
        <th>Titolo</th>
        <th>Cover</th>
        <th>Autore</th>
        <th>Tipo</th>
        <th>Quantità</th>
        <th>Prezzo (£.)</th>
    </tr>
    <tr>
        <td>${album.getNomeOgg()}</td>
        <td><img title="${album.getNomeOgg()}" alt="${album.getNomeOgg()}" src="img/${album.getCoverLink()}" width="80" height="80"></td>
        <td>${album.getAutore()}</td>
        <td>${album.getTipo()}</td>
        <td>${album.getQuantità()}</td>
        <td>${album.getPrezzo()}</td>
    </tr>
</table>

