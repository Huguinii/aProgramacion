import java.util.Scanner;
/**
 * Write a description of class TareaPuntuable_01 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TareaPuntuable_01
{
    public static void main(String[] args){
        int entero;
        Scanner teclado;
        String mensaje = ("Introduce un entero de 3 cifras");
        teclado = new Scanner (System.in);
        System.out.println("Introduce un entero de 3 cifras");
        entero = teclado.nextInt();
        System.out.println(entero);
        
        
        
    }
}
