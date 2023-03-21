import java.util.Scanner;
/**
 * Write a description of class Examen1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Examen1
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        imprimeTitulo();
    }
    public static void numPrueba(){
        int prueba=0;
        
    
        prueba=sc.nextInt();
        if(prueba<=20&&prueba>=1){
            for(int i=1;i<=prueba;i++){
                    System.out.println("Caso"+i);
            }
        }else{
            System.out.println("No es un numero entre 1 y 20");
            numPrueba();
        }
    }
    
    
    
    
    
    public static void imprimeTitulo(){
        String punto,barra;
        int titulo,posicion,subrayado,saltoLinea;
        int caso=0;
        punto=".";
        barra="_";
        System.out.println(punto.repeat(30)+"Examen 1 Evaluación Hugo");
        System.out.println(punto.repeat(30)+barra.repeat(24));
        System.out.println(punto.repeat(3)+"Introduce el número de veces que quieres probar el programa");
        numPrueba();
        
    }
}
