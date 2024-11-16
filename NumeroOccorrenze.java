package com.mycompany._4id_gonzaga_stringhe;

//Creo la classe "NumeroOccorrenze" per calcolare le occorrenze della lettera "a"
public class NumeroOccorrenze {
    
    //Dichiaro e inizializzo l'attributo "conteggio" che ha visibilità privata ed è di tipo int
    private int conteggio = 0;
    
    //Dichiaro e inizializzo l'attributo "Frase" che ha visibilità privata ed è di tipo string
    private String Frase;
    
    //Creo il metodo che prende come parametro un oggetto della classe "Input" e assegna la stringa all'attributo "Frase"
    public void NumeroOccorrenze (Input Frase){
        
        //Assegno la stringa inserita dall'utente all'attributo "Frase" attraverso il metodo get
        this.Frase = Frase.getStringa();
        
    }
    
    //Creo il metodo "Occorrenze" che calcola le occorrenze della lettera "a" nella stringa inserita dall'utente
    public void Occorrenze (){
        
        //Creo il ciclo che attraversa ogni singolo carattere della stringa
        for(int i = 0; i < Frase.length(); i++){
            
            //Verifico se il carattere == "a"
            if(Frase.charAt(i) == 'a'){
                
                //Incremento l'attributo "conteggio" quando il carattere == "a"
                conteggio++;
                
            }
        }
        
        //Mostra un messaggio che stampa il valore dell'attributo "conteggio"
        System.out.println("La lettera a appare nella stringa " + conteggio + " volte"); 
    }
    
    //Creo il metodo get per permettere l'accesso alle altre classi al valore dell'attributo "conteggio"
    public int getConteggio (){
        
        //Il metodo get ritorna il valore di conteggio
        return conteggio;
    
    }
}
