//usando Scanner para ingresar datos mediante el teclado
//Scaner es una libreria
//es un conjunto de clases y metodos
//conjunto de codigo para facilitar tareas
import java.util.Scanner;

public class Clase8 {
    public static void main(String[] args){
        Scanner in= new  Scanner(System.in);
        String nombre="";
        int numero1=0;
        int numero2=0;
        int resultado=0;

        System.out.println("Ingresa tu nombre");
        nombre=in.nextLine;

        System.out.println("Dame el primer numero para sumar");
        numero1=in.nextInt();

        System.out.println("Dame el segundo numero para sumar");
        numero2=in.nextInt();

        //realizando la operacion despues de asignarles los valores alas variables
        resultado=numero1+numero2;

        //imprimiendo en pantalla
        System.out.println(nombre+ " el resultado fue :"+resultado);
    }
}