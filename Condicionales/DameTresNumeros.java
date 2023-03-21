package Condicionales;
import java.util.Scanner;
public class DameTresNumeros 

{ 
    public static void main(String[] ags){ 
        int num1, num2, num3; 
        Scanner src = new Scanner(System.in); 
        System.out.println("Dame un número"); 
        num1 = src.nextInt(); 
        System.out.println("Dame un segundo número"); 
        num2 = src.nextInt(); 
        System.out.println("Dame un tercer número"); 
        num3 = src.nextInt(); 
        if (num1 > num2 && num1 > num3){ 
            if (num2 > num3){ 
                System.out.println("El número de mayor valor es "+num1+" el segundo es "+num2+" y el tercero es "+num3); 
            } else { 
                System.out.println("El número de mayor valor es "+num1+" el segundo es "+num3+" y el tercero es "+num2); 
            } 
        }   else if (num2 > num1 && num2 > num3){ 
            if (num1 > num3){ 
                System.out.println("El número de mayor valor es "+num2+" el segundo es "+num1+" y el tercero es "+num3); 
            } else { 
                System.out.println("El número de mayor valor es "+num2+" el segundo es "+num3+" y el tercero es "+num1); 
            } 
        }   else if (num3 > num1 && num3 > num2){ 
            if (num1 > num2){ 
                System.out.println("El número de mayor valor es "+num3+" el segundo es "+num1+" y el tercero es "+num2); 
            } else { 
                System.out.println("El número de mayor valor es "+num3+" el segundo es "+num2+" y el tercero es "+num1); 
            } 
        }
    }
}