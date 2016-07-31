$(document).ready(function () {
    $("#filtro").keyup(function ()
    {
        var text = $("#filtro").val();
        $.ajax(
                {
                    url: "filter.json",
                    data: {
                        chiave: "q",
                        valore: text
                    },
                    dataType: 'json',
                    success: function (data) {
                        aggiornaListaMusica(data);
                    },
                    error: function (data) {
                        aggiornaListaMusica(data);
                    }
                });
        function aggiornaListaMusica(listaMusica) {
         
            $(".tab").show();
            $(".nessunRisultato").remove();

            var table = document.getElementsByClassName("tab");

            var controllo = 0;

            for (var album in listaMusica) {
                controllo = 1;

                var row = table.insertRow();

                var column1 = row.insertCell();
                var column2 = row.insertCell();
                var column3 = row.insertCell();
                var column4 = row.insertCell();
                var column5 = row.insertCell();
                var column6 = row.insertCell();

                column1.innerHTML = listaMusica[album].nomeOgg;
                column2.innerHTML = "<img  title=\"" + listaMusica[album].nomeOgg + "\"src=\"/img/" + listaMusica[album].coverLink + "\" alt=\"" + listaMusica[album].nomeOgg + "\" width=\"80\ height=\"80\">";
                column3.innerHTML = listaMusica[album].autore;
                column4.innerHTML = listaMusica[album].tipo;
                column5.innerHTML = listaMusica[album].prezzo;
                column6.innerHTML = "<a href=\"cliente.html?codAcquisto=" + listaMusica[album].codice +"</a>";
            }
            if (controllo === 0) { 
                $(".tab").hide();
                $("#content").append("<p class=\"nessunRisultato\">La sua ricerca non ha dato luogo a nessun risultato.</p>");
            }
        }
    });
});


