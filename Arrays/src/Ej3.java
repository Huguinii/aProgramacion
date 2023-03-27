import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int[] lista = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10; i++){
            lista[i]=sc.nextInt();
        }

        for (int j=lista.length-1; j>=0; j--){

            System.out.println(lista[j]);

        }
    }

}
