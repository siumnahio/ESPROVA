package com.mycompany._4id_gonzaga_stringhe;

//Creo la classe "StampaOccorrenze" per stampare la lettera "a" 
public class StampaOccorrenze {
    
    //Dichiaro l'attributo "stampe" che ha visibilità privata ed è di tipo int
    private int stampe;
    
    //Creo il metodo che prende come parametro un oggetto della classe "NumeroOccorrenze" e assegna la stringa all'attributo "stampe"
    public void StampaOccorrenze (NumeroOccorrenze stampe){
        
        //Assegno il valore di "conteggio" all'attributo "stampe" attraverso il metodo get
        this.stampe = stampe.getConteggio();
        
    }
    
    //Creo il metodo "Stampa" che stampa la lettera "a"
    public void Stampa () {
        
        //Creo il ciclo for per stampare la lettera "a" per il numero di volte corrispondente al valore di "stampe"
        for(int i = 0; i < stampe; i++){
            
            //Stampa la lettera "a"
            System.out.print("a\t");
            
        }
        
    }
}
