package Ejercicios;
import java.util.Scanner;

/**
 * Write a description of class Tres here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cinco
{
    public static void main(String[]args){
        double numero=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entero");
        numero= sc.nextDouble();
        if(numero<1 && numero!=0 && numero>(-1)){
            System.out.println("El numero es casi-cero");
        }else{
            System.out.println("El numero no es casi-cero");
        }
    }
}