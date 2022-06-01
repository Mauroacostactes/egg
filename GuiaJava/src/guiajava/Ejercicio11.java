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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num;
      int num2;
      boolean ban = false;
      int op;
      String op2;
      
      System.out.println("Ingrese dos valores");
      num = leer.nextInt();
      num2 = leer.nextInt();
        
      while(ban==false){
          
        System.out.println("");
        System.out.println("MENU");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        op = leer.nextInt();
        
        switch(op)
        {
            case 1:
            System.out.println("La suma es: "+(num+num2));
            break;
            case 2:
             System.out.println("La resta es: "+(num-num2));
            case 3:
            System.out.println("La multiplicacion es: "+(num*num2));
            break;
            case 4:
            System.out.println("La division es: "+(num/num2));
            break;
            case 5:
            ban=false;
            break;           
            default:
            System.out.println("opcion no valida pibe");
        }
      }      
      
        
        
        
       
    }
    

    
}
