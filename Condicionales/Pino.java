package Condicionales;

import java.util.Scanner; 


/** 

 * Write a description of class Pino here. 

 *  

 * @author (your name)  

 * @version (a version number or a date) 

 */ 

public class Pino 

{ 
    public static void main(String[] args){ 
        int altura= 0; 
        System.out.println("Dame altura"); 
        Scanner sc = new Scanner(System.in); 
        altura=sc.nextInt(); 
        if(altura>2){ 
            for( int fila=1; fila<=altura;fila++){ 
                for( int blanco=1;blanco<=altura-fila; blanco++){ 
                    System.out.print(" "); 
                } 
                for (int asterisco = 1 ; asterisco<=(fila*2-1);asterisco++){ 
                    System.out.print("*"); 
                } 
                System.out.println(); 
            } 
            for (int base = 1 ;base<=2;base++){ 
                for (int blanco= 1 ; blanco <=altura-1;blanco++){ 
                    System.out.print(" "); 
                } 
                System.out.println("x"); 
            } 
        } 
    } 
} 