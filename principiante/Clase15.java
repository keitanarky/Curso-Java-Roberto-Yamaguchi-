//ejercicio para el desarrollo de la logica
//usando lo aprendido anteriormente

//imprimir

//1,2,3,4,5,6,7,8,9,10

//1,99,2,98,3,97,4,96,5,95

//0,1,1,2,3,5,8,13,21,34


public class Clase15 {
    public static void main(String[] args) {

        int i =0;
        System.out.println("Serie con for: ");
        for (i=1; i<=10 ; i++){
            if(i<10){
                System.out.print(i+",");
            }else {
                System.out.print(i);
            }
        }
        //termina el ciclo for
        i=1;
        System.out.println("");

        System.out.println("Serie con while: ");
        while (i<=10){
            if(i<10){
                System.out.print(i+",");
            }else {
                System.out.print(i);
            }
            i++;
        }
        //fin ciclo while
        i=1;
        System.out.println("");

        System.out.println("Serie con do-while");
        do {
            if(i<10){
                System.out.print(i+",");
            }else {
                System.out.print(i);
            }
            i++;
        }while (i<=10)


            //segundo arreglo de numeros

            int x =1;
            int y = 99;

        System.out.println("Serie 2 con for");
        for(x=1; x<=5; x++){
           if (i<5){
               System.out.println(x+",");
               System.out.println(y",");
           }else {
               System.out.println(x);
               System.out.println(y);
           }
           y--;
        }

        System.out.println("Serie 2 con while");
        x=1;
        y=99;
        while (x <= 5) {
            System.out.print(x + "," + y);

            if (x < 5) {
                System.out.print(",");
            }

            x++;
            y--;
        }

        System.out.println("Serie 2 con do while");
         x = 1;
        y = 99;

        do {
            System.out.print(x + "," + y);

            if (x < 5) {
                System.out.print(",");
            }

            x++;
            y--;
        } while (x <= 5);

//fin de clase
    }
}