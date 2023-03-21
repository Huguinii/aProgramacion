package Tema6;
import java.util.ArrayList;

/**
 * Write a description of class Clase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase
{
    private ArrayList <Ordenador> listaOrdenadores;
    public Clase(){
        String[][] marcas= {
                {"hp","1200","4"},
                {"asus","1500","8"},
                {"compaq","1400","7"},
                {"acer","1300","6"}
            };
        listaOrdenadores= new ArrayList();
        for(int fila=0;fila<marcas.length;fila++){
            int numOrdenador=Integer.parseInt(marcas[fila][2]);
            for(int num=0;num<numOrdenador;num++){
                listaOrdenadores.add(new Ordenador(marcas[fila][0],Double.valueOf(marcas[fila][1])));
            }
        }
        System.out.println(listaOrdenadores.toString());

    }
    public void mostrar(){
        for(Ordenador ordenador :listaOrdenadores){
            System.out.printf("%20%12,2f\n",ordenador.getModelo(),ordenador.getPrecio());
            //System.out.println(ordenador.toString());
        }
    }
    public int getNumOrdenadoresPorMarca(String modelo){
        int acum=0;
        for(Ordenador ord :listaOrdenadores){
            if(ord.getModelo().equalsIgnoreCase(modelo))acum++;
        }
        
        return acum;
    }
    public double returnInversionTotal(){
        double acum=0;
        for(Ordenador ord:listaOrdenadores){
            if(ord.getModelo().equalsIgnoreCase(modelo)){
                
             acum += ord.getPrecio;
        }
    }
        
        return acum;
    }
}