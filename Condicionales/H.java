package Condicionales;
import java.util.Scanner;

/**
 * Write a description of class H here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class H
{
    static int altura=0;
    static Scanner sc=new Scanner(System.in);
    static int menu;
    public static void main(String[]args){
        menu();
        
        
    }
    private static void menu(){
        
        System.out.println("Que quieres mostrar\n1.Un Pino\n2.Un cuadrado\n3.Una H\n4.Una M\n99.Salir");
        menu=sc.nextInt();
        switch (menu){
                case 1:
                    System.out.println("Dame una altura"); 
                    altura=sc.nextInt();
                    pintaArbol();
                    menu();
                    break;
                case 2:
                    System.out.println("Dame una altura"); 
                    altura=sc.nextInt();
                    dibujaCuadrado();
                    menu();
                    break;
                case 3:
                    System.out.println("Dame una altura"); 
                    altura=sc.nextInt();
                    dibujaH();
                    menu();
                    break;
                case 4:
                    System.out.println("Dame una altura"); 
                    altura=sc.nextInt();
                    if(altura%2==0){
                        altura++;
                        dibujaM();
                        menu();
                    }else{
                        dibujaM();
                        menu();
                    }
                    break;
                case 99:
                    System.out.println("Saliendo");
                    sc.close();
                    break;
                default:
                    menu();
                    break;
        }
                   
        
    }
    public static void menu2(){
        System.out.println("Que quieres mostrar\n1.Un Pino\n2.Un cuadrado\n3.Una H\n4.Una M\n99.Salir");
        menu=sc.nextInt();
        System.out.println("Dame una altura");
        
        if (menu==1){
            pintaArbol();
            menu();
        }else if (menu==2){
            dibujaCuadrado();
            menu();
        }else if (menu==3){
            dibujaH();
            menu();
        }else if (menu==4){
            if(altura%2==0){
                altura++;
                dibujaM();
                menu();
            }else{
                
                dibujaM();
                menu();
            }
        }else if(menu==99){
            System.out.println("Saliendo");
            sc.close();
        }else{
            menu();
        }
    }

    private static void dibujaZ(){

    }

    private static void pintaArbol() {
        if(altura>2){ 
            for( int fila=1; fila<=altura;fila++){ 
                for( int blanco=1;blanco<=altura-fila; blanco++){ 
                    System.out.print(" "); 
                } 
                for (int asterisco = 1 ; asterisco<=(fila*2-1);asterisco++){ 
                    System.out.print("*"); 
                } 
                System.out.println(); 
            } 
            for (int base = 1 ;base<=2;base++){ 
                for (int blanco= 1 ; blanco <=altura-1;blanco++){ 
                    System.out.print(" "); 
                } 
                System.out.println("x"); 
            } 
        } 
    }

    private static void dibujaCuadrado(){
        for (int i=1; i<=altura; i++){
            for(int j=1; j<=altura; j++){
                if(j==1 || j==altura || i==1 || i==altura || (i+j)-1==altura){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void pedirAltura(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame una altura");
        altura=sc.nextInt();
    }

    private static void dibujaH(){
        if (altura%2==0){
            altura++;
        }
        for (int fila=1; fila<=altura; fila++){
            for(int col=1; col<=altura-1; col++){
                if(col==1 || col==altura-1 || (altura/2)+1==fila){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void dibujaM(){
        int mitad=altura/2+1;
        for(int fila=1; fila<=altura; fila++){
            for(int columna=1; columna<=altura; columna++){
                if(columna==1 || columna==altura || (fila== columna && columna <= mitad) || (columna == altura-fila+1 && columna > mitad)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
