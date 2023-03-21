package Condicionales;
import java.util.Scanner;

/**
 * Write a description of class Bisiesto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bisiesto
{
    public static void main(String[]args){
        int año=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año");
        año = sc.nextInt();
        if (año%4==0 && año%100!=0 || año%400==0){
            System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }
    }
}
