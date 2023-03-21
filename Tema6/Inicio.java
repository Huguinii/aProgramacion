package Tema6;


/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio
{
    public static void main(String[]args){
        Clase clase=new Clase();
        clase.mostrar();
        System.out.println("Numero de equipos hp "+ clase.getNumOrdenadoresPorMarca("hp"));
        System.out.println("Total invertido en equipos hp "+ clase.returnInversionTotal("hp"));
        System.out.println("Total invertido en equipos "+ clase.returnInversionTotal());
        
        
        
        
    }
}
