/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio2_numAleatorio {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que llene un vector de tamaño N con valores 
     * aleatorios y le pida al usuario un número a buscar en el vector. 
     * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        Random rd=new Random ();
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
        int [] vector = new int [n];
        
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) rd.nextInt(10);
            
            System.out.print(vector[i] + " ");
            
        }
        System.out.println("Ingrese el numero a buscar en el vector");
        int num=leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            if (num==vector[i]) {
                System.out.println("El numero se encontro en la posicion: " + i );
                
            }
            
        }
    }
    
}
