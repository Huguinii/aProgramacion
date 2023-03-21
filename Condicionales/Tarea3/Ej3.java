package Condicionales.Tarea3;
import java.util.Scanner;
public class Ej3{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("\nAdivina el número\n=================");
        System.out.println(play());
    }
    private static String play(){
        int target, intento;
        target = random(0, 100);
        intento = getNumber();
        while (intento != target) {
            if (intento == -1){
                return "\nAdiós";
            } else if (intento < 0){
                System.out.println("\nEl número introducido no puede ser menor de 0. \nIntroducir -1 finaliza el programa.");
            } else if (intento < target) {
                System.out.println("\nEl número introducido es menor que el objetivo.");
            } else if (intento > target) {
                System.out.println("\nEl número introducido es mayor que el objetivo.");
            }
            intento = getNumber();
        }
        return "\nEl número era " + target + ". ¡Has ganado!";
    }
    private static int getNumber(){
        System.out.println("\nIntroduce un número.\nEl programa se detendrá si el número introducido es -1.\n");
        return sc.nextInt();
    }
    private static int random(int min, int max){
        return (int) (Math.random() * (max - min) + min);
    }
}
