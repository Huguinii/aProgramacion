package Condicionales.Tarea3;
import java.util.Scanner;
public class Ej4{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String inicio;
        inicio = "Aprende a contar";
        System.out.println("\n" + inicio + "\n" + "=".repeat(inicio.length()) + "\n\nIntroduce un número.\n");
        System.out.println("\n" + contar(getNumber()));
        sc.close();
    }
    private static int getNumber(){
        int numero;
        numero = sc.nextInt();
        while (numero < 1){
            System.out.println("\nEl número ha de ser superior o igual a 1\n");
            numero = sc.nextInt();
        }
        return numero;
    }
    private static String contar(int numero){
        String output;
        output = "";
        for (int i = 1; i < numero; i++){
            output += i + ", ";
        }
        output += numero + ".";
        return output;
    }
}
