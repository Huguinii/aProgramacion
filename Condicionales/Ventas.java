package Condicionales;
import java.util.Scanner;

/**
 * Write a description of class Ventas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * Ventas de martes a domingo, en cada fila se introducirá un solo valor, el programa finaliza al introducir un 
 * -99, no se sabe el número de semanas que nos van a introducir, pero por cada semana, tenemos que indicar que 
 * día ha sido el de mayor ventas, que día ha sido el de menor ventas, y si el domingo ha superado la media de 
 * las ventas de la semana, en caso de haber algún empate entre los días de la semana, se hará constar un empate.
 * 
 */
public class Ventas{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        getData();
    }

    private static void getData(){
        int dia, max, min, empateMax, empateMin, media;
        boolean dmax;
        float number, numberNew, numMax, numMin;
        dia = 2;
        max = 2;
        min = 2;
        numMax = 0;
        numMin = 0;
        media = 0;
        dmax = false;
        number = sc.nextFloat();
        while (number != -99){
            while(number < 0){
                        System.out.println("El dato ha de ser superior a 0.");
                        number = sc.nextFloat();
            }
            media+=number;
            if(dia == 2){
                numMin = number;
            }
            if (number > numMax){
                numMax = number;
                max = dia;
            } 
            if (number < numMin){
                numMin = number;
                min = dia;
            } 
            if (number == numMax){
                empateMax = dia;
            } 
            if (number == numMin){
                empateMin = dia;
            } 
            if (dia == 7){
                media = media/6;
                if (media < number){
                    dmax = true;
                }
                if (max != 0){
                    System.out.println(returnDia(max) + " tiene el record de ingresos.");
                }
                if (min != 0){
                    System.out.println(returnDia(min) + " tiene los ingresos más bajos.");
                }
                System.out.println(dmax? "Las ventas del domingo superan a la media semanal." : "Las ventas del domingo no superan a la media semanal.");
            }
            dia++;
            if (dia > 7){
                dia = 2;
            }
            number = sc.nextFloat();
            if (number == -99){
                if (dia == 2){
                    break;
                } else {
                    while(number == -99){
                        System.out.println("Termina los datos de la semana antes de finalizar el programa.");
                        number = sc.nextFloat();
                    }
                }
            }
    
            
        }
    }

    private static String returnDia(int dia){
        switch (dia){
            case 2:
                return "Martes";
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Error";
        }
    }
}
