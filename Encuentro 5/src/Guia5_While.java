
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
public class Guia5_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner (System.in);
      Double nota;
        System.out.println("Ingrese su nota");
      nota=leer.nextDouble();
      
      while (nota<0 || nota>10){
          System.out.println("El numero ingresado no corresponde a una nota, ingrese un numero entre 0 y 10");
          nota=leer.nextDouble();
          
      }
        System.out.println("Gracias. Su nota fue registrada");
        
    }
    
}
