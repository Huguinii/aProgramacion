package Condicionales.Tarea3;

public class Ej11{
    public static void main(String[] args) {
        System.out.println(tablas());
    }
    private static String tablas(){
        String output, aux;
        output = "";
        for (int j = 1; j <= 10; j++) {
            aux = "Tabla del " + j;
            output += "\n" + aux + "\n" + "=".repeat(aux.length()) + "\n";
            for (int i = 0; i <= 10; i++){
                output += " " + j + " x " + i + " = " + (j * i) + "\n";
            }
        }
        return output;
    }
}
