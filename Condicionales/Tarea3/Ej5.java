package Condicionales.Tarea3;
import java.util.Scanner;

public class Ej5{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(compruebaNumero());
        sc.close();
    }
    private static String compruebaNumero(){
        int numero, min, max;
        min = estableceMínimo();
        max = estableceMáximo(min);
        System.out.println("\nIntroduce un número en el rango [" + min + ", " + max + "]:\n");
        numero = sc.nextInt();
        while (!(numero >= min && numero <= max)){
            System.out.println("\nEl número ha de estar en el rango [" + min + ", " + max + "]\n");
            numero = sc.nextInt();
        }
        return "\nEl número " + numero + " pertenece al rango [" + min + ", " + max + "]";
    }
    private static int estableceMínimo(){
        int min;
        System.out.println("\nIntroduce el valor mínimo del rango:\n");
        min = sc.nextInt();
        return min;
    }
    private static int estableceMáximo(int min){
        int max;
        System.out.println("\nIntroduce el valor máximo del rango:\n");
        max = sc.nextInt();
        while (max <= min) {
            System.out.println("\nEl número máximo del rango ha de ser mayor que el mínimo.\n");
            max = sc.nextInt();
        }
        return max;
    }
    
}
