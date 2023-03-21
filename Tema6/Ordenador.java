package Tema6;


/**
 * Write a description of class ArrayOrdenador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ordenador
{
    //la clase ordenador tendra dos atributos globales, el modelo y el precio en esta clase tengo un conjunto de
    //ordenadores quiero un metodo que añada ordenadores a la clase, otro que cuente los ordenadores de un modelo,
    //otro que diga el dinero invertido en ordenadores
    private String modelo;
    private double precio;
    
    
    public Ordenador(){
        modelo="Sin definir";
        precio=0;
        
        
        
    }
    public Ordenador(String modelo,double precio){
        this.modelo=modelo;
        this.precio=precio;
        
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }    
    public String getModelo(){
        return modelo;
    }
    public double getPrecio(){
        return precio;
    }
    public String toString(){
        return modelo+" "+precio;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}