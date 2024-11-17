/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringhea;

/**
 *
 * @author pietr
 */
public class CountA {
    public int Count(char[] parolaArray){
        int count = 0;
        
        //conto il numero di a nell'array incrementando count
        for(int i=0;i<parolaArray.length;i++){
            if(parolaArray[i]=='a' || parolaArray[i]=='A')
                count++;
        }
        
        //ritorno counrt per passarlo a Print
        return count;
    }
}
