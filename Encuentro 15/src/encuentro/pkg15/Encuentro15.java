/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg15;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Encuentro15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el número de ISBN (13 numeros)");
        long ISBN= leer.nextLong();
        

        leer.nextLine();
        System.out.println("Ingrese el nombre del Libro: ");
        String nombre= leer.nextLine();
        
        System.out.println("Ingrese el Autor");
        String autor= leer.nextLine();
        
        System.out.println("Ingrese el numero de paginas: ");
        int paginas= leer.nextInt();
        
        Libro libro1= new Libro(ISBN, nombre, autor, paginas);
        
        System.out.println(libro1.toString());
    
        
            
    }
    
    

}
