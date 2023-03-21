
/**
 * Write a description of class VariableDecimales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class VariableDecimales
{
public static void main(String[] args){
        final double PI = 3.1416;
        final double PRECISION = 0.0001;
        double numero;
        double dif;
        System.out.println("Introduce el número PI");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextDouble();
        dif = Math.abs(PI - numero);
        System.out.println("¿El número introducido es PI?: " + (((PI-numero)>=0 && (PI-numero)<=0.00001)||((numero-PI)>=0 && (numero-PI)<=0.00001)));
    }
}
