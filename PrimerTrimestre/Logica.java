

public class Logica
{
    static boolean a = true;
    static boolean b = true;
    static boolean c = false;
    
    public static void main(String[] args){
        
        System.out.println("El valor de a \t:" + a);
        System.out.println("El valor de b \t:" + b);
        System.out.println("El valor de c \t:" + c);
        
        pintarLineas();
        System.out.println("El valor de a && b \t:" + (a && b));
        System.out.println("El valor de b && c \t:" + (b && c));
        
        pintarLineas();
        System.out.println("El valor de a || b \t:" + (a || b));
        System.out.println("El valor de b || c \t:" + (a || c));
        
        pintarLineas();
        System.out.println("El valor de a xor b \t:" + (a ^ b));
        System.out.println("El valor de b xor c \t:" + (a ^ c));
        
        pintarLineas();
        System.out.println("El valor negado de a \t:" + !a);
        System.out.println("El valor negado de b \t:" + !b);
        System.out.println("El valor negado de c \t:" + !c);
        
        pintarLineas();
        System.out.println("El valor negado de a && b \t:" + !(a && b));
        System.out.println("El valor negado de a || b \t:" + !(a || b));
        System.out.println("El valor negado de a xor b \t:" + !(a ^ b));
    }
    
    private static void pintarLineas(){
        System.out.println("-".repeat(20));
        System.out.println("-".repeat(20));
    }
}
