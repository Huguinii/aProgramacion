package Condicionales.Tarea3;
import java.util.Scanner;
public class Ej9{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n Elabora una lista de árboles:");
        System.out.println(listaArboles());
        sc.close();
    }
    private static boolean checkEnd(int number){
        if (number == -1){
            return false;
        }
        return true;
    }
    private static int getNumber(){
        int number;
        System.out.println("\n Para finalizar el programa introduce \"-1\".\n Para registrar un árbol, introduce su altura en centímetros:\n");
        number = sc.nextInt();
        return number;
    }
    private static String listaArboles(){
        int number, max, countTrees, maxTree;
        String output;
        max = 0;
        countTrees = 0;
        maxTree = 0;
        output = "\n Lista de árboles:\n";
        number = getNumber();
        if (checkEnd(number)){
            while (checkEnd(number)){
                while (number == 0) {
                    System.out.println("\n La altura no puede ser cero.\n");
                    number = getNumber();
                    if (!checkEnd(number)) {
                        break;
                    }
                }
                while (number < 1) {
                    System.out.println("\n La altura debe ser un número positivo centímetros.\n");
                    number = getNumber();
                    if (!checkEnd(number)) {
                        break;
                    }
                }
                if (checkEnd(number)){
                    if (number > max){
                        max = number;
                        maxTree = countTrees;
                    }
                    output += "  A_" + countTrees + "\t= " + number + " cm\n";
                    countTrees++;
                    number = getNumber();
                }
            }
            output += "\n El árbol más alto es el A_" + maxTree + ", mide " + max + " cm";
            if (countTrees == 0) {
                return "\n No se ha introducido ningún dato.";
            }
            return output;
        } else {
            return "\n No se ha introducido ningún dato.";
        }
    }
}