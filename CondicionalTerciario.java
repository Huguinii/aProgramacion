import java.util.Scanner;
 
/**
 * Write a description of class CondicionalTerciario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CondicionalTerciario
{
    public static void main(String[] args){
        final int REFERENCIA1 = 18;
        final int REFERENCIA2 = 12;
        int edad;
        String output;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos años tienes?");
        edad = sc.nextInt();
        output = (edad >= REFERENCIA1)? "Eres mayor de edad." :((edad <= REFERENCIA2)? "Eres un crio.":"Eres joven");
        System.out.println(output);
    }
}
