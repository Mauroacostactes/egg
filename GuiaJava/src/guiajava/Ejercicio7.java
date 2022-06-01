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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("ingresa la frase para saber si es 'eureka' porfi");
        String frase = leer.nextLine();
        
        frase = frase.toLowerCase();
        
        String eurek = "eureka";
        
        if(frase.equals(eurek)){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    
        
    }
    
}
