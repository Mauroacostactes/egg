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
public class Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("TIPO DE MOTOR PLIS");
        int tipomot = leer.nextInt();
        
        switch (tipomot){
            case 1:
                    System.out.println("La bomba es una bomba de agua");
            break;
            case 2:
                    System.out.println("La bomba es una bomba degasolina");
            break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
            break;
            case 4:
                System.out.println("la bomba es una bomba de pasta alimenticia");
            break;
            default:
                System.out.println("opcion no valida pibe");
          
        }
        
    }
    
}