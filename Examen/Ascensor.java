package Examen;

import java.util.Scanner;
/**
 * Write a description of class Ascensor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ascensor
{
    public static void main(String[]args){
        String direccion;
        int piso;
        char flechaArriba ='\u21E7';
        char flechaAbajo ='\u21E9';
        Scanner sc = new Scanner(System.in);
        System.out.println("A que piso quieres ir");
        piso=sc.nextInt();
        System.out.println("En que direccion vas");
        direccion=sc.next();
        if(piso >0 && piso<=10)
         switch (direccion){
         case "arriba":
            System.out.println("1"+flechaArriba);
         }
}
    
}
