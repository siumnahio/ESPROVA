package stringhea;

/**
Pietro Leoni 4INF.D   16/11/2024
* 
Funzionamento: Scrivi un programma in java che lasci inserire ad un utente una stringa e 
cerchi quante volte appare la lettera "a" in essa successivamente stampa la lettera "a" 
in maiuscolo tante volte quanto è stata trovata. Tutte queste funzioni devono essere esterne al main.
 */

public class StringheA {

    public static void main(String[] args) {
        
        ///inizializzo tutti le classi
        ScanString ScanString = new ScanString();
        Convert Convert = new Convert();
        CountA CountA = new CountA();
        PrintA PrintA = new PrintA();
        
        // chiamo Scan che ritorna una stringa a StringToArray, che converte
        // la stringa in un'arrayy di char e lo passa a Count, che ne conta le A
        // e passa il risultato a Print che stampa le a corrispondenti
        
        PrintA.Print(CountA.Count(Convert.StringToArray(ScanString.Scan())));
        
    }
    
}
 