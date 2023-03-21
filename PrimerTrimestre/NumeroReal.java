import java.util.Scanner;
public class NumeroReal
{
    public static void main(String[] args){
        Scanner teclado;
        int numero;
        int aux;
        System.out.println("Introduce un numero de 3 cifras");
        teclado = new Scanner(System.in);
        numero= teclado.nextInt();
        System.out.println(!(numero>99 && numero<1000)?"No es de 3 cifras": "Es de tres cifras");
        aux =numero/10;
        System.out.println(aux/10);
        System.out.println(aux%10);
        System.out.println(numero%10);
    }
}