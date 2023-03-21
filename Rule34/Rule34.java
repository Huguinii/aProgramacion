
/**
 * [Rule34] La ruleta de los enfermos
 * 
 * @author manuelmsni.com
 * @version 0.0.1 [Alpha test]
 */

import java.util.Scanner;
public class Rule34{
    static Scanner sc = new Scanner(System.in);
    static int number, wins, option, mitad, tercio, color;
    static boolean exit = false;
    public static void main(String[] args){
        System.out.println("------------------------------------------\n| Bienvenido a rule34. No, esa no, cerd@ |\n------------------------------------------\n");
        rulePrint();
        bet();  
    }

    private static void bet(){
        while(!exit){
            System.out.println("\n-------------------------------------------------------\n¿A qué quieres jugar?\nSelecciona un entero entre 1 y 4 para elegir tu opción:\n-------------------------------------------------------");
            System.out.println(" 1.  Apuesta a número");
            System.out.println(" 2.  Apuesta a mitad");
            System.out.println(" 3.  Apuesta a tercio");
            System.out.println(" 4.  Apuesta a color");
            System.out.println("-----------------------");
            System.out.println("99.  Salir de la ruleta\n");
            option = sc.nextInt();
            switch(option){
                case 1:
                    betNumber();
                    break;
                case 2:
                    betHalf();
                    break;
                case 3:
                    betThird();
                    break;
                case 4:
                    betColor();
                    break;
                case 99:
                    System.out.println("\nSaliendo de Rule34");
                    exit=true;
                    break;
                default:
                    wrong();
            }
        }
    }

    private static void betNumber(){
        System.out.println("\n--------------------------------------------------------\nRealiza la apuesta a un número\nSelecciona un entero entre 0 y 36 para elegir tu opción:\n--------------------------------------------------------");
        System.out.println("0-36.  Apuesta a número");
        System.out.println("------------------------------");
        System.out.println("  69.  Cambiar tipo de apuesta");
        System.out.println("  99.  Salir de la ruleta\n");
        number = sc.nextInt();
        if (number >= 0 && number <= 36){
            option = 1;
            System.out.println("\n*********************************\nTu apuesta es al número " + number );
        } else {
            option = number;
        }
        switch(option){
            case 1:
                winsNumber();
                break;
            case 69:
                break;
            case 99:
                System.out.println("\nSaliendo de Rule34.");
                exit=true;
                break;
            default:
                wrong();
        }
    }
    private static void winsNumber(){
        wins = randomRange(0, 36);
        if (wins == number) {
            win();
        } else {
            lose();
        }
        playAgain();
    }
    
    private static void betHalf(){
        System.out.println("\n-------------------------------------------------------\nRealiza la apuesta a tu mitad\nSelecciona un entero entre 1 y 2 para elegir tu opción:\n-------------------------------------------------------");
        System.out.println(" 1.  Primer mitad  [1  - 18]");
        System.out.println(" 2.  Segunda mitad [19 - 36]");
        System.out.println("----------------------------");
        System.out.println("69.  Cambiar tipo de apuesta");
        System.out.println("99.  Salir de la ruleta\n");
        option = sc.nextInt();
        switch(option){
            case 1:
                System.out.println("\n*********************************\nTu apuesta es a la primera mitad");
                mitad = 1;
                winsHalf();
                break;
            case 2:
                System.out.println("\n*********************************\nTu apuesta es a la segunda mitad");
                mitad = 2;
                winsHalf();
                break;
            case 69:
                break;
            case 99:
                System.out.println("\nSaliendo de Rule34.");
                exit=true;
                break;
            default:
                wrong();
        }
    }
    private static void winsHalf(){
        wins = randomRange(0, 36);
        if (wins >= 1 && wins <= 18 && mitad == 1){
            win();
        } else if (wins >= 19 && wins <= 36 && mitad == 2){
            win();
        } else {
            lose();
        }
        playAgain();
    }
    private static void betThird(){
        System.out.println("\n-------------------------------------------------------\nRealiza la apuesta a tu tercio\nSelecciona un entero entre 1 y 3 para elegir tu opción:\n-------------------------------------------------------");
        System.out.println(" 1.  Primer tercio  [1  - 12]");
        System.out.println(" 2.  Segundo tercio [13 - 24]");
        System.out.println(" 3.  Segundo tercio [25 - 36]");
        System.out.println("-----------------------------");
        System.out.println("69.  Cambiar tipo de apuesta");
        System.out.println("99.  Salir de la ruleta\n");
        option = sc.nextInt();
        switch(option){
            case 1:
                System.out.println("\n*********************************\nTu apuesta es al primer tercio");
                tercio = 1;
                winsThird();
                break;
            case 2:
                System.out.println("\n*********************************\nTu apuesta es al segundo tercio");
                tercio = 2;
                winsThird();
                break;
            case 3:
                System.out.println("\n*********************************\nTu apuesta es al tercer tercio");
                tercio = 3;
                winsThird();
                break;
            case 69:
                break;
            case 666:
                System.out.println("\nSaliendo de Rule34.");
                exit=true;
                break;
            default:
                wrong();
        }
    }
    private static void winsThird(){
        wins = randomRange(0, 36);
        if (wins >= 1 && wins <= 12 && tercio == 1){
            win();
        } else if (wins >= 13 && wins <= 24 && tercio == 2){
            win();
        } else if (wins >= 25 && wins <= 36 && tercio == 3){
            win();
        } else {
            lose();
        }
        playAgain();
    }
    
