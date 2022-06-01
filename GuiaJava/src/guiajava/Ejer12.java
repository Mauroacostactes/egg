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
public class Ejer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("ingrese un valor");
        int num = leer.nextInt();
        
        System.out.println("ingrese otro valor");
        int num2 = leer.nextInt();
        
        EsMultiplo(num,num2);
       
       
    }
    
    public static void EsMultiplo (int num,int num2){
       int valor = num % num2;
       
        if(valor==0){
            System.out.println("El numero -> "+num+" es multiplo de: "+num2);
        }else{
            System.out.println("No es multiplo");
        };
        
    }
    
}
