package SegundaEvaluacion;
import java.util.Scanner;

/**
 * Write a description of class kdkld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlmacenarMaximo
{
    public static void main(String[]args){
        int tamano=0;
        int enteros[];
        int mayor=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero de datos que quieres almacenar");
        tamano=sc.nextInt();
        enteros=new int[tamano];
            for(int pos=0;pos<tamano;pos++){
            System.out.println("Dame el valor "+(pos+1));
            enteros[pos]=sc.nextInt();
            if(enteros[pos]>mayor)
                mayor=enteros[pos];
                
            System.out.println(enteros[pos]+("\t"));
            
            System.out.println("\nEl valor mayor es el "+mayor);
        }
    }
}