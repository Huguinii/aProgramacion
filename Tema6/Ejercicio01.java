package Tema6;
import java.util.Scanner;
import java.util.ArrayList;
/**
* crear arraylist que contenga los 50 primeros numeros 
* metodo que elimine numeros que empiecen por 2^^
* 
* (solucionar problemas de eliminacion de numeros)
* 
* 
*/
public class Ejercicio01{
    public static void main (String [] args){
     ArrayList numeros = new ArrayList();
     for (int i=0; i<=50; i++){
         numeros.add(i);
     }
     Scanner teclado = new Scanner (System.in);int elemento = 0;
     do {
        System.out.println(numeros.toString());System.out.print("Dame un numero que quieras eliminar de la lista: ");
        elemento = teclado.nextInt();
        if (numeros.contains(elemento)){
           numeros.remove(elemento);
           } else {
           System.out.println("El elemento no figura en la lista, adios");
           }
     }while (elemento != -1);
 }
}