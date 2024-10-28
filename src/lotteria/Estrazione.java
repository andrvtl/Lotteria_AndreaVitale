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
    private int n;
    private int numeri[][];
    private int vincitori[] = new int[3];
    private Random random = new Random();
    private int contawin = 0;

    /**
     * 
     * Metodo costruttore
     * @param numero 
     */   
    public Estrazione(int numero) {
        // popolamento matrice numeri estratti
        this.n = numero;
        this.numeri = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numeri[i][j] = random.nextInt(100);
            }
        }
    }

    /**
    * 
    * Metodo che stampa la matrice dei numeri estratti
    */
    public void stampaMatrice() {
       // print matrice 
       System.out.println("Matrice dei numeri vincenti: ");
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numeri[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
    * 
    * Metodo per verificare il numero scelto dal giocatore e determinare i vincitori
    */
    public synchronized void verifica(int numero, int idGiocatore) {
        boolean trovato = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (numero == numeri[i][j]) {
                    if (contawin < 3) {
                        vincitori[contawin] = idGiocatore;
                        contawin++;
                    }
                    trovato = true;
                }
            }
        }

        if (!trovato) {
            System.out.println(idGiocatore + " il numero " + numero + " non era vincente!");
        }
    }

    /**
    * 
    * Metodo per visualizzare i vincitori dell'estrazione
    */
    public void stampaVincitori() {
        for (int i = 0; i < 3; i++) {
            if (vincitori[i] != 0) {
                System.out.println("Complimenti " + vincitori[i] + " per la vittoria");
            }
        }
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        // stampa iniziale
        // estrazione dei numeri
        // stampa matrice
        stampaMatrice();
    }
}
