package SegundaEvaluacion;
import java.util.Scanner;
/** 
* Write a description of class ArrayChars here. 
*  
* @author (your name)  
* @version (a version number or a date) 
*/ 
public class ArrayChars 
{ 
    public static void main(String[] args){ 
        Scanner teclado=new Scanner(System.in); 
        String palabrita; 
        char[] letras; 
        int tamano; 
        int posicion= 0; 
        System.out.println("Dame una palabra"); 
        palabrita=teclado.nextLine(); 
        letras= palabrita.toCharArray(); 
        tamano=letras.length; 
        ArrayEnteros misPosiciones = new ArrayEnteros(tamano); 
        for(int i=0;i<tamano;i++){ 
            do{ 
                System.out.println("Dame la letra que ocupa la posición"); 
                posicion= teclado.nextInt(); 
            }while(posicion<0 || posicion>=tamano || misPosiciones.searchPos(posicion)!=-1) ; 
            misPosiciones.add(posicion); 
            System.out.println(letras[posicion]); 
        }
    }
}