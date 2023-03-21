package SegundaEvaluacion.Clases;

/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    // instance variables - replace the example below with your own
    static int totalAlumnos;
    private int idAlumno;
    private String nombre;
    private String apellido;
    private Clase clase;
    public Alumno(int idAlumno, String nombre, String apellido){
        this.idAlumno=idAlumno;
        this.nombre=nombre;
        this.apellido=apellido;
        totalAlumnos++;
    }
    public Alumno(String nombre, String apellido){
        this.idAlumno=totalAlumnos+1;
        this.nombre=nombre;
        this.apellido=apellido;
    }
    public int getidAlumno(){
        return idAlumno;
     }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void hablar(){
        System.out.println("Hola soy " + nombre);
    }

    public void setClase(Clase clase){
        this.clase=clase;
        
    }
    
}
