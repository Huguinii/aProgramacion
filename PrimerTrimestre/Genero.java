import java.util.Scanner;


/**
 * Write a description of class Genero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Genero
{
    public static void main(String[]args){
    int edad;
    String genero;
    String mensajeSalida;
    System.out.println("Introduce el género: hombre/mujer ");
    Scanner dato = new Scanner(System.in);
    genero = dato.nextLine();
    System.out.println("Introduce la edad: ");
    dato = new Scanner(System.in);
    edad = dato.nextInt();
    mensajeSalida = genero.equalsIgnoreCase("mujer")&&(edad<=20||edad>=30) ? "Eres una mujer menor de 20 o > 30" :"";
    System.out.println(mensajeSalida);
    
    }
}
