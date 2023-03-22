/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg11;

import java.util.Random;

/**
 *
 * @author Cristian
 * 
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     * Escriba un programa que averigüe si dos vectores de N enteros son iguales
 * (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
     */
    public static void main(String[] args) {
        
        Random rd=new Random();
        
        boolean igualdad= true;
        int [] vector1=new int [3];
        int [] vector2=new int [3];
        
        
        for (int i = 0; i < 3; i++) {
            vector1[i]=(int)rd.nextInt(3);
            
            System.out.print("[" + vector1[i] + "]");
                  
        }
        System.out.println(" ");
        
        for (int i = 0; i < 3; i++) {
            vector2[i]=(int)rd.nextInt(3);
            System.out.print("[" + vector2[i] + "]");
        }
        
        System.out.println(" ");
        
        for (int i = 0; i < 3; i++) {
            if (vector1[i]!=vector2[i]) {
              igualdad=false;
              break;
            }
                           
        }
        if (igualdad) {
            System.out.println("Los numeros de los vectores son iguales");
            
        }else{
            System.out.println("Los numeros del vector no son iguales");
                
        }
        
    }
    
}
