/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

/**
 *
 * @author andrea vitale
 */
public class Lotteria {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estrazione e = new Estrazione();
        e.start();
        
        Giocatore g = new Giocatore(1, e);
        Giocatore g1 = new Giocatore(2, e);
        Giocatore g2 = new Giocatore(3, e);
        g.start();
        g1.start();
        g2.start();
        
        // Scelta del numero dei numeri da estrarre
        
        // Istanza ed avvio del thread Estrazione
       
        // Istanza di alcuni thread Giocatore
       
        // Avvio dei thread Giocatori
       
        // Comunicazione fine gioco
    }
}
   