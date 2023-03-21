package Ejercicios;
import java.util.Scanner;

/**
 * Write a description of class Uno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uno
{
     public static void main(String[]args){
         int numero=0;
         Scanner sc = new Scanner(System.in);
         System.out.println("Dame un numero");
         numero= sc.nextInt();
         if (numero%2==0){
             System.out.println("Es par");
         }else{
             System.out.println("Es impar");
         }
     }
}
