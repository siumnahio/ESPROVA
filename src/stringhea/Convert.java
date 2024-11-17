/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringhea;

/**
 *
 * @author pietr
 */
public class Convert {
    public char[] StringToArray(String parolaString){
        char[] parolaArray = new char[parolaString.length()];
        
        //converto da stringa ad array di char
        for(int i=0;i<parolaString.length();i++){
            parolaArray[i] = parolaString.charAt(i);
        }
        
        //ritorno l'array per passarlo a Count
        return parolaArray;
        
    }
    
}
