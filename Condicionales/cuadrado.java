package Condicionales;
import java.util.Scanner;

/**
 * Write a description of class cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cuadrado
{
    static int altura=0;
    public static void main(String[]args){
        pedirAltura();
        dibujaCuadrado();
    }
    
    private static void dibujaCuadrado(){
        for (int i=1; i<=altura; i++){
            for(int j=1; j<=altura; j++){
                if(j==1 || j==altura || i==1 || i==altura || (i+j)-1==altura){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
   
    private static void pedirAltura(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame una altura");
        altura=sc.nextInt();
        
    }
}
