package Clases;
import java.util.Scanner;

/**
 * Write a description of class Bucle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bucle
{
    static String palabra,cadena;
    
    static Scanner sc= new Scanner(System.in);
    //programa en el que se soliciten palabras el programa debe mostrar la primera palabra que encontrariamos en
    // el diccionario y la ultima cuando se finalice la ejecucion del programa
    //programa que solicite palabras hasta que se introduzca fin
    public static void main(String[]args){
        menu();
        
    }
    private static void pedirPalabra(){
        System.out.println("Dame una palabra");
        palabra=sc.nextLine();
        while(palabra!="fin"){
            pedirPalabra();
        }
        
        
        
        //menu();
    }
    private static void menu(){
        int menu,longitud;
        cadena= ("1.Introduce palabra");
        longitud=cadena.length();
        System.out.println(" ".repeat(longitud/2-2)+"MENU");
        System.out.println("=".repeat(longitud));
        System.out.println("1.Introduce palabra\n2.Fin, end");
        menu=sc.nextInt();
        
        switch(menu) {
            case 1:
                pedirPalabra();
                break;
            case 2:
                System.out.println("Cerrando");
                sc.close();
                break;
            default:
                System.out.println("No me sirve");
                menu();
            }
    }    
}