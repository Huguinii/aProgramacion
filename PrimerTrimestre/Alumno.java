
/**
 * Write a description of class alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String nombre = "Mario";
    private byte edad = 3;
    static int
    contador=0;
    public Alumno(){
        nombre="Mario";
        edad=20;
        contador=contador+1;
    }

    public String getNombre(){
        return nombre;

    }

    public byte getEdad(){
        return edad;

    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;

    }

    public void setEdad(byte nuevaEdad){
        edad = nuevaEdad;

    }
}