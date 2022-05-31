/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajava;
import java.util.Scanner;
/**
 *
 * @author Mauro
 */
public class Ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
            boolean bandera = true;
            
        while (bandera == true){
            System.out.println("ingrese una nota");
                int nota = leer.nextInt();
                    if (nota > 0 && nota < 11){
                       System.out.println("Nota valida");
                       bandera = false;
                     }
             }
    }
    
}
