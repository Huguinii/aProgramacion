package Condicionales;
import java.util.Scanner;
//dado un nume entre 1 y 12 correspondiente a los meses del año el programa debera decirnos
//cuantos dias nos corresponden a cada mes
/**
 * Write a description of class DimeDiasMes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DimeDiasMes
{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
       int mes=0;
       System.out.println("Dime un numero entre 1 y 12");
       mes = sc.nextInt();
       if (mes <=12 && mes >0){
           switch(mes){
               case 1:
                   System.out.println("Enero tiene 31 días");
                   break;
               case 2:
                   añoBisiesto();
                   break;
               case 3:
                   System.out.println("Marzo tiene 31 días");
                   break;
               case 4:
                   System.out.println("Abril tiene 30 días");
                   break;
               case 5:
                   System.out.println("Mayo tiene 31 días");
                   break;
               case 6:
                   System.out.println("Junio tiene 30 días");
                   break;
               case 7:
                   System.out.println("Julio tiene 31 días");
                   break;
               case 8:
                   System.out.println("Agosto tiene 31 días");
                   break;
               case 9:
                   System.out.println("Septiembre tiene 30 días");
                   break;
               case 10:
                   System.out.println("Octubre tiene 31 días");
                   break;
               case 11:
                   System.out.println("Noviembre tiene 30 días");
                   break;
               case 12:
                   System.out.println("Diciembre tiene 31 días");
                   break;
       }
}else{
    System.out.println("No es un numero entre 1 y 12");
    sc.close();
}
}
private static void añoBisiesto(){
    int año=0;
    System.out.println("Introduce un año");
        año = sc.nextInt();
        if (año%4==0 && año%100!=0 || año%400==0){
            System.out.println("Febrero tiene 29 dias");
        }else{
            System.out.println("Febrero tiene 28 dias");
        }
}
}

