import java.util.Scanner;
//supongamos que unos empleados despues de tener cierta antiguedad
//tienen derecho a recibir un % de descuento en tienda
//si la antiguedad es de 1 año hasta 5 años tendran un descuento del 20%
//si la antiguedad esta entre 6 a 10 años recibiran 30%
//y ai la antiguedad es mayor o arriba de 10 años la persona tendra 40%
public class Clase10 {
    public static void main(String[] args){
        Scanner in= new  Scanner(System.in);
        String nombre="";
        int clave=0;
        int antiguedad = 0;

        System.out.println("=========================================");
        System.out.println("=================Sistema=================");
        System.out.println("=========================================");
        System.out.println("");
        System.out.println("");

        System.out.println("Ingresa el nombre");
        nombre=in.nextLine();
        System.out.println("");

        System.out.println("ingresa la antiguedad ");
        antiguedad=in.nextInt();
        System.out.println("");

        System.out.println("ingresa la clave del trabajador");
        clave= in.nextInt();
        System.out.println("");

        if (antiguedad>=1 && antiguedad<=5{
            System.out.println("El empleado "+nombre+ " tiene un descuento de empleado del 20%");
        } else if (antiguedad>5 && antiguedad <=10) {
            System.out.println("El empleado "+nombre+ " tiene un descuento de empleado del 20%");
        } else if (antiguedad>10) {
            System.out.println("El empleado "+nombre+ " tiene un descuento de empleado del 20%");
        }else {
            System.out.println("Ingresaste un valor invalido");
        }
    }
}