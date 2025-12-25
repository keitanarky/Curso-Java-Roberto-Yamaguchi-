
import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args) {
        Scanner teclado = new  Scanner(System.in);

        System.out.println("Ingresa el valor de la base");
        int base = teclado.nextInt();

        System.out.println("Ingresa el valor de la altura");
        int altura = teclado.nextInt();

        Rectangulo mensaje = new Rectangulo(base , altura);
    }

}
