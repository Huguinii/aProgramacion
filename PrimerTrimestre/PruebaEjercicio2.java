import java.util.Scanner;
/**
 * Write a description of class PruebaEjercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaEjercicio2
{
    public static void main(String[] args){
        
    double numero;
    long cociente;
    long resto;
    Scanner teclado = new Scanner(System.in);
    System.out.println("double" + (Double.MAX_VALUE) + "--"+ Double.MIN_VALUE);
    System.out.println("double" + (Long.MAX_VALUE)+ "--"+ Long.MIN_VALUE);
    System.out.println("Introduce un numero real");
    numero=teclado.nextDouble();
    cociente=(long) numero/1;
    System.out.println(cociente);
    resto = (long) (Math.round(numero%1*1e6));
    System.out.println(resto);
    
    
    
    }
    
}
