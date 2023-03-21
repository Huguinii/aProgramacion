import java.util.Scanner;
//mostar tantas veces hola mundo como se le introduzcan por consola
/**
 * Write a description of class UsoFor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UsoFor
{
    public static void main(String[]args){
    int numVeces;
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce num de veces a repetir");
    numVeces= sc.nextInt();
    for(int i=1;i<=numVeces;i++){
        System.out.println("hola mundo");
    }
    

}
}
