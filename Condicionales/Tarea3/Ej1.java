package Condicionales.Tarea3;
import java.util.Scanner;
public class Ej1{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(checkNumber());
        sc.close();
    }
    private static String checkNumber(){
        int number;
        number = getNumber();
        while (number!=0){
            System.out.println(
            "\nEl número introducido es " +
            (checkPositivo(number)? "positivo, ":"negativo, ") +
            (checkPar(number)? "par, ":"impar, ") +
            "y su cuadrado es " +
            (number * number) +
            ".\n"
            );
            number = getNumber();
        }
        return "\nAdiós.";
    }
    private static int getNumber(){
        System.out.println("\nIntroduce un número por teclado.\nEl programa se detendrá si el número introducido es 0.\n");
        return sc.nextInt();
    }
    private static boolean checkPositivo(int number){
        if (number > 0){
            return true;
        }
        return false;
    }
    private static boolean checkPar(int number){
        if (number%2 == 0){
            return true;
        }
        return false;
    }
}
