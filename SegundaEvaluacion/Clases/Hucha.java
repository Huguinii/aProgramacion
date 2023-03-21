package Clases;
import java.util.Scanner;

/**
 * Write a description of class Hucha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hucha
{
    static Scanner sc=new Scanner(System.in);
    String color, forma, material; 
    int capacidad, contenido;
    Propietario propietario;
    public Hucha(String color, String forma, String material, int capacidad){
        this.color=color;
        this.forma=forma;
        this.material=material;
        this.capacidad=capacidad;
        contenido=0;
    }
    public Hucha(){
        color="rosa";
        material="plastico";
        forma="cerdo";
        capacidad=1000;
    }
    public int meterDinero(int dinero){
        int resto=0;
        if(contenido+dinero<=capacidad){
            contenido+=dinero;
            
        }else{
            resto=capacidad-contenido;
            contenido+=resto;
            return dinero-resto;
        }
        return 0;
    }
    public boolean sacarDinero(int dinero){
        if(dinero>contenido) return false;
        contenido-=dinero;
        return true;
    }
    public String toString(){
        StringBuilder huchaString= new StringBuilder(color);
        huchaString.append(";");
        huchaString.append(forma);
        huchaString.append(";");
        huchaString.append(contenido);
        huchaString.append(";");
        huchaString.append(capacidad);
        huchaString.append(";");
        huchaString.append(material);
        huchaString.append(";");
        huchaString.append(propietario.toString());
        return huchaString.toString();
    }
    public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(){
        this.capacidad=capacidad;
    }
    public void setPropietario(Propietario propietario){
        this.propietario=propietario;
    }
    
    
    
    
}

