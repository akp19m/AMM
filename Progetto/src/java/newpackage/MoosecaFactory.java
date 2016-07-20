/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Pili
 */
public class MoosecaFactory {

    private String connectionString;

    private static MoosecaFactory singleton;

    public static MoosecaFactory getInstance() {
        if (singleton == null) {
            singleton = new MoosecaFactory();
        }
        return singleton;
    }

    //metodi inclusi con la milestone4
    public void setConnectionString(String s) {
        this.connectionString = s;
    }

    public String getConnectionString() {
        return this.connectionString;
    }

    // Lista Materie
    //private ArrayList<Mooseca> listaMusica = new ArrayList<>();
    // Lista Venditori
    //private ArrayList<Users> listaVenditori = new ArrayList<>();
    // Lista Clienti
    //private ArrayList<Users> listaClienti = new ArrayList<>();

    /* Costruttore */
    private MoosecaFactory() {
        /*
         // Venditore 1
         UsersVend vend = new UsersVend();
         vend.setId(1);
         vend.setNome("Leonardo");
         vend.setCognome("Bonucci");
         vend.setUsername("lb19");
         vend.setPassword("0");
         vend.getConto().setConto(300);
         listaVenditori.add(vend);

         // Venditore 2
         UsersVend vend2 = new UsersVend();
         vend2.setId(2);
         vend2.setNome("Jamie");
         vend2.setCognome("Vardy");
         vend2.setUsername("jv9");
         vend2.setPassword("0");
         vend2.getConto().setConto(300);
         listaVenditori.add(vend2);

         // album 1         
         Mooseca album_1 = new Mooseca();
         album_1.setNomeOgg("Black Album");
         album_1.setCoverLink("blackalbum.jpg");
         album_1.setTipo("CD");
         album_1.setAutore("Metallica");
         album_1.setQuantità(19);
         album_1.setPrezzo(10);
         album_1.setCodice(1);
         album_1.setVend(vend);
         listaMusica.add(album_1);

         // album 2         
         Mooseca album_2 = new Mooseca();
         album_2.setNomeOgg("Mesmerize");
         album_2.setCoverLink("soadm.jpg");
         album_2.setTipo("CD");
         album_2.setAutore("System of a down");
         album_2.setQuantità(19);
         album_2.setPrezzo(10);
         album_2.setCodice(2);
         album_2.setVend(vend);
         listaMusica.add(album_2);

         // album 3         
         Mooseca album_3 = new Mooseca();
         album_3.setNomeOgg("Rosenrot");
         album_3.setCoverLink("rosenrot.jpg");
         album_3.setTipo("CD");
         album_3.setAutore("Rammstein");
         album_3.setQuantità(19);
         album_3.setPrezzo(10);
         album_3.setCodice(3);
         album_3.setVend(vend);
         listaMusica.add(album_3);

         // album 4         
         Mooseca album_4 = new Mooseca();
         album_4.setNomeOgg("Tra la via Emila e il West");
         album_4.setCoverLink("viaem.jpg");
         album_4.setTipo("Vinile");
         album_4.setAutore("Guccini");
         album_4.setQuantità(19);
         album_4.setPrezzo(10);
         album_4.setCodice(4);
         album_4.setVend(vend2);
         listaMusica.add(album_4);

         // album 5       
         Mooseca album_5 = new Mooseca();
         album_5.setNomeOgg("Elettrico");
         album_5.setCoverLink("elettrico.jpg");
         album_5.setTipo("MP3");
         album_5.setAutore("Rancore");
         album_5.setQuantità(19);
         album_5.setPrezzo(10);
         album_5.setCodice(5);
         album_5.setVend(vend2);
         listaMusica.add(album_5);

         // Cliente
         UsersClient cliente = new UsersClient();
         cliente.setId(3);
         cliente.setNome("Angelo");
         cliente.setCognome("Pili");
         cliente.setUsername("akp19");
         cliente.setPassword("0");
         cliente.getConto().setConto(300);
         listaClienti.add(cliente);
         */
    }
    /* Metodi 
     //venditori
     public ArrayList<Users> getVenditori() {
     return listaVenditori;
     }
     public Users getVenditorePerId(int id) {
     for (Users u : listaVenditori) {
     if (u.id == id) {
     return u;
     }
     }
     return null;
     }
     //clienti
     public ArrayList<Users> getClient() {
     return listaClienti;
     }
     public Users getClientPerId(int id) {
     for (Users u : listaClienti) {
     if (u.id == id) {
     return u;
     }
     }
     return null;
     }
     //listautenti
     public ArrayList<Users> getUserList() {
     ArrayList<Users> listaUtenti = new ArrayList<Users>();

     listaUtenti.addAll(listaVenditori);
     listaUtenti.addAll(listaClienti);

     return listaUtenti;
     }
     //musica
     public ArrayList<Mooseca> getMusica() {
     return listaMusica;
     }
     public ArrayList<Mooseca> getMusicaName(String nomeOgg) {
     ArrayList<Mooseca> a = new ArrayList<>();
     for (Mooseca u : listaMusica) {
     if (u.getNomeOgg().equals(nomeOgg)) {
     a.add(u);
     }
     }
     return a;
     }
     public ArrayList<Mooseca> getMusicaType(String tipo) {
     ArrayList<Mooseca> a = new ArrayList<>();
     for (Mooseca u : listaMusica) {
     if (u.getTipo().equals(tipo)) {
     a.add(u);
     }
     }
     return a;
     }
     public ArrayList<Mooseca> getMusicaAutor(String autore) {
     ArrayList<Mooseca> a = new ArrayList<>();
     for (Mooseca u : listaMusica) {
     if (u.getAutore().equals(autore)) {
     a.add(u);
     }
     }
     return a;
     }
     public Mooseca getMusicaId(int codice) {
     for (Mooseca a : listaMusica) {
     if (a.getCodice() == codice) {
     return a;
     }
     }
     return null;
     }
     */

    public Users getUtente(String username, String password) {
        try {
            // sql command
            try (Connection conn = DriverManager.getConnection(connectionString, "username", "password")) {
                // sql command
                String query = "select * from utente where password = ? and username = ? and venditore = true";
                PreparedStatement stmt = conn.prepareStatement(query);
                // dati
                stmt.setString(1, password);
                stmt.setString(2, username);
                //
                ResultSet set = stmt.executeQuery();
                
                if (set.next()) {
                    UsersVend venditore = new UsersVend();
                    venditore.setId(set.getInt("id_utente"));
                    venditore.setNome(set.getString("nome"));
                    venditore.setCognome(set.getString("cognome"));
                    venditore.setUsername(set.getString("username"));
                    venditore.setPassword(set.getString("password"));
                    venditore.getConto().setConto(set.getInt("conto"));
                    stmt.close();
                    conn.close();
                    
                    return venditore;
                }
                
                // Studente
                // sql command
                query = "select * from utente where password = ? and username = ? and venditore = false";
                stmt = conn.prepareStatement(query);
                // dati
                stmt.setString(1, password);
                stmt.setString(2, username);
                //
                set = stmt.executeQuery();
                
                if (set.next()) {
                    UsersClient cliente = new UsersClient();
                    cliente.setId(set.getInt("id_utente"));
                    cliente.setNome(set.getString("nome"));
                    cliente.setCognome(set.getString("cognome"));
                    cliente.setUsername(set.getString("username"));
                    cliente.setPassword(set.getString("password"));
                    cliente.getConto().setConto(set.getInt("conto"));
                    
                    stmt.close();
                    conn.close();
                    return cliente;
                }
                
                stmt.close();
            }
        } catch (SQLException e) {
            
        }
        return null;
    }

    //Venditore
    public ArrayList<Users> getVenditori() {
        ArrayList<Users> listaVend = new ArrayList<>();
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "username", "password");
            Statement stmt = conn.createStatement();
            String query = "select * from utente where venditore= true";
            ResultSet set = stmt.executeQuery(query);
            // ciclo sulle righe restituite
            while (set.next()) {
                UsersVend current = new UsersVend();
                current.setId(set.getInt("id_utente"));
                current.setNome(set.getString("nome"));
                current.setCognome(set.getString("cognome"));
                current.setUsername(set.getString("username"));
                current.setPassword(set.getString("password"));
                current.getConto().setConto(set.getInt("conto"));
                listaVend.add(current);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaVend;
    }

