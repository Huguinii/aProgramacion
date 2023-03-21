package Clases;
import java.util.Scanner;

/**
 * Write a description of class usoHucha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UsoHucha
{
    Scanner sc;
    public static void main(String[]args){
        UsoHucha inicio = new UsoHucha();
        inicio.menu();

 

    }
    private void menu(){
        sc = new Scanner(System.in);
        int opcion;      
        do{
            String titulo= "Menu";
            System.out.println(titulo);
            System.out.println("_".repeat(titulo.length()));
            System.out.println("1. Alta");
            System.out.println("2. Modificacion");
            System.out.println("3. Ver Informacion");
            System.out.println("4. Operar");
            System.out.println("--------");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    submenuAlta();
                    break;
                case 2:
                    
                case 3:
                    
                case 4:
                    
                case 5:
                    
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion!=5);

    }
    private void submenuAlta(){
        int opcion;
        do{
            String titulo=("Menu Alta");
            System.out.println(".".repeat(titulo.length()));
            System.out.println("1. Solicitar Datos Hucha");
            System.out.println("2. Solicitar Datos Propietario");
            System.out.println("---------");
            System.out.println("3. Salir");
            opcion=sc.nextInt();
        }while(opcion!=3);
    }
    private void solicitarDatosHucha(){
        Hucha huchita= new Hucha();
        String color,forma,material;
        int limite;
        System.out.println("Introduce color; forma; material; limite");
        sc.useDelimiter(";");
        
        while(sc.hasNext()){
            color=sc.next();
            forma=sc.next();
            material=sc.next();
            limite=Integer.parseInt(sc.next());
            
        }
        
        String datos = sc.nextLine();
    }
    
    
}






