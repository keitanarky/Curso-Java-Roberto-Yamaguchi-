import java.util.Scanner;

// suma
public class Clase4 {

    int numero1;
    int numero2;

    // Constructor
    public Clase4(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        System.out.println("La suma es: " + (numero1 + numero2));
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el primer valor");
        int numero1 = teclado.nextInt();

        System.out.println("Ingresa el segundo valor");
        int numero2 = teclado.nextInt();

        Clase4 valores = new Clase4(numero1, numero2);
    }
}
