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
public class Conto {

    private int conto;

    /**
     * @return the conto
     */
    public int getConto() {
        return conto;
    }

    /**
     * @param conto the conto to set
     */
    public void setConto(int conto) {
        if (conto > 0) {
            this.conto = conto;
        }
    }

    //controlla se il saldo è maggiore della spesa
    public boolean itsOk(int prezzo) {
        return this.conto > prezzo;
    }
    
    //pagamento o ricarica
    public void setAccredito(int pagamento){
           this.conto += pagamento;
    }
    
}
