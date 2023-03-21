package SegundaEvaluacion.Clases;
import java.util.Scanner;

/**
 * Write a description of class AltaAlumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AltaAlumno
{
    public static void main(String[]args){
        System.out.println("Dame datos del alumno separados por :");
        Scanner sc=new Scanner(System.in);
        String linea;
        
        while (sc.hasNextLine()){
            linea=sc.nextLine();
        }
    }
    
    public static void obtencionDatos(String linea){
        Scanner sc=new Scanner(System.in);
        sc.useDelimiter(":");
        String nombre=sc.next();
        String apellido=sc.next();
        Alumno alumnito=new Alumno(nombre, apellido);
        alumnito.hablar();
        System.out.println(alumnito.getidAlumno()+"\t"+alumnito.getApellido());
        
    }
}
