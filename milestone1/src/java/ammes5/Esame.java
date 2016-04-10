/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ammes5;

/**
 *
 * @author Pili
 */
public class Esame {
    
    private String NomeStudente;
    private String cognomeStudente;
    private String matricola;
    private String nomeEsame;
    private String voto;
    private String nota;
    
    public Esame(){
        NomeStudente = "";
        cognomeStudente = "";
        matricola = "";
        nomeEsame = "";
        nota = "";
    }
    /**
     * @return the NomeStudente
     */
    public String getNomeStudente() {
        return NomeStudente;
    }

    /**
     * @param NomeStudente the NomeStudente to set
     */
    public void setNomeStudente(String NomeStudente) {
        this.NomeStudente = NomeStudente;
    }

    /**
     * @return the cognomeStudente
     */
    public String getCognomeStudente() {
        return cognomeStudente;
    }

    /**
     * @param cognomeStudente the cognomeStudente to set
     */
    public void setCognomeStudente(String cognomeStudente) {
        this.cognomeStudente = cognomeStudente;
    }

    /**
     * @return the matricola
     */
    public String getMatricola() {
        return matricola;
    }

    /**
     * @param matricola the matricola to set
     */
    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    /**
     * @return the nomeEsame
     */
    public String getNomeEsame() {
        return nomeEsame;
    }

    /**
     * @param nomeEsame the nomeEsame to set
     */
    public void setNomeEsame(String nomeEsame) {
        this.nomeEsame = nomeEsame;
    }

    /**
     * @return the voto
     */
    public String getVoto() {
        return voto;
    }

    /**
     * @param voto the voto to set
     */
    public void setVoto(String voto) {
        this.voto = voto;
    }

    /**
     * @return the nota
     */
    public String getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(String nota) {
        this.nota = nota;
    }
    
}
