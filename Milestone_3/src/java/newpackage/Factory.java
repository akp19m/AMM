/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;

/**
 *
 * @author Pili
 */
public class Factory {

    private static Factory singleton;

    public static Factory getInstance() {
        if (singleton == null) {
            singleton = new Factory();
        }
        return singleton;
    }

    /* Costruttore */
    private Factory() {

    }

    public ArrayList<Mooseca> getCatalogoTot() {
        ArrayList<Mooseca> catalogotot = new ArrayList<>();

        // album 1         
        Mooseca album_1 = new Mooseca();
        album_1.setNomeOgg("Black Album");
        album_1.setTipo("CD");
        album_1.setDescrizione("Album Metallica");
        album_1.setQuantità(19);
        album_1.setPrezzo(10);
        album_1.setCodice(1);
        catalogotot.add(album_1);

        // album 2         
        Mooseca album_2 = new Mooseca();
        album_2.setNomeOgg("Mesmerize");
        album_2.setTipo("CD");
        album_2.setDescrizione("Album SOAD");
        album_2.setQuantità(19);
        album_2.setPrezzo(10);
        album_2.setCodice(2);
        catalogotot.add(album_2);

        // album 3         
        Mooseca album_3 = new Mooseca();
        album_3.setNomeOgg("Herzeleid");
        album_3.setTipo("CD");
        album_3.setDescrizione("Album Rammstein");
        album_3.setQuantità(19);
        album_3.setPrezzo(10);
        album_3.setCodice(3);
        catalogotot.add(album_3);

        // album 4         
        Mooseca album_4 = new Mooseca();
        album_4.setNomeOgg("Tra la via Emila e il West");
        album_4.setTipo("CD");
        album_4.setDescrizione("Album Guccini");
        album_4.setQuantità(19);
        album_4.setPrezzo(10);
        album_4.setCodice(4);
        catalogotot.add(album_4);

        // album 5       
        Mooseca album_5 = new Mooseca();
        album_5.setNomeOgg("Elettrico");
        album_5.setTipo("CD");
        album_5.setDescrizione("Album Rancore");
        album_5.setQuantità(19);
        album_5.setPrezzo(10);
        album_5.setCodice(5);
        catalogotot.add(album_5);

        // Venditore 1
        UsersVend vend = new UsersVend();
        vend.setId(19);
        vend.setNome("Leonardo");
        vend.setCognome("Bonucci");
        vend.setUsername("lb19");
        vend.setPassword("34");
        ArrayList<Mooseca> arrayCatalogo = new ArrayList<>();
        arrayCatalogo.add(album_1);
        arrayCatalogo.add(album_2);
        arrayCatalogo.add(album_5);
        vend.setCatalogo(arrayCatalogo);

        // Venditore 2
        UsersVend vend2 = new UsersVend();
        vend2.setId(1);
        vend2.setNome("Jamie");
        vend2.setCognome("Vardy");
        vend2.setUsername("jv9");
        vend2.setPassword("claudioranieri");
        ArrayList<Mooseca> arrayCatalogo2 = new ArrayList<>();
        arrayCatalogo2.add(album_3);
        arrayCatalogo2.add(album_4);
        vend2.setCatalogo(arrayCatalogo2);

        // Cliente
        UsersClient cliente = new UsersClient();
        cliente.setId(23);
        cliente.setNome("Angelo");
        cliente.setCognome("Pili");
        cliente.setUsername("akp19");
        cliente.setPassword("mittlaprima");

        return catalogotot;
    }
}
