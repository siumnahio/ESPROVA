/*Edward Gonzaga 4INF.D   16/11/2024
  
Titolo: Esercizio delle stringhe

Funzionamento: Scrivi un programma in java che lasci inserire ad un utente una stringa e 
cerchi quante volte appare la lettera "a" in essa successivamente stampa la lettera "a" 
in maiuscolo tante volte quanto è stata trovata. Tutte queste funzioni devono essere esterne al main.
*/
package com.mycompany._4id_gonzaga_stringhe;

public class Main {
    
    //Metodo principale 
    public static void main(String[] args) {
        
        //Istanzio l'oggetto della classe "Input" per gestire l'input dell'utente 
        Input Utente = new Input();
        
        //Istanzio l'oggetto della classe "NumeroOccorrenze" per calcolare il numero delle occorrenze    
        NumeroOccorrenze Ripetizioni = new NumeroOccorrenze(); 
        
        //Istanzio l'oggetto della classe "StampaOccorrenze" per la stampa delle lettere A
        StampaOccorrenze LetteraStampata = new StampaOccorrenze(); 
        
        //Richiamo il metodo "Richiesta" della classe "Input" per chiedere all'utente una frase 
        Utente.Richiesta();
        
        //Passo l'oggetto dalla classe "Input" alla classe "NumeroOccorrenze" 
        Ripetizioni.NumeroOccorrenze(Utente);
        
        //Richiamo il metodo "Occorrenze" della classe "NumeroOccorrenze" per il calcolo le occorrenze della lettera "a" nella stringa
        Ripetizioni.Occorrenze();
        
        //Passo l'oggetto dalla classe "NumeroOccorrenze" alla classe "StampaOccorrenze"
        LetteraStampata.StampaOccorrenze(Ripetizioni);
        
        //Richiamo il metodo "Stampa" della classe "StampaOccorrenze" per la stampa delle lettere "a"
        LetteraStampata.Stampa();
        
    }
}
