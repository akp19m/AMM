
<form method="GET" id="vendi" action="venditore.html">
    <p>Aggiungi un nuovo oggetto</p>

    <label class="titolo" for="name">Nome oggetto</label>
    <input type="text" name="name" id="name"/><br/>        

    <!--selezione tipo-->

    <label class="titolo" for="cd">CD</label>
    <input type="radio" name="tipo" id="cd" value="CD"/><br/>
    <label class="titolo" for="vyn">Vinile</label>
    <input type="radio" name="tipo" id="vyn" value="Vinile"/><br/>
    <label class="titolo" for="mp3">MP3</label>
    <input type="radio" name="tipo" id="mp3" value="MP3"/><br/>
    <br/>
    
    <label class="titolo" for="autore">Autore</label>
    <input type="text" name="autore" id="autore"/><br/>
    <label class="titolo" for="cover">Cover</label>
    <input type="file" name="cover" id="cover"><br/>
    <label class="titolo" for="qnt">Quantità oggetto</label>
    <input type="number" name="qnt" id="qnt" value="0"/><br/>
    <label class="titolo" for="prezzo">Prezzo oggetto £.</label>
    <input type="number" name="prezzo" id="prezzo" value="0"/><br/>
    <div>
        <input type="submit" name='aggiungi' id='aggiungi' value="Aggiungi Album">
        <input type="reset" name='reset' id="reset" value="Reset">
    </div>
</form>
