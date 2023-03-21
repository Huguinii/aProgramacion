package Condicionales;
import java.util.Scanner;
//solicitar un numero entre 1 y 7 si no lo es el programa no continua si cumple la condicion nos dira el dia de la semana que nos corresponde.
/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DimeDiaSemana{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int dia=0;
        System.out.println("Dime un numero entre 1 y 7");
        dia = sc.nextInt();
        if (dia >0 && dia  <=7){
            switch (dia){
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
            }       
        }else{
            System.out.println("No es un numero entre 1 y 7");
            sc.close();
        }
    }
}