
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
public class Ejercicios_3_Divisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int euros;
       String opc;
       System.out.println("Ingrese la cantidad de euros a convertir");
        euros=leer.nextInt();
        System.out.println("Seleccione la moneda(dolar, yen o libra)");
        opc=leer.next();
        
        conversor(opc,euros);
               
    }
    
    public static void conversor(String opc, int euros){
        
        
        
        switch(opc){
            case "libra":
                System.out.println("sus euros equivalen a: " + euros*0.86 + "libras");
                break;
            case "yen":
                System.out.println("sus euros equivalen a: " + euros*129.852 + "yenes");
                break;
            case "dolar":
                System.out.println("sus euros equivalen a: " + euros*1.28611 + "dolares");
                break;
                        
                
        }
    }
}
