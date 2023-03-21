package Condicionales.Tarea3;
import java.util.Scanner;
public class Ej10{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int number;
        number = getNumber();
        System.out.println(tabla(number));
        sc.close();
    }
    private static String tabla(int number){
        String output;
        output = "";
        for (int i = 0; i <= 10; i++){
            output += " " + number + " x " + i + "\t= " + (number * i) + "\n";
        }
        return output;
    }
    private static int getNumber(){
        int number;
        System.out.println("\nIntroduce un número natural en el rango [1,10]:\n");
        number = sc.nextInt();
        while (!checkRange(number)){
            System.out.println("\nDebe ser un número natural en el rango [1,10]:\n");
            number = sc.nextInt();
        }
        return number;
    }
    private static boolean checkRange(int numero){
        if (numero > 0 && numero < 11){
            return true;
        }
        return false;
    }
}
