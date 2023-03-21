
/**
 * Write a description of class Variables here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Variables
{
    int varGlobal=2;
    static int varGlobalStatics = 50;
    public void multiplicar(){
        int multiplicador=3;
        System.out.println(varGlobal+2);
        System.out.println(varGlobal*multiplicador);
    }

    public static void main(String[]args){
        Variables obj1=new Variables();

        System.out.println("Variable Global"+obj1.varGlobal);
        System.out.println("Variable Global Estatica"+varGlobalStatics);

    }
}