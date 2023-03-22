
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
public class Guia_Ejercicio_multiplos {

    /**Crea un procedimiento EsMultiplo que reciba los dos números 
     * pasados por el usuario, validando que el primer número múltiplo 
     * del segundo e imprima si el primer número es múltiplo del segundo, 
     * sino informe que no lo son.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese un número entero");
        num1=leer.nextInt();
        System.out.println("Ingrese otro número entero");
        num2=leer.nextInt();
        
        multiplo(num1,num2);
        
    }
        
    
    public static void multiplo(int num1, int num2){
            
        if (num1%num2==0) {
            System.out.println("El primer número ingresado es multiplo del segundo");
            
        }else {
            System.out.println("El primer número ingresado NO es multiplo del segundo");
        }
        
        
            
    }
        
        
    
    
}
