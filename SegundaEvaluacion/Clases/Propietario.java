package Clases;

/**
 * Write a description of class Propietario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Propietario
{
    private String nombre, apellido;
    private int edad;
    public Propietario(){

    }

    public Propietario(String nombre, String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String toString(){
        StringBuilder informacion=new StringBuilder();
        informacion.append(nombre);
        informacion.append(" ");
        informacion.append(apellido);
        informacion.append(" ");
        informacion.append(edad);
        return informacion.toString();
    }
}