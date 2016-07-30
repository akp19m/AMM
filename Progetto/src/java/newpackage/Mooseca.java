/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Pili
 */
public class Mooseca {

    private int codice;
    private String nomeOgg;
    private String coverLink;
    private String tipo;
    private String autore;
    private int prezzo;
    private UsersVend vend;

    /**
     * @return the codice
     */
    public int getCodice() {
        return codice;
    }

    /**
     * @param codice the codice to set
     */
    public void setCodice(int codice) {
        this.codice = codice;
    }

    /**
     * @return the nomeOgg
     */
    public String getNomeOgg() {
        return nomeOgg;
    }

    /**
     * @param nomeOgg the nomeOgg to set
     */
    public void setNomeOgg(String nomeOgg) {
        this.nomeOgg = nomeOgg;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the prezzo
     */
    public int getPrezzo() {
        return prezzo;
    }

    /**
     * @param prezzo the prezzo to set
     */
    public void setPrezzo(int prezzo) {
        if (prezzo > 0) {
            this.prezzo = prezzo;
        }

    }

    /**
     * @return the autore
     */
    public String getAutore() {
        return autore;
    }

    /**
     * @param autore the autore to set
     */
    public void setAutore(String autore) {
        this.autore = autore;
    }

    /**
     * @return the coverLink
     */
    public String getCoverLink() {
        return coverLink;
    }

    /**
     * @param coverLink the coverLink to set
     */
    public void setCoverLink(String coverLink) {
        this.coverLink = coverLink;
    }

    /**
     * @return the vend
     */
    public UsersVend getVend() {
        return vend;
    }

    /**
     * @param vend the vend to set
     */
    public void setVend(UsersVend vend) {
        this.vend = vend;
    }

}
