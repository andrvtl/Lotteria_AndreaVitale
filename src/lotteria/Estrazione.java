/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;

/**
 *
 * @author andrea vitale
 */
public class Estrazione extends Thread {
    // attributi
    private int numero;
    /**
     * 
     * Metodo costruttore
     */   
    public Estrazione() {
        // popolamento matrice numeri estratti
        // inizializzazione array vincitori
        numero = 5;
    }

    /**
    * 
    * Metodo per visualizzare la matrice dei numeri estratti
    */
    public void stampaMatrice() {
       // stampa matrice dei numeri estratti
    }
    
    /**
    * 
    * Metodo per visualizzare i vincitori dell'estrazione
    */
    public void stampaVincitori() {
        // stampa array dei vincitori
        }

    /**
    * 
    * Metodo per verificare il numero scelto dal giocatore e determinare i vincitori
    */
    public void verifica(int numero, int idGiocatore) {
        if (numero==this.numero)
            System.out.println("Giocatore " + idGiocatore + ", hai vinto!");
        else 
            System.out.println("Giocatore " + idGiocatore + ", purtroppo non hai vinto...");
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        // stampa iniziale
        // estrazione dei numeri
        // stampa matrice
        // stampa finale
    }
}


