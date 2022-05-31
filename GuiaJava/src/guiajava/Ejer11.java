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
public class Ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un texto que termine en .");
        String txt = leer.nextLine();
         txt = txt.toLowerCase();
         String txt2;
         
         
         
        if (txt.endsWith(".")){
           txt2= trans(txt);
            System.out.println(txt2);
        }else{System.out.println("no termina en puno tu texto maquinola");}
        
        
        

    }
   
    public static String trans(String moco){
        String text =" ";
        
       
        for (int i = 0; i < moco.length(); i++) {
            switch(moco.substring(i,i+1))
            {
                case "a":text=text.concat("@");
                break;
                  
                case "e":text=text.concat("#");
                break;
                
                case "i":text=text.concat("$");
                break;
                  
                case "o":text=text.concat("%");
                break;
                
                case "u":text=text.concat("*");
                break;
               
                default: text=text.concat(moco.substring(i,i+1));
            }
        }
        return text;
    }
}




