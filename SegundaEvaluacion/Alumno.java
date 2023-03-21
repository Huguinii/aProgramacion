package SegundaEvaluacion;


/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String nombre;
    private int[] notas;
    

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre)
    {
        this.nombre=nombre;
        notas=new int [3];
    }
    public void addNotas(int notita){
        int numNotas=0;
        for(int contenido:notas){
            if(contenido!=0)numNotas++;
            
        }
        if(numNotas<notas.length)notas[numNotas]=notita;
        
        
    }
    public String getNombre(){
        return nombre;
    }
    public int[] getNotas(){
        int numNotas=0;
        for(int contenido:notas){
            if(contenido!=0)numNotas++;
        }
        
        return java.util.Arrays.copyOfRange(notas, 0, numNotas);
    }
}
