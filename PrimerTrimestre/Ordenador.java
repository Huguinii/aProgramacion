
/**
 * Write a description of class Ordenador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ordenador
{
    static int totalOrdenadores;
    private String placaBase;
    private String marca;
    private String id;
    public Ordenador(String marca, String placaBase){
        totalOrdenadores++;
        this.placaBase=placaBase;
        this.marca=marca;
        id = "ID"+(totalOrdenadores);
    }

    public void mostrar(){
        System.out.println("El ordenador \t" + id);
        System.out.println("Este ordenador tiene una placa base " + placaBase);
        System.out.println("Este ordenador es de la marca " + marca);
        
    }
}
