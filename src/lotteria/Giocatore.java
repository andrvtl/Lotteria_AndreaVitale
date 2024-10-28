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
 * @author andrea vitale
 */
public class Giocatore extends Thread {
    // attributi
    private int idGiocatore;
    private String nomeGiocatore;
    private Estrazione estrazione;

    /**
    * 
    * Metodo costruttore
    * @param idGiocatore codice del giocatore
    * @param estrazione riferimento dell'oggetto Estrazione
    * @param nomeGiocatore
    */
    public Giocatore(int idGiocatore, String nomeGiocatore, Estrazione estrazione) {
       // inizializzazione attributi
       this.idGiocatore = idGiocatore;
       this.nomeGiocatore = nomeGiocatore;
       this.estrazione = estrazione;
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {

        // scelta del numero da giocare
        int numeroScelto = 0;

        System.out.println("Giocatore " + this.idGiocatore + ", inserisci il numero che vuoi giocare: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try { 
            numeroScelto = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException ex) {
            Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Errore nell'inserimento del numero, verrà impostato a 0.");
        }

        System.out.println("Estrazione per il giocatore " + idGiocatore + " in corso, conto alla rovescia...");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Errore nello sleep");
            }
        }

        // verifica numero
        estrazione.verifica(numeroScelto, idGiocatore);

    }
}
