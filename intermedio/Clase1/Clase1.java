import java.util.Scanner;

//invirtiendo una cadena de caracteres
public class Clase1 {

    public static void main(String[] args) {
        int longitud ;
        String palabra ;
        String palabra_invertida = "";
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Escribe una palabra o frase");
            palabra = teclado.nextLine();
        }

        //contando los caracteres
        longitud = palabra.length();

        while (longitud!=0) {
            palabra_invertida+= palabra.substring(longitud-1, longitud);

        }

        System.out.println("La palabra es "+palabra);
        System.out.println("La longitud  es "+longitud);
        System.out.println("La palabra invertida es "+palabra_invertida);

    }

}
