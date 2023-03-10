/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro4.pkg2;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Double num;
        System.out.println("Ingrese un numero");
        num= leer.nextDouble();
        Double doble=num*2;
        Double triple=num*3;
        Double raiz=Math.sqrt(num);
        System.out.println("El doble del numero ingresado es: " + doble);
        System.out.println("El triple del numero ingresado es: " + triple);
        System.out.println("La raiz del numero ingresado es: " + raiz);
        
    }
    
}
