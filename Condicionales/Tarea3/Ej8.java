package Condicionales.Tarea3;
import java.util.Scanner;
public class Ej8{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int numero;
        numero = numeroControlado();
        System.out.println("\n" + numero + "! = " + factorial(numero));
    }
    private static int numeroControlado(){
        int numero;
        System.out.println("\nIntroduce un número natural:\n");
        numero = sc.nextInt();
        while (numero <= 0){
            System.out.println("\nLos números naturales son los enteros mayores de 0:\n");
            numero = sc.nextInt();
        }
        return numero;
    }
    private static String factorial(int numero){
        String output;
        Long resultado;
        resultado = (long) 1;
        output = "";
        for (int i = numero; i > 1; i--){
            output += i + " x ";
            resultado = resultado * i;
        }
        output += 1 + " = " + resultado;
        return output;
    }
}
