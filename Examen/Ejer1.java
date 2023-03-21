package Examen;
import java.util.Scanner;

/**
 * Write a description of class Ejer1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer1
{
    public static void main(String[]args){
        int lado=0;
        char caracter;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame un numero");
        lado=sc.nextInt();
        System.out.println("Dame un caracter");
        caracter=sc.next().charAt(0);
        
        for( int fila=3; fila<=lado; fila++){ 
            for( int blanco=1;blanco<=lado-fila; blanco++){ 
                    System.out.print(" "); 
                } 
            for (int asterisco = 1 ; asterisco<=(fila*2-1);asterisco++){ 
                System.out.print(caracter); 
            }
            System.out.println();
        }
        System.out.println("Es a lo maximo que e llegado lo siento PEPPOSAD");
    } 
}
