import java.util.Scanner;
/**
 * Write a description of class PedirNombre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PedirNombre
{
    public static void main(String[] args){
    System.out.println("¿Cómo te llamas? \'What's your name?\'");
    final int edad = 18;
    int edad2 = 0;
    int a;
    a =1<2 ?18:16;
    Scanner scanner = new Scanner(System.in);
    String nombre = scanner.nextLine();
    System.out.println("Hola "+nombre + " ¿Como estas? How are you?");
    System.out.println("¿Que edad tienes? How old are you?");
    edad2 = scanner.nextInt();
    scanner.nextLine();
    System.out.println("La edad pedida es " +(edad==edad2));
    
  }
}
