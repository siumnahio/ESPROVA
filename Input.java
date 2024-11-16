package com.mycompany._4id_gonzaga_stringhe;

//Importo la classe Scanner
import java.util.Scanner;

//Creo la classe "Input" che richiede all'utente una stringa 
public class Input {
    
    //Dichiaro l'attributo "stringa" che ha una visibilità privata ed è di tipo privato
    private String stringa; 
    
    //Creo il metodo "Richiesta" per la richiesta all'utente
    public void Richiesta(){
        
        //Creo un oggetto di tipo Scanner per leggere l'input da tastiera
        Scanner InputStringa = new Scanner(System.in);
        
        //Mostra un messaggio per chiedere la stringa all'utente
        System.out.println("Inserisci una frase: "); 
        
        //La stringa inserita dall'utente viene memorizzata nell'attributo "stringa"
        stringa = InputStringa.nextLine();
        
    }
    
    //Creo il metodo get per permettere l'accesso alle altre classi al valore dell'attributo "stringa"
    public String getStringa (){
        
        //Il metodo get ritorna il valore di stringa
        return stringa;
        
    }
    
}
