package Condicionales.Tarea3;
import java.util.Scanner;

public class Ej13{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        float nota;
        int suspensos, condicionados, aprobados;
        suspensos = 0;
        condicionados = 0;
        aprobados = 0;
        for (int i = 0; i < 6; i++){
            nota = getNumber();
            if (!checkPass(nota)){
                suspensos++;
            }
            if (checkCondicionados(nota)){
                condicionados++;
            }
            if (checkPass(nota)){
                aprobados++;
            }
        }
        System.out.println((suspensos==1)?"\nHay " + suspensos + " suspenso." : "\nHay " + suspensos + " suspensos." );
        if (condicionados > 0) {
            System.out.println((condicionados==1)?"\nDe los cuales " + condicionados + " condicionado." : "\nDe los cuales " + condicionados + " condicionados." );
        }
        System.out.println((aprobados==1)?"\nHay " + aprobados + " aprobado." : "\nHay " + aprobados + " aprobados." );
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
    private static boolean checkCondicionados(float numero){
        if (numero >= 4 && numero < 5){
            return true;
        }
        return false;
    }
}
