package SegundaEvaluacion.Wordle;
import java.util.Scanner;

/**
 * Write a description of class Ruleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wordle
{
    static Scanner sc=new Scanner(System.in);
    static int vidas, numeroLetras;
    static final String palabra="moto";
    static final String linea="*";
    public static void main(String[]args){
        menu();
        adivina();
    }

    public static void adivina(){
        System.out.println(linea.repeat(palabra.length()));

        
        String oculta;
        oculta ="";

        String intento;
        do{
            intento = sc.nextLine();
        }while(!(intento.length()==palabra.length()));
        for(int posicionPalabra=0; posicionPalabra< palabra.length(); posicionPalabra++){
            charPalabra
            charIntento

            if( !(charPalabra == charIntento)){
                oculta += "_";
            } else {
                oculta += charPalabra;
            }
        }

    }

    public static void menu(){
        System.out.println("Bienvenido a Wordle\tAdivina la siguiente palabra\tTienes x vidas\n"+"_".repeat(250));
    }

    public static void vida(){

    }

}
