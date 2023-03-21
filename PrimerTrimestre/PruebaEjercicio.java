import java.util.Scanner;
/**
 * Write a description of class PruebaEjercicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaEjercicio
{
    public static void main(String[] args){
        double numero;
        Scanner teclado= new Scanner (System.in);
        System.out.println("Dame un numero");
        numero = teclado.nextDouble();
        double number;
        number = numero;
        String str = String.valueOf(number);
        int intNumber = Integer.parseInt(str.substring(0, str.indexOf('.')));
        float decNumbert = Float.parseFloat(str.substring(str.indexOf('.')));
        int decNumberInt = Integer.parseInt(str.substring(str.indexOf('.') + 1));

        System.out.println(intNumber);
        System.out.println(decNumbert);
        System.out.println(decNumberInt);
    }
}
