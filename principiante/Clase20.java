//arreglos unidimensionales vectores dinamicos
import java.util.Scanner;

public class Clase20 {
    public static void  main(String[] args){
        int longitud=0;
        Scanner teclado = new  Scanner(System.in);

        System.out.print("Cuantos numeros tendra el arreglo");
        longitud= teclado.nextInt();

        int numeros[] = new  int[longitud];

        for (int i =0; i<numeros.length;i++){
            System.out.println("ingresa el valor de la pocision " + (i+1));
            numeros[i] = teclado.nextInt();
        }
        for (int i=0; i<numeros.length;i++){
            System.out.print("["+numeros[i] + "]" )    ;
        }
//fin de la clase
    }
}