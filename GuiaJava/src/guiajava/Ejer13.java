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
public class Ejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("¿cuantos compa son?");
        int tam = leer.nextInt();
        
        String[] equipo = new String[tam];
        
        String nom;
        
            System.out.println("Ingrese los nombres"); 
            nom = leer.nextLine();
        
        for (int i = 0; i < (tam); i++) {
            nom = leer.nextLine();
            equipo[i]=nom;
        }
        

        System.out.println(" ");
        System.out.println("Los Nombres son:"); 
        for (int i = 0; i < tam; i++) {
            System.out.print("["+equipo[i]+"]");
        }
        
    }
    
}
