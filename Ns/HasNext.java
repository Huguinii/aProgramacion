package Ns;
import java.util.Scanner;

/**
 * Write a description of class HasNext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasNext
{
    public static void main(String[]args){
        System.out.println("Introduce nombres separados por ; y para finalizar escribe end");
        String linea;
        Scanner sc=new Scanner (System.in);
        linea =sc.nextLine();
        
        while(sc.hasNextLine()){
            linea=sc.nextLine();
            if(! linea.toLowerCase().startsWith("end")){
                separar(linea);
            }else{
                break;
                
            }
        }
        sc.close();

    }
    private static void numero(){
        String texto;
        switch (texto){
            case "uno":
                return "1";
            case 3:
                return "2";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Error";
        }
    }
    public static void separar(String linea){
        Scanner sc=new Scanner (linea);
        sc.useDelimiter(";");
        String nombre;
        while(sc.hasNext()){
            nombre=sc.next();
            System.out.println(nombre+'\n'+"-".repeat(nombre.length())+'\n');
        }
        sc.close();
    }
}
