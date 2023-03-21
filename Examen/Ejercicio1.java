import java.util.Scanner;
/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio1
{
    public static void main(String[]args){
        double peso;
        double altura;
        double imc;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu peso en kg");
        peso=sc.nextDouble();
        System.out.println("Dime tu altura en metros");
        altura=sc.nextDouble();
        imc=(peso/(altura*altura));
        System.out.println(imc);
        if(imc<18.5){
            System.out.println("Peso bajo");
            if(imc<16)
            System.out.println("\nDelgadez severa");
            else if(imc>=16 && imc<17)
            System.out.println("\nDelgadez moderada");
            else if(imc>=17 && imc<18.5)
            System.out.println("\nDelgadez leve");
        }else if(imc>=18.5 && imc<25){
            System.out.println("Normal");
        }else if(imc>=25 && imc<30){
            System.out.println("Sobrepeso");
            System.out.println("\nPreobesidad");
        }else{
            System.out.println("Obesidad");
            if(imc>=30 && imc<35)
            System.out.println("\nObesidad leve");
            else if(imc>=35 && imc<40)
            System.out.println("\nObesidad media");
            else if(imc>=40)
            System.out.println("\nObesidad mórbidad");
        }
        }
    
}
