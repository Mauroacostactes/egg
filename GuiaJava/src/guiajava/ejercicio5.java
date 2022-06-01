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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
     System.out.println("ingresa un numero papu");
     int num = leer.nextInt();
     
        System.out.println(num*2+"  "+num*3+"  "+Math.sqrt(num));
        

     
    }
    
}
