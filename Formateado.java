
/**
 * Write a description of class Formateado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Formateado
{
    static float numero1;
    static float numero2;
    static float numero3;
    public Formateado(){
        numero1 = 12345.56f;
        numero2 = 23.234578f;
        numero3 = 123.234f;

    }

    public static void main(String[]args){
        Formateado objeto1 = new Formateado();
        objeto1.mostrar();

    }

    public void mostrar(){

        System.out.printf("%4.5f%n", numero1);
        System.out.printf("%4.5f%n", numero2);
        System.out.printf("%4.5f%n", numero3);

    }

}
