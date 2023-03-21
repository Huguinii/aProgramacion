package Condicionales;
import java.util.Scanner;

/**
 * Write a description of class Hora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 *///dependiendo de la hora de 6 a 12 de la mañana dira buenos dias, de 12 a 22 pm buenas tardes y de 22 a 6 buenas noches,
public class Saludame
{
    static Scanner sc= new Scanner(System.in);
    public static void main(String args[]){
        int hora=0;
        System.out.println("¿Que hora es?");
        hora = sc.nextInt();
        if (hora >=6 && hora <=12){
            System.out.println("Buenos dias");
        }else if (hora >12 && hora <22){
            System.out.println("Buenas tardes");
        }else if(hora >=22 && hora <=24 || hora>=0 && hora<6){
            System.out.println("Buenas noches");
    }else
        System.out.println("No es una hora valida");
        sc.close();
    }}
