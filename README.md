# Progetto Lotteria Vitale Andrea

## Scopo del progetto
Il progetto simula una lotteria in cui diversi giocatori scelgono un numero e tentano di vincere, verificando se il loro numero è tra quelli estratti casualmente in una matrice di dimensioni a scelta.

## Classi utilizzate

- **Giocatore**: Questa classe rappresenta un giocatore che può scegliere un numero da giocare. Ogni giocatore è un thread separato e verifica se il numero scelto è vincente.
  
- **Estrazione**: Questa classe gestisce la matrice di numeri casuali e verifica se i numeri giocati dai giocatori sono vincenti. Il metodo `verifica()` controlla ogni numero scelto con quelli nella matrice e tiene traccia dei vincitori:
  - **verifica()**: Confronta il numero giocato da un giocatore con i numeri estratti. Se il numero è presente nella matrice, il giocatore ha vinto. La verifica è sincronizzata per evitare conflitti tra i vari thread.

- **Lotteria**: Questa classe contiene il metodo `main` e gestisce l'inizio del gioco e la creazione dei thread.

## Riferimenti alle librerie
Vengono utilizzate librerie Java standard per la gestione dei thread (`Thread`), la generazione di numeri casuali (`Random`), e l'input da console (`BufferedReader`, `InputStreamReader`).

## Gestione degli errori
Gli errori sono gestiti con tecniche specifiche di try-catch. In caso di errore nell'inserimento di un numero viene visualizzato un messaggio di allerta, dopo il quale il giocatore può ritentare.

## Commento dell'esecuzione
Il programma chiede inizialmente la dimensione della matrice dei numeri vincenti, dopodichè viene richiesto ai giocatori di scegliere ognuno il proprio numero. Dopo l'estrazione, i vincitori vengono annunciati e il gioco termina.
