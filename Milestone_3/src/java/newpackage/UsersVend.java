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
public class UsersVend extends Users {

    private ArrayList<Mooseca> catalogo = new ArrayList<>();

    /**
     * costruttore
     */
    public UsersVend() {
        super();
    }

    /**
     * @return the catalogo
     */
    public ArrayList<Mooseca> getCatalogo() {
        return catalogo;
    }

    /**
     * @param catalogo the catalogo to set
     */
    public void setCatalogo(ArrayList<Mooseca> catalogo) {
        this.catalogo = catalogo;
    }
}
