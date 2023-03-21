package Condicionales;
import java.util.Scanner;
//solicitar 3 numeros y mostrar de mayor a menor
/**
 * Write a description of class DimeElMayorDeDos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DimeElMayorDeDos
{
    public static void main(String args[]){
        int numero1;
        int numero2;
        int numero3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        numero1=sc.nextInt();
        System.out.println("Dame otro numero");
        numero2=sc.nextInt();
        if (numero1>numero2){
                System.out.print("\n"+numero1);
                System.out.print(" Es mayor que ");
                System.out.print(numero2);
            }else if(numero1<numero2){
                    System.out.print("\n"+numero2);
                    System.out.print(" Es mayor que ");
                    System.out.print(numero1);
                }else{
                    System.out.println("Los numeros son iguales");
                }
            }
        }


