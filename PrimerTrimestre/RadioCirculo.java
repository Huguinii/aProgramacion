import java.util.Scanner;
/**
 * Write a description of class RadioCirculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadioCirculo
{   
    public static void main(String[]args){
        float radio;
        double area;
        final int LIMITE = 50;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un valor para radio");
        radio=teclado.nextFloat();
        area = Math.PI*Math.pow(radio,2);
        if (radio>0){
        if  (!(area>LIMITE)){
            System.out.printf("El area del circulo es %.4f",area);
            System.out.println();
            System.out.println("No es mayor que el limite.");
        }else{
            System.out.println("Si es mayor que el limite.");
        }
        }else{
        teclado.close();
        System.out.println("Programa finalizado");
    }
}
}
