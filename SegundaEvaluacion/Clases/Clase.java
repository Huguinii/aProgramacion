package SegundaEvaluacion.Clases;


/**
 * Write a description of class Clase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase
{
    private String idClase;
    private String descripcion;
    private int numSillas;
    public Clase(String idClase, String descripcion, int numSillas){
        this.idClase= idClase;
        this.descripcion=descripcion;
        this.numSillas=numSillas;
        
    }
    
    public boolean ocupaSilla(){
        if (numSillas>0){
            numSillas--;
            return true;
        }
        return false;
    }
    public int getNumSillas(){
        return numSillas;
    }
}
