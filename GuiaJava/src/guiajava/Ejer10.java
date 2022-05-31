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
public class Ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese un valor entre 1 y 20");            
            num = leer.nextInt();
            if (num > 0 && num < 21){
                for (int j = 0; j < num; j++) {
                System.out.print("*");}
            
            }else{System.out.println("le erraste maquina era de 1 a 20");}
        }
    }
    
}
