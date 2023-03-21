
/**
 * Write a description of class TotalOrdenadores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TotalOrdenadores
{
    public static void main(String[]args){
        Ordenador ord1 = new Ordenador("Dell","Asus");
        ord1.mostrar();
        Ordenador ord2 = new Ordenador("Hp","AMD");
        ord2.mostrar();
        System.out.println("Total de ordenadores son " +Ordenador.totalOrdenadores);
    }
}
