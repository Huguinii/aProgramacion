package Condicionales.Tarea3;
import java.util.Scanner;

public class Ej12{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        float nota;
        int suspensos;
        suspensos = 0;
        for (int i = 0; i < 5; i++){
            nota = getNumber();
            if (!checkPass(nota)){
                suspensos++;
            }
        }
        System.out.println((suspensos==1)?"\nHay " + suspensos + " suspenso." : "\nHay " + suspensos + " suspensos." );
        sc.close();
    }
    private static float getNumber(){
        float number;
        System.out.println("\nIntroduce la nota en el rango [0,10]:\n");
        number = sc.nextFloat();
        while (!checkRange(number)){
            System.out.println("\nDebe ser un número en el rango [0,10]:\n");
            number = sc.nextFloat();
        }
        return number;
    }
    private static boolean checkRange(float numero){
        if (numero >= 0 && numero <= 10){
            return true;
        }
        return false;
    }
    private static boolean checkPass(float numero){
        if (numero >= 5 && numero <= 10){
            return true;
        }
        return false;
    }
}
