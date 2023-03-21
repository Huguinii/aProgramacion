import java.util.Scanner;
/**
 * Write a description of class TiposPrimitivos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TiposPrimitivos
{
    public static void main(String[] args){
        char caracter;
        byte enteroByte;
        short enteroCorto;
        int entero;
        long enteroGrande;
        float decimal;
        double decimalPreciso;
        boolean booleano;
        Scanner teclado;
        String mensaje = ("Introduce un 'caracter'");
        teclado = new Scanner(System.in);
        System.out.println("Introduce un 'caracter'");
        caracter = teclado.next().charAt(0);
        System.out.println(caracter);
        pintaPuntos(mensaje.length());
        System.out.println("Introduce un byte");
        enteroByte = teclado.nextByte();
        System.out.println(enteroByte);
        pintaPuntos(mensaje.length());
        System.out.println("Introduce un entero");
        entero = teclado.nextInt();
        System.out.println(entero);
        pintaPuntos(mensaje.length());
        System.out.println("Introduce un float");
        decimal = teclado.nextFloat();
        System.out.println(decimal);
        pintaPuntos(mensaje.length());
        System.out.println("Introduce un double");
        decimalPreciso = teclado.nextDouble();
        System.out.println(decimalPreciso);
        pintaPuntos(mensaje.length());
        System.out.println("Introduce un long");
        enteroGrande = teclado.nextLong();
        System.out.println(enteroGrande);
        pintaPuntos(mensaje.length());

        
        float suma;
        suma = (float) decimalPreciso*2;
        System.out.println(suma);
    }
    
    private static void pintaPuntos(int numero){
        System.out.println(".".repeat(numero));
    }
}