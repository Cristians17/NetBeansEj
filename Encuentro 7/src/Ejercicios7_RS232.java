
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
public class Ejercicios7_RS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        String cadena="00000";
        int correctas=0;
        int incorrectas=0;
       
                
        
        
        while (!(cadena.equals("&&&&&"))) {
            
            System.out.println("Ingrese una cadena tipo RS232 (X***O)");
            cadena=leer.next();
           
            
            int longi=cadena.length();
         
            
                    
            if (longi==5) {
                String PrimerLetra=cadena.substring(0,1);
                String UltimaLetra=cadena.substring(4,5);
                
                if ((PrimerLetra.equals("X")) && (UltimaLetra.equals("O"))){
                    
                    correctas=correctas+1;
                    
                }else{
                    incorrectas=incorrectas+1;
                }
                
            }else{
                
                incorrectas=incorrectas+1;
                
            }
            
        }
        System.out.println("Se ingresaron: ");
        System.out.println(correctas + " lecturas correctas");
        System.out.println(incorrectas + " lecturas incorrectas");
    }
    
}
