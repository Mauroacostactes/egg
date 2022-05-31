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
public class Ejer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int num;
        int sum = 0;
        
        
        do {
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            if(num > 0){
            sum = sum+num;
            cont = cont+1;
            }else if(num == 0){
                System.out.println("pusite 0 maquinola, nos vemo en disney");
                break;
                
            }
                
        }while(cont <20);
        System.out.println("La suma da: "+sum);
        // TODO code application logic here
    }
    
}
