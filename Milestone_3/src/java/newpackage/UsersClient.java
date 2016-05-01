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
public class UsersClient extends Users {

    private ArrayList<Mooseca> carrello = new ArrayList<>();

    /**
     * costruttore
     */
    public UsersClient() {
        super();
    }

    /**
     * @return the carrello
     */
    public ArrayList<Mooseca> getCarrello() {
        return carrello;
    }

    /**
     * @param carrello the carrello to set
     */
    public void setCarrello(ArrayList<Mooseca> carrello) {
        this.carrello = carrello;
    }
}
