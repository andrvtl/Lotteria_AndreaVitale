/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class Lotteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Avvio gioco

        System.out.println("\n");

        int numero = 0;
        // Scelta di quanti numeri estrarre
        System.out.println("Inserisci la grandezza della matrice (matrice nxn): ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            numero = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Errore nell'inserimento del numero, verrà impostato a 3.");
            numero = 3;  // Default
        }

        // Istanza ed avvio dei thread Estrazione e Giocatore
        Estrazione e = new Estrazione(numero);
        Giocatore g1 = new Giocatore(1, "A", e);
        Giocatore g2 = new Giocatore(2, "B", e);
        Giocatore g3 = new Giocatore(3, "C", e);
        Giocatore g4 = new Giocatore(4, "D", e);

        e.start();

        try {
            e.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
        }

        g1.start();
        g2.start();
        g3.start();
        g4.start();

        try {
            g1.join();
            g2.join();
            g3.join();
            g4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Errore nel join");
        }

        e.stampaVincitori();
        // Comunicazione fine gioco
        System.out.println("\n");
        System.out.println("Lotteria terminata, grazie per aver partecipato.");
    }
}
