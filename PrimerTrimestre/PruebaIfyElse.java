import java.util.Scanner;
/**
 * Write a description of class CopyOfPruebaIf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaIfyElse
{
    //rango de 20 a 30 si lo esta mostrara el numero introducido tantas veces como el numero
    public static void main(String[]args){
        int numero = 0;
        String repetir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entre 20 y 30");
        numero= teclado.nextInt();
        if (numero>=20 && numero<=30){
            System.out.printf("Esta en el rango 20-30, el numero %.2f%n",(float) numero);
            System.out.println((""+numero).repeat(numero));
        }else{
            System.out.println("No esta en el rango 20-30");
            System.out.println("-".repeat(numero));
        }
        teclado.close();
        System.out.println("El programa ha finalizado");
    }
}
