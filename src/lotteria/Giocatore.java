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
public class Giocatore extends Thread{
    // attributi
    private int idGiocatore;
    private String nomeGiocatore;
    private Estrazione estrazione;

    /**
    * 
    * Metodi costruttori
    * @param idGiocatore codice del giocatore
    * @param estrazione riferimento dell'oggetto Estrazione
    */
    public Giocatore(int idGiocatore, Estrazione estrazione) {
       // inizializzazione attributi  
       this.idGiocatore = idGiocatore;
       this.estrazione = estrazione;
    }
    public Giocatore(String nomeGiocatore) {
       this.nomeGiocatore = nomeGiocatore;
    }
    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
       System.out.println("Id: " + this.idGiocatore);
       
       // scelta del numero da giocare
       int numeroScelto = 5;
       
       // Countdown
       System.out.println("Conto alla rovescia...");
       for (int i=3; i>0; i--){
           System.out.println(i);
       }
       System.out.println("Via all'estrazione!");
       
       // verifica del risutlato
       estrazione.verifica(numeroScelto, idGiocatore);
       
       // stampa fine verifica
       System.out.println("Numero verificato");
    }
}