    public UsersVend getVenditorePerId(int id) {
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "username", "password");
            // Query
            String query = "select * from utente where id = ? and venditore = true";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            stmt.setInt(1, id);
            // Esecuzione query
            ResultSet res = stmt.executeQuery();
            // ciclo sulle righe restituite
            if (res.next()) {
                UsersVend current = new UsersVend();
                current.setId(res.getInt("id_utente"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setUsername(res.getString("username"));
                current.setPassword(res.getString("password"));
                current.getConto().setConto(res.getInt("conto"));
                stmt.close();
                conn.close();
                return current;
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //Cliente
    public ArrayList<Users> getClient() {
        ArrayList<Users> listaClienti = new ArrayList<>();
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "username", "password");
            Statement stmt = conn.createStatement();
            String query = "select * from utente where venditore = false";
            ResultSet set = stmt.executeQuery(query);

            // ciclo sulle righe restituite
            while (set.next()) {
                UsersClient current = new UsersClient();
                current.setId(set.getInt("id_utenete"));
                current.setNome(set.getString("nome"));
                current.setCognome(set.getString("cognome"));
                current.setUsername(set.getString("username"));
                current.setPassword(set.getString("password"));
                current.getConto().setConto(set.getInt("conto"));
                listaClienti.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaClienti;
    }

    public UsersClient getClientPerId(int id) {
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "username", "password");
            String query = "select * from utente where id = ? and venditore= false";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            stmt.setInt(1, id);
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                UsersClient current = new UsersClient();
                current.setId(res.getInt("id_utente"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setUsername(res.getString("username"));
                current.setPassword(res.getString("password"));
                current.getConto().setConto(res.getInt("conto"));

                stmt.close();
                conn.close();
                return current;
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // lista utenti
    public ArrayList<Users> getUserList() {
        ArrayList<Users> listaUtenti = new ArrayList<>();
        ArrayList<Users> listaVenditori = getVenditori();
        ArrayList<Users> listaClienti = getClient();
        listaUtenti.addAll(listaVenditori);
        listaUtenti.addAll(listaClienti);
        return listaUtenti;
    }

    // Musica
    public ArrayList<Mooseca> getMusica() {
        ArrayList<Mooseca> listaMusica = new ArrayList<>();
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "username", "password");
            Statement stmt = conn.createStatement();
            String query = "select * from album";
            ResultSet set = stmt.executeQuery(query);

            // ciclo sulle righe restituite
            while (set.next()) {
                Mooseca current = new Mooseca();
                current.setCodice(set.getInt("id_album"));
                current.setNomeOgg(set.getString("nome_album"));
                current.setCoverLink(set.getString("coverlink"));
                current.setTipo(set.getString("tipo"));
                current.setAutore(set.getString("autore"));
                current.setQuantità(set.getInt("quantita"));
                current.setPrezzo(set.getInt("prezzo"));
                //settaggio venditore
                int id_vend = set.getInt("id_vend");
                current.setVend(getVenditorePerId(id_vend));

                listaMusica.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaMusica;
    }

    public ArrayList<Mooseca> getMusicaName(String nomeOgg) {
        ArrayList<Mooseca> listaMusica = new ArrayList<>();
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "username", "password");
            String query = "select * from album where nome = ?";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            stmt.setString(1, nomeOgg);
            // Esecuzione query
            ResultSet set = stmt.executeQuery();
            // ciclo sulle righe restituite
            if (set.next()) {
                Mooseca current = new Mooseca();
                current.setCodice(set.getInt("id_album"));
                current.setNomeOgg(set.getString("nome_album"));
                current.setCoverLink(set.getString("coverlink"));
                current.setTipo(set.getString("tipo"));
                current.setAutore(set.getString("autore"));
                current.setQuantità(set.getInt("quantita"));
                current.setPrezzo(set.getInt("prezzo"));
                //settaggio venditore
                int id_vend = set.getInt("id_vend");
                current.setVend(getVenditorePerId(id_vend));

                listaMusica.add(current);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaMusica;
    }

    public ArrayList<Mooseca> getMusicaType(String tipo) {
        ArrayList<Mooseca> listaMusica = new ArrayList<>();
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "username", "password");
            String query = "select * from album where tipo = ?";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            stmt.setString(1, tipo);
            // Esecuzione query
            ResultSet set = stmt.executeQuery();
            // ciclo sulle righe restituite
            if (set.next()) {
                Mooseca current = new Mooseca();
                current.setCodice(set.getInt("id_album"));
                current.setNomeOgg(set.getString("nome_album"));
                current.setCoverLink(set.getString("coverlink"));
                current.setTipo(set.getString("tipo"));
                current.setAutore(set.getString("autore"));
                current.setQuantità(set.getInt("quantita"));
                current.setPrezzo(set.getInt("prezzo"));
                //settaggio venditore
                int id_vend = set.getInt("id_vend");
                current.setVend(getVenditorePerId(id_vend));

                listaMusica.add(current);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaMusica;
    }

    public ArrayList<Mooseca> getMusicaAutor(String autore) {
        ArrayList<Mooseca> listaMusica = new ArrayList<>();
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "username", "password");
            String query = "select * from album where autore = ?";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            stmt.setString(1, autore);
            // Esecuzione query
            ResultSet set = stmt.executeQuery();
            // ciclo sulle righe restituite
            if (set.next()) {
                Mooseca current = new Mooseca();
                current.setCodice(set.getInt("id_album"));
                current.setNomeOgg(set.getString("nome_album"));
                current.setCoverLink(set.getString("coverlink"));
                current.setTipo(set.getString("tipo"));
                current.setAutore(set.getString("autore"));
                current.setQuantità(set.getInt("quantita"));
                current.setPrezzo(set.getInt("prezzo"));
                //settaggio venditore
                int id_vend = set.getInt("id_vend");
                current.setVend(getVenditorePerId(id_vend));

                listaMusica.add(current);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaMusica;
    }

    public Mooseca getMusicaId(int codice) {
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "username", "password");
            String query = "select * from album where id = ?";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            stmt.setInt(1, codice);
            // Esecuzione query
            ResultSet set = stmt.executeQuery();
            // ciclo sulle righe restituite
            if (set.next()) {
                Mooseca current = new Mooseca();
                current.setCodice(set.getInt("id_album"));
                current.setNomeOgg(set.getString("nome_album"));
                current.setCoverLink(set.getString("coverlink"));
                current.setTipo(set.getString("tipo"));
                current.setAutore(set.getString("autore"));
                current.setQuantità(set.getInt("quantita"));
                current.setPrezzo(set.getInt("prezzo"));
                //settaggio venditore
                int id_vend = set.getInt("id_vend");
                current.setVend(getVenditorePerId(id_vend));

                return current;
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //SONO ARRIVATO QUI
}
