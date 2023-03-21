import java.util.Scanner;
public class NumeroReal2
{
    public static void main(String[] args){
        Scanner teclado;
        int numero;
        int aux;
        System.out.println("Introduce un numero de 4 cifras");
        teclado = new Scanner(System.in);
        numero= teclado.nextInt();
        System.out.println(!(numero>999 && numero<10000)?"No es de 4 cifras": "Es de 4 cifras");
        aux =numero/10;
        System.out.println(aux/100);
        System.out.println(aux/10%10);
        System.out.println(aux%10);
        System.out.println(numero%10);
        
        System.out.println(rango8a20(numero)?"El numero "+numero+" esta entre 8 y 20":"El numero "+numero+" no esta entre 8 y 20");
        System.out.println(esPar(numero)?"Primera cifra par":"Primera cifra no par");
        //el numero sumado es constante quiero que genere un numero aleatorio en un rango entre 1000 y 8000
    }
    private static boolean rango8a20(int numero){
        int resultado;
        resultado = numero/1000+numero/100%10+numero/10%10+numero%10;
        
        
        return (resultado >8 && resultado <=20);
        
    }
    private static boolean esPar(int numero){
        
        return (numero/1000)%2==0;
    }
    public boolean esMayuscula(char letra){
        
        return letra >= 'A' && letra<= 'Z';
    }
}
