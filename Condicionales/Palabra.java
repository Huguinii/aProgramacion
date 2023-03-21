package Condicionales;


/**
 * Write a description of class Palabra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 *///String contenido; Inicial, letra final, Subcadenas, tamaño, sin inicio desde el principio hasta condicion de fin
public class Palabra
{
    String contenido;
    public Palabra(String contenido){
        this.contenido=contenido;
        
    }
    public String getContenido(){
        return contenido;
    }
    public void setContenido(String contenido){
        this.contenido=contenido;
    }
    public int longitud(){
        return contenido.length();
        
    }
    public String reverse(){
        String acum="";
        int tamano=contenido.length();
        for(int pos=tamano-1;pos>=0;pos--){
            acum=acum+contenido.charAt(pos);
            
        }
        return acum;
        
    }
    public String quitarVocales(){
        String aux= contenido.toLowerCase();
        int tamano= contenido.length();
        String sinVocal="";
        for(int pos=0; pos<tamano; pos++){
            if(aux.charAt(pos)!='a' && aux.charAt(pos)!='e' && aux.charAt(pos)!='i' && aux.charAt(pos)!='o' && aux.charAt(pos)!='u'){
                sinVocal=sinVocal+aux.charAt(pos);
            }
        }
        return sinVocal;
    }
    public String quitarVocales2(){
        //desde la ultima posicion de un caracter hasta final de la cadena
        
        
        
    }
}
