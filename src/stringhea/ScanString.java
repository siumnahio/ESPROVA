/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringhea;

import java.util.Scanner;

/**
 *
 * @author pietr
 */
public class ScanString {
    public String Scan(){
        String parolaString;
        
        System.out.println("Inserire stringa:");
        
        //leggo da tastiera
        Scanner scanner = new Scanner(System.in);
        parolaString = scanner.nextLine();
        
        //ritorno la stringa per passarla a Convert
        return parolaString;
        
        
        
    }
   
    
}
