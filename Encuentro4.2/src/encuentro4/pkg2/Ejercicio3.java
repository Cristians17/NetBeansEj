/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro4.pkg2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Cristian
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        String frase;
        System.out.println("Esciba una frase");
        frase=leer.nextLine();
        System.out.println("Su frase en mayusculas es: " + toUpperCase(frase));
        System.out.println("Su frase en minusculas es: " + toLowerCase(frase));
        

      
    }
    
}
