package Condicionales;


/**
 * Write a description of class Paquetería here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * Si el peso del paquete es inferior a 5kg no se envía
 * El coste dependerá de la zona a la que vaya
 * Madrid 40€KG / Barcelona 60€KG / Santiago 50€KG / Sevilla 65€/KG
 * Se debe presentar el precio al cliente
 * Menú de zonas de envío
 * 
 */
import java.util.Scanner;
public class Paqueteria{
    static Scanner sc = new Scanner(System.in);
    
    //Peso mínimo del paquete
    static int pesoMinimo = 5;
    
    //Zonas y sus precios asociados
    static final String ZONA1 = "madrid";
    static int price1 = 40;
    static final String ZONA2 = "barcelona";
    static int price2 = 60;
    static final String ZONA3 = "santiago";
    static int price3 = 50;
    static final String ZONA4 = "sevilla";
    static int price4 = 65;
    
    public static void main(String[] args){
        float peso, precio;
        String zona;
        pr("Introduce el peso de tu paquete en Kg:");
        peso = sc.nextFloat();
        if (peso >= pesoMinimo) {
            menu();
            zona = sc.next();
            switch (zona.toLowerCase()) {
                case ZONA1:
                    calculaPrecio(zona, peso, price1);
                    break;
                case ZONA2:
                    calculaPrecio(zona, peso, price2);
                    break;
                case ZONA3:
                    calculaPrecio(zona, peso, price3);
                    break;
                case ZONA4:
                    calculaPrecio(zona, peso, price4);
                    break;
                default:
                    pr("Destino no reconocido.");
                    break;
            }
        } else {
            pr("Tu paquete no alcanza el requisito mínimo de peso para el envío (" + pesoMinimo + "Kg).");
        }
    }
    
    private static void calculaPrecio(String zona, float peso, float precio){
        float aux = peso * precio;
        pr("El envío de tu paquete a " + zona + " tiene un importe de " + aux + "€.");
    }
    
    private static void menu(){
        pr("Los destinos disponibles y sus precios asociados son:");
        option(ZONA1, price1); 
        option(ZONA2, price2);
        option(ZONA3, price3);
        option(ZONA4, price4);
        pr("Escribe el nombre del destino:");
    }
    
    private static void pr(String aux){
        System.out.println(aux);
    }
    
    private static void option(String zona, int price){
        pr(zona + " [" + price + "€/Kg]");
    }
    
}
