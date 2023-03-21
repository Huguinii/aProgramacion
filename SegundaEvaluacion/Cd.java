package SegundaEvaluacion;


/**
 * Write a description of class Audioteca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cd
{
    // instance variables - replace the example below with your own
    private String titulo;
    private double precio;

    /**
     * Constructor for objects of class Audioteca
     */
    public Cd(String titulo, double precio){
        this.titulo=titulo;
        this.precio=precio;
    }
    public double getPrecio(){
        return precio;
    }
    public String getTitulo(){
        return titulo;
    }
    
}
