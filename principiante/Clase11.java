//estructuras de control (Switch - case)
import java.util.Scanner;

public class Clase11  {
    public  static void main(String[] args){
        Scanner in= new  Scanner(System.in);
        int numero1=0;
        int numero2=0;
        int resultado=0;
        int parametro=0;

        System.out.println("Ingresa el primer numero");
        numero1=in.nextInt();

        System.out.println("Ingresa el primer 2");
        numero2=in.nextInt();

        System.out.println("Confirmando datos...");
        System.out.println("...");
        System.out.println("...");


        System.out.println("Ingresa 1 para sumar");
        System.out.println("Ingresa 2 para restar");
        System.out.println("Ingresa 3 para multiplicar");
        System.out.println("Ingresa 4 para dividir");
        System.out.println("Ingresa 5 para salir");

        switch (parametro){

            case 1: resultado= numero1+numero2;
                System.out.println("El resultado de la suma es : "+ resultado);
                break;

            case 2: resultado= numero1-numero2;
                System.out.println("El resultado de la resta es : "+ resultado);
                break;

            case 3: resultado= numero1*numero2;
                System.out.println("El resultado de la multiplicacion es : "+ resultado);
                break;

            case 4: resultado= numero1/numero2;
                System.out.println("El resultado de la division es : "+ resultado);
                break;

            case 5:
                System.out.println("Saliendo del sistema... ");
                break;

            default: System.out.println("Eliga una opcion valida... ");
                break;
        }
    }
}