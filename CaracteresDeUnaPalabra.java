import java.util.Scanner;
/**
 * Muestra los caracteres de una palabra en diferentes lineas.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaracteresDeUnaPalabra
{
    public static void main(String[]args){
        String palabra;
        int tamano=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime una palabra");
        palabra=sc.nextLine();
        tamano= palabra.length();
        while(tamano-->0){
            System.out.println(palabra.charAt(tamano));
        }
        System.out.println("Fin de programa");
        sc.close();
    }
}
