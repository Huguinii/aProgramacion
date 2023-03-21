package Condicionales;
import java.util.Scanner;

/**
 * Write a description of class Ventas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Presupuesto2
{
    //va a decir inicialmente cuantas entradas van a venir detras
    //dos lineas 1 indica numero de elementos en la siguiente linea
    //otra indica cuantos valoras van a venir detras
    //por cada paso de prueba saca el total de pares que hay y sigue leyendo
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        veces();
    }
    private static void veces(){
        int casos;
        do{
        
        casos=sc.nextInt();
        if (casos!=-99){
            int cuentaPares=0;
            for(int i=1; i<=casos; i++){
                int ticket;
                ticket=sc.nextInt();
                if(ticket%2==0)cuentaPares++;
            }
            System.out.println("Hay "+cuentaPares+" pares");
            
        }
    }while (casos!=-99);
     
    }
    }

