package SegundaEvaluacion;
import java.util.Scanner;

/**
 * Write a description of class SolicitaPalabra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SolicitaPalabra
{
    //solicita una palabra y la almacena en un array de char de tal forma que luego podamos solicitar la posicion
    //dame la letra que ocupa la
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String palabra;
        char[] letras;
        int tamano;
        int posicion=0;
        System.out.println("Dime una palabra");
        palabra=sc.nextLine();
        letras=palabra.toCharArray();
        tamano=letras.length;
        for(int i=0;i<tamano;i++){
            do{
            System.out.println("Dame la letra que ocupa la posicion");
            posicion=sc.nextInt();
            
            }while(posicion<0 || posicion>=tamano);
            System.out.println(letras[posicion]);
            
        }
        
        
    }
    
    
}