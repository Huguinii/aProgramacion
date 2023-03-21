package Condicionales;
import java.util.Scanner;
public class Binario{
    static long decimal = 0;
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Numero dime porfa");
        long decimal = teclado.nextLong();
        if (decimal <= 0) {
            System.out.println("0");
        }
        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            short residuo = (short) (decimal % 2);
            decimal = decimal / 2;
            // Insertar el dígito al inicio de la cadena
            binario.insert(0, String.valueOf(residuo));
        }
        System.out.println(binario.toString());       
    }
}