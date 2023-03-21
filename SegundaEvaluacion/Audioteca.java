package SegundaEvaluacion;

/**
 * Write a description of class Audioteca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Audioteca
{
    private Cd[] coleccionCd=new Cd[100];
    private int numCds;
    /**
     * Constructor for objects of class Audioteca
     */
    public Audioteca(int tamano)
    {
        coleccionCd=new Cd[tamano];
        numCds=0;

    }

    public void addCds(Cd cd){
        if (numCds+1<coleccionCd.length){
            coleccionCd[numCds]=cd;
            numCds++;
        }
    
    }
    public double mediaInversion(){
        
    }
}