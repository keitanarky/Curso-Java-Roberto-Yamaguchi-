//manipulacion de cadeenas con los metodos length() & substring()
import java.util.Scanner;

public class Clase18 {
    public static void main (String[] args){
        String cadena_original="";
        String cadena_substraccion="";

        int numero_caracteres=0;
        int desde=0;
        int hasta =0;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa una cadena de caracteres: ");
        cadena_original= in.nextLine();

        numero_caracteres=cadena_original.length();

        System.out.println("La cadena "+cadena_original+ " contiene "+numero_caracteres+" caracteres");

        System.out.println("Desde que caracter quieres obtener la cadena");
        desde= in.nextInt();

        System.out.println("hasta que caracter obtener la nueva cadena");
        hasta= in.nextInt();

        cadena_substraccion = cadena_original.substring(desde, hasta);

        System.out.println("Nueva cadena String " + cadena_substraccion);


//fin de la clase
    }
}