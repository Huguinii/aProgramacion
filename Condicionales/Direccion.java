package Condicionales;
import java.util.Scanner;
//el programa solicita una palabra abajo arriba derecha izquierda dependiendo
    //del termino introducido mostrara la flecha correspondiente
/**
 * Write a description of class Direccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Direccion
{
    public static void main(String[]args){
        String direccion;
        char flechaArriba ='\u2191';
        char flechaAbajo ='\u2193';
        char flechaDerecha ='\u2192';
        char flechaIzquierda ='\u2190';
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduzca una direccion");
        direccion = teclado.next();
        
       if(direccion.equalsIgnoreCase("Arriba")){
            System.out.println(flechaArriba);
       }else if(direccion.equalsIgnoreCase("Abajo")){
           System.out.println(flechaAbajo);
       }else if(direccion.equalsIgnoreCase("Derecha")){
           System.out.println(flechaDerecha);
       }else if(direccion.equalsIgnoreCase("Izquierda")){
           System.out.println(flechaIzquierda);
       }else{
           System.out.println("No es una direccion");
       }
       teclado.close();
    }
}