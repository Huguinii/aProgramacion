package Condicionales.Tarea3;
import java.util.Scanner;
public class Ej2{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(getStatistics());
        sc.close();
    }
    private static String getStatistics(){
        int edad, totalEdades, sumaEdades, mayoresEdad;
        totalEdades = 0;
        sumaEdades = 0;
        mayoresEdad = 0;
        edad = getNumber();
        if (edad < 0){
            return "\nNo has introducido ningun dato de edad.";
        }
        while (edad > 0){
            if (edad == 0) {
                System.out.println("No se admiten alumnos con edades inferiores a un año");
            } else {
                totalEdades++;
                sumaEdades+=edad;
                if (edad > 17){
                    mayoresEdad++;
                }
            }
            edad = getNumber();
        }
        return
        "\nSe han introducido datos de " + totalEdades + " alumnos.\n" +
        "La suma de todas sus edades es " + sumaEdades +
        ".\nLa media de sus edades es " + sumaEdades/totalEdades + ".\n" +
        mayoresEdad + ((mayoresEdad > 1 || mayoresEdad == 0)? " alumnos son mayores de edad." : " alumno es mayor de edad.") 
        ;
    }
    private static int getNumber(){
        System.out.println("\nIntroduce la edad de un alumno.\nEl programa se detendrá si el número introducido es negativo.\n");
        return sc.nextInt();
    }
}
