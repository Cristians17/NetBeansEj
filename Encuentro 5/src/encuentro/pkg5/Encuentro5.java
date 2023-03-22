/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg5;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Encuentro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int num1;
        int num2;
        System.out.println("Ingrese dos numeros enteros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        if (num1>25 && num2>25){
            System.out.println("Los dos numeros ingresados son mayores a 25");
            
        } else if (num1>25 || num2>25){
            System.out.println("Al menos uno de los numeros ingresados es mayor a 25");
       
            
        }else{
            System.out.println("Ninguno de los numeros ingresados es mayor a 25");
        }
        
                
        
    }
    
}
