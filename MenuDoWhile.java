import java.util.Scanner;
/**
 * Write a description of class MundoWhile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuDoWhile
{
    public static void main(String[]args){
        int opcion;
        Scanner sc=new Scanner(System.in);
        do{
            menu();
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    multiplicar(8);
                    break;
                case 2:
                    multiplicar(16);
                    break;
                case 3:
                    multiplicar(32);
                    break;
                default:
            }
        }while(opcion!=99);
        sc.close();
    }

    private static void menu(){
        System.out.println("\t Menu\n======================\n1.\tTabla del 8\n2.\tTabla del 16\n3.\tTabla del 32\n99.\t Salir");
        System.out.print("\n");
    }

    private static void multiplicar(int numero){
        int multiplicador=0;
        while(multiplicador<11){
            System.out.println(numero+ "x" +multiplicador+ "=" +numero * multiplicador++ + "\n");
        }
    }
    public static String rellenaEspacios(int numero){
        String cadenaEspacios="";
        while(numero>0){
            cadenaEspacios=cadenaEspacios+"";
            numero--;
        }
        return cadenaEspacios;
    }
}