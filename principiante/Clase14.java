//ciclos o bucles estructura repetitiva do-while

public class Clase14 {
    public static void main(String[] args) {

        String nombre = "Fulano";

        System.out.println("imprimiendo el nombre 5 veces");


        int i =1;
        do {
            System.out.println("imprimiendo el nombre " + i + " veces " + nombre);

            i+=1;
        }while (i<=5);
    }
}