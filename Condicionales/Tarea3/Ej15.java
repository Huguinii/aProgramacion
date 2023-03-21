package Condicionales.Tarea3;
import java.util.Scanner;
public class Ej15{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int number, primes;
        number = getNumber();
        primes = getPrimes(number);
        System.out.println((primes == 1)? "\nHay " + primes + " numero primo entre 1 y " + number + "." : "\nHay " + primes + " numeros primos entre 1 y " + number + "." );
        sc.close();
    }
    private static int getPrimes(int number){
        int primes;
        primes = 0;
        while (number >= 1) {
            if (isPrime(number)) {
                primes++;
            }
            number--;
        }
        return primes;
    }
    private static boolean isPrime(int number){
        int aux = 2;
        if (number > 1) {
            while (aux < (number/2 + 1)) {
                if (number%aux == 0){
                    return false;
                }
                aux++;
            }
            return true;
        } else {
            return false; 
        }
    }
    private static int getNumber(){
        int number;
        System.out.println("\nIntroduce un número natural superior a 1:\n");
        number = sc.nextInt();
        while (!checkRange(number)){
            System.out.println("\nDebe ser un número natural superior a 1:\n");
            number = sc.nextInt();
        }
        return number;
    }
    private static boolean checkRange(int numero){
        if (numero > 1){
            return true;
        }
        return false;
    }
}
