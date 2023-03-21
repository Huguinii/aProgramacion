package Condicionales;


/**
 * Write a description of class d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cadena
{
    //Hasta caracter; devuelve todos los caracteres que hay en una cadena hasta el caracter marcado
    public int buscarCaracter(char caracter, String contenido){
        int tamano=contenido.length();
        for (int indice=0; indice < contenido.length(); indice++){

            if(contenido.charAt(indice)==caracter)return indice;    
        }
        return -1;
        
        
    }
    public String hastaCaracter(char caracter, String contenido){
        String inicio="";
        int tamano=contenido.length();
        int indice=0;
        while(indice<tamano && contenido.charAt(indice)!=caracter){
            inicio=inicio+contenido.charAt(indice);
            indice++;
        }
        return inicio;
    }
    public static void main(String[]args){
        Cadena cadenita = new Cadena();
        String linea="3;*";
        int numero = Integer.valueOf(cadenita.hastaCaracter(';',linea));
        char caracter=linea.charAt(cadenita.buscarCaracter(';', linea)+1);
        System.out.println(numero);
        System.out.println(caracter);
        
    }
}
