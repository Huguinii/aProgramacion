package Ejercicios;
import java.util.Scanner;

/**
 * Write a description of class Tres here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seis
{
    public static void main(String[]args){
        int numero=0;
        int numero2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entero");
        numero= sc.nextInt();
        System.out.println("Dame otro numero entero");
        numero2= sc.nextInt();
        if(numero>numero2){
        System.out.println("\n"+numero);
        System.out.println(numero2);
    }else if(numero<numero2){
        System.out.println("\n"+numero2);
        System.out.println(numero);
    }else{
        System.out.println("Son iguales");
    }
}
}
