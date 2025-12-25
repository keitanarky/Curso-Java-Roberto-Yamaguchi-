
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tecladoScanner = new Scanner(System.in);

        System.err.println("Ingresa 1 para ropa blanca , ingresa 2 para ropa de color");
        int tipoDeRopa= tecladoScanner.nextInt();

        System.err.println("Cuantos kilos de ropa son  , maximo 12 kilos");
        int kilos= tecladoScanner.nextInt();
        
        Funciones mensajero_Lavadora = new Funciones(kilos, tipoDeRopa);
        mensajero_Lavadora.CicloFinalizado();
    }
}