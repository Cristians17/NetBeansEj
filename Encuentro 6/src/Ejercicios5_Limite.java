
import static java.time.Clock.system;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian
 */
public class Ejercicios5_Limite {

    /**Escriba un programa en el cual se ingrese un valor límite positivo, 
     * y a continuación solicite números al usuario hasta que la suma de los 
     * números introducidos supere el límite inicial.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int limite, num, suma=0;
        System.out.println("Ingrese un limite");
        limite=leer.nextInt();
        
        do {
            System.out.println("Ingrese un numero");
            num=leer.nextInt();
            suma=suma+num;
            
        } while (suma<40);
        System.out.println("La suma de los numeros ingresados supero el limite");
                
    }
    
}
