package Condicionales.Tarea3;
import java.util.Scanner;

public class Ej14{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println(triangle(getNumber()));
       sc.close();
    }
    private static String triangle(int sice){
        String output;
        output = "";
        while (sice > 0){
            output+="\n" + "*".repeat(sice);
            sice--;
        }
        return output;
    }
    private static int getNumber(){
        int number;
        System.out.println("\nIntroduce el lado del triángulo:\n");
        number = sc.nextInt();
        while (!checkRange(number)){
            System.out.println("\nDebe ser un número natural en el rango [2,25]:\n");
            number = sc.nextInt();
        }
        return number;
    }
    private static boolean checkRange(int numero){
        if (numero > 1 && numero < 25){
            return true;
        }
        return false;
    }
}
