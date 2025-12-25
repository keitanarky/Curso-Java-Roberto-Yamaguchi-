import java.util.Scanner;


//6 ejemplo de finally
public class EjemploFinally {

    public static void main(String[] args) {

        Scanner sc = null;

        try {
            sc = new Scanner(System.in);
            System.out.println("Ingresa un número:");
            int n = sc.nextInt();
            System.out.println("Número: " + n);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
        } finally {
            sc.close(); // se ejecuta siempre
        }
    }



    //6try sin cath valido
    try {
    System.out.println("Hola");
} finally {
    System.out.println("Fin");
}

}
