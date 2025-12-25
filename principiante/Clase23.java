//matrices dinamicas  ejercicio
import java.util.Scanner
public class Clase23 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int filas=0;
        int columnas=0;
        int contador = 1;

        System.out.println("ingresa las filas del arreglo");
        filas= teclado.nextInt();

        System.out.println("ingresa las columnas  del arreglo");
        columnas= teclado.nextInt();

        int numeros[][]= new  int[filas][columnas];

        for (int j=0; j<filas;j++){
            for (int i=0;i<columnas;i++){
                numeros[j][i]=contador;
                contador++;
                System.out.print("["+ numeros[j][i] "]");
            }
            System.out.println("");
        }
//fin de la clase
    }
}