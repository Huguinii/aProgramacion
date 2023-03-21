package Clases;
import java.util.Scanner;

/**
 * Write a description of class UsoCoche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UsoCoche
{
    static Scanner sc=new Scanner(System.in);
    static Coche cochecito = new Coche();
    public static void main(String[]args){
        
        cochecito.setIdMatricula("JB123");
        cochecito.setMarca("Audi");
        cochecito.setColor("rojo");
        
        cochecito.arrancar();
        menu();

    }

    private static void menu(){
        String acelerando="";
            System.out.println(cochecito.toString());
        boolean velMax=false;
        do{
            
            System.out.println("Quieres acelerar?");
            acelerando=sc.nextLine();
            if(acelerando.equalsIgnoreCase("Si")){
                velMax=cochecito.acelerar();
                System.out.println("Vas a "+cochecito.getVelocidad());
                pintarCoche(cochecito);
            }
        }while(velMax && !acelerando.equalsIgnoreCase("No"));
        cochecito.parar();
    }

    private static void pintarCoche(Coche cochecito){
        System.out.println(" ".repeat(cochecito.getVelocidad()-1)+"\u2638");
    }
}
