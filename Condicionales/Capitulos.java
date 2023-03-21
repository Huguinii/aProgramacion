package Condicionales;

/**  


 * Write a description of class Capitulos here.  


 *   


 * @author (your name)   


 * @version (a version number or a date)  


 */  


import java.lang.Math;  


import java.util.Scanner;  


import java.util.Random;  


public class Capitulos  


{  



    public static void main(String[] args){  



        Scanner sc = new Scanner(System.in);  


        int contador =15;        


        int pagTotal=0; 


        System.out.println("Introduce num capitulos");  


        int capitulo = sc.nextInt();  

        System.out.println("Introduce num subcapitulos"); 


        int subCapitulo = sc.nextInt();  

        System.out.println("Dime la columna "); 


        contador = sc.nextInt();  


        for(int i=1;i<=capitulo;i++){  


            int paginas=calcularPaginas(); 

            pagTotal=pagTotal+paginas; 

            int contadorAux; 

            contadorAux = contador-String.valueOf(i).length()-String.valueOf(pagTotal).length(); 

            System.out.println(i+".".repeat(contadorAux)+pagTotal);  


            for( int j=1; j<=subCapitulo; j++){  


                int paginasSub=calcularPaginas();   

                pagTotal=pagTotal+paginasSub; 

                int contadorAux2; 


                contadorAux2 = contador-1-2-String.valueOf(i).length()- String.valueOf(j).length()-String.valueOf(pagTotal).length(); 

                System.out.println("  "+i+"."+j+".".repeat(contadorAux2)+pagTotal); 



            }  



        }  





    }  


    private static int calcularPaginas(){ 


        return  (int) (Math.random()*(100-1)+1); 

    } 


}  