package Condicionales;
import java.util.Scanner;

/**
 * Write a description of class Multiplo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */// si el numero introducido es par, mayor de 2, multiplo de 12
// es mayor que 1024, ha sido introducido despues de un 5
// entonces mostrar el numero, sino no.
public class Multiplo
{
    public static void main(String[]args){
        int num1;
        int num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame un numero");
        num1=sc.nextInt();
        System.out.println("Dame un numero");
        num2=sc.nextInt();
        if(num1==5 && num2%12==0 && num2>1024){
            System.out.println("Me sirve");
        }else{
            System.out.println("No me sirve");
            sc.close();
        }
    }
    
        
    









}
