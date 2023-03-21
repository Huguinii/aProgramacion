package SegundaEvaluacion;

import java.util.Scanner;
public class Ventas
{
    public static void main(String [] args){
        int numProducto = 4;
        int numVendedores = 5;
        int producto;
        double cantidad;
        Scanner sc = new Scanner(System.in);
        double[][] ventas = new double[numProducto][numVendedores];
        System.out.println("Introduce el numero del vendedor (-1 para terminar) :");
        int persona = sc.nextInt();
        while (persona != -1){
            System.out.println("\tIntroduce el numero de producto");
            producto = sc.nextInt();
            System.out.println("\tIntroduce el importe de ventas");
            cantidad = sc.nextDouble();
            if(persona >= 1 && persona < (numVendedores + 1)&& producto >= 1 && producto < (numProducto + 1) && cantidad > 0){
                ventas [producto - 1][persona- 1] = cantidad;
                }else {
                System.out.println("Entrada no válida");
                }
            System.out.println("Introduce el numero del vendedor (-1 para terminar) :");
            persona = sc.nextInt();
            }
        double[] totalVentasPersonas = new double[numVendedores];
        System.out.printf("%8s%14s%14s%14s%14s\n", "Producto","Vendedor1","Vendedor2","Vendedor3");
        double totalProducto = 0;
         for (int fila = 0; fila < numProducto; fila++){
            totalProducto = 0;
            System.out.printf("%8d",fila + 1);
            for (int columna = 0; columna < numVendedores ; columna++){
                totalProducto += ventas[fila][columna];
                totalVentasPersonas[columna] += ventas[fila][columna];
                System.out.printf("%12.4f",ventas[fila][columna]);
                }
            System.out.printf("%12.2f",totalProducto);
        }
        }
}