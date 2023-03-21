import java.util.Scanner;
/**
 * Write a description of class TablasDeMultiplicar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TablasDeMultiplicar
{
    static int multiplicador;
    public static void main(String[]args){
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una tabla");
        numero=sc.nextInt();
        while(multiplicador >=0 && multiplicador <11){
            System.out.println(numero+ "x" +multiplicador+ "=" +numero * multiplicador++ + "\n");
        }
    }
}
