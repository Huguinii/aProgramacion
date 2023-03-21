import java.util.Scanner;
/**
 * Write a description of class PruebaEjercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaEjercicio3
{
    public static void main(String args[]){
      int año=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Dame un año");
      año=sc.nextInt();
      String salida = año%4==0 || año%100==0 ||año%400==0? "Es bisiesto":"No es bisisesto";
      System.out.println(salida);
    }
}
