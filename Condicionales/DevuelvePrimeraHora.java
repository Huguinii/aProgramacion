package Condicionales;
import java.util.Scanner;

/**
 * Write a description of class DevuelvePrimeraHora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DevuelvePrimeraHora
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
      System.out.println("Dime un dia");
      String dia;
      dia = sc.next();
      
      switch (dia){
            case "Lunes":
                System.out.println("Programacion");
                break;
            case "Martes":
                System.out.println("Libre");
                break;
            case "Miercoles":
                 System.out.println("Programacion");
                break;
            case "Jueves":
                 System.out.println("Lenguaje de Marcas");
                break;
            case "Viernes":
                 System.out.println("Bases de Datos");
                break;

      }       
  }
}
//devuelve introduciendo cada dia lo que toca a primero hora
//3 dias a la semana libre no quiero 3 condiciones libre

