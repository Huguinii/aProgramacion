package Condicionales.Tarea3;
public class Ej7{
    public static void main(String[] args){
        long acumulador;
        System.out.println("\nEl producto de los números impares menores de cien es: ");
        acumulador = 1;
        for (int i = 1; i < 100; i += 2){
            acumulador = acumulador * i;
        }
        System.out.print(acumulador);
    }
}
