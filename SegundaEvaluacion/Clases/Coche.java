package Clases;
import java.util.Scanner;

/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche
{
    //coche tiene string matricula,string color,string marca, int velocidad, acelera de 10 en 10 y frena de 5 en 5
    
    private String idMatricula;
    private String color;
    private String marca;
    private int velocidad;
    private boolean encendido;
    public static void main(String[]args){
        
    }
    
    public Coche()
    {
        idMatricula=("");
        marca=("");
        color=("");
        velocidad=0;
        encendido=false;
    }

    public String getIdMatricula(){
        return idMatricula;
    }

    public String getMarca(){
        return marca;
    }

    public String getColor(){
        return color;
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void setIdMatricula(String idMatricula){
        this.idMatricula=idMatricula;

    }

    public void setMarca(String marca){
        String aux=marca.trim();
        if(aux.length()>0){
            this.marca=aux.toLowerCase().substring(0, 1).toUpperCase().concat(aux.toLowerCase().substring(1));

        }

    }

    public void setColor(String color){
        this.color=color;
    }

    public boolean arrancar(){
        if(!encendido){
            encendido=true;
            return true;
        }
        return false;
    }

    public boolean parar(){
        if(encendido){
            encendido=false;
            return true;
        }
        return false;
    }

    public boolean acelerar(){
        if (encendido)
            if(velocidad+10>120){
                velocidad =120;
                return false;
            }
        velocidad+=10;
        return true;
    }

    public boolean decelerar(){
        if (encendido)
            if(velocidad-5<0){
                velocidad =0;
                return false;
            }
        velocidad-=5;
        return true;
    }
    public String toString(){
        StringBuilder datos=new StringBuilder();
        datos.append(idMatricula);
        datos.append("\t");
        datos.append(marca);
        datos.append("\t");
        datos.append(color);
        datos.append("\t");
        datos.append("Encendido ");
        datos.append(encendido? "si ":"no ");
        datos.append(velocidad);
        datos.append(" km/h");
        return datos.toString();
    }
    
}