    private static void betColor(){
        System.out.println("\n-------------------------------------------------------\nRealiza la apuesta a tu color\nSelecciona un entero entre 1 y 2 para elegir tu opción:\n-------------------------------------------------------");
        System.out.println(" 1.  Negro [Impar]");
        System.out.println(" 2.  Rojo  [ Par ]");
        System.out.println("----------------------------");
        System.out.println("69.  Cambiar tipo de apuesta");
        System.out.println("99.  Salir de la ruleta\n");
        option = sc.nextInt();
        switch(option){
            case 1:
                System.out.println("\n*********************************\nTu apuesta es Negro");
                color = 1;
                winsColor();
                break;
            case 2:
                System.out.println("\n*********************************\nTu apuesta es rojo");
                color = 2;
                winsColor();
                break;
            case 69:
                break;
            case 99:
                System.out.println("\nSaliendo de Rule34.");
                exit=true;
                break;
            default:
                wrong();
        }
    }
    private static void winsColor(){
        wins = randomRange(0, 36);
        if (isOdd() == 1 && color == 1) {
            win();
        } else if (isOdd() == 2 && color == 2) {
            win();
        } else {
            lose();
        }
        playAgain();
    }
    
    private static int isOdd(){
        int aux = wins%2;
        if (wins != 0 && aux == 0){
            return 2;
            //par --> rojo
        } else if (wins != 0 && aux != 0) {
            return 1;
            //impar --> negro
        } else {
            return 0;
        }
    }
    
    private static void playAgain(){
        System.out.println("\n------------------------------------------------------\n¿Quieres jugar otra vez?");
        System.out.println("Escribe 1 para jugar otra vez ó 2 para salir de Rule34\n------------------------------------------------------\n");
        option = sc.nextInt();
        switch(option){
            case 1:    
                break;
            case 2:
                System.out.println("\nSaliendo de Rule34.");
                exit = true;
                break;
            default:
                wrong();
        }      
    }
    
    private static void wrong(){
        System.out.println("\nSolo se admiten las opciones descritas\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    
    private static void win(){
        System.out.println("Ha salido " + wins + ". ¡Has ganado!\n*********************************\n");
        rulePrint();
    }
    
    private static void lose(){
        System.out.println("Ha salido " + wins + ". ¡Has perdido!\n*********************************\n");
        rulePrint();
    }
    
    private static void checkNumber(){
        System.out.println("Introduce un número real entre 0 y 36:\n--------------------------------------\n");
        number = sc.nextInt();        
    }

    private static void rulePrint(){
        System.out.println("     |        Impar = Negro                   Par = Rojo         |");
        System.out.println("     *************************************************************");
        System.out.println("     | " +"3  | " + "6  | " + "9  | " + "12 | " + "15 | " + "18 | " + "21 | " + "24 | " + "27 | " + "30 | " + "33 | " + "36 | ");
        System.out.println("  0  | " +"2  | " + "5  | " + "8  | " + "11 | " + "14 | " + "17 | " + "20 | " + "23 | " + "26 | " + "29 | " + "32 | " + "35 | ");
        System.out.println("     | " +"1  | " + "4  | " + "7  | " + "10 | " + "13 | " + "16 | " + "19 | " + "22 | " + "25 | " + "28 | " + "31 | " + "34 | ");
        System.out.println("     *************************************************************");
        System.out.println("     |     1º tercio     |     2º tercio     |     3º tercio     |");
        System.out.println("     *************************************************************");
        System.out.println("     |           1ª mitad          |           2ª mitad          |");
        System.out.println("     *************************************************************");
        
    }

    private static void line(int linesNumber){
        System.out.println("-".repeat(linesNumber));
    }
    private static int randomRange(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
}

