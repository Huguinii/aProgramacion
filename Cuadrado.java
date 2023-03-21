import java.util.Scanner;
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado
{

    public static void main(String[]args){
        int tamano;
        String linea="* ";
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el tamaño de lado");
        tamano=sc.nextInt();

        linea=linea.repeat(tamano);
        for(int fila=1;fila<=tamano; fila++){
            System.out.println(linea);
        }
        System.out.println("===========================================");
        dibujaCuadroVacio(tamano);
    }

    public static void dibujaCuadroVacio(int tamano){
        for(int fila=1;fila<=tamano;fila++){
            if(fila==1 || fila==tamano){
                System.out.println("*".repeat(tamano));
            }else{
                System.out.println("*"+" ".repeat(tamano-2)+"*");
            }
        }
    }

    public static void dibujaCuadroVacioSinRepeat(int tamano){
        for(int fila=1;fila<=tamano;fila++){
            char lateral ='*';
            char relleno=' ';
            if(fila==1 || fila==tamano){
                System.out.println(repite(tamano,lateral));
            }else{
                System.out.println(String.valueOf(lateral)+repite(tamano-2,relleno)+String.valueOf(lateral));
            }
        }
    }

    public static String repite(int numVeces, char caracter){
        String cadenaRepetida=String.valueOf(caracter);
        for(int indice=1; indice<=numVeces; indice++){
            cadenaRepetida=cadenaRepetida + String.valueOf(caracter);
        }
        return cadenaRepetida;
    }
}
