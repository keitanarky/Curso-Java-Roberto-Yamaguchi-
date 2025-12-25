//condicionales
//las condicionales son lineas de codigo
//que se ejecutaran cuantas veces elija el usuario
//por ejemplo
//imprimir numer del 1 al 1 millon
//obviamente no vamos a teclear 1 millon de llineas de codigo
//
//hay 3 tipos de ciclos
//for (para)
//while (mientras)
//do while (hacer mientras)
//

public class Clase6 {
    public static void main(String[] args){
        //vamos a realizar un promedio
        //simulemos unas 5 materias de un alumno
        int matematicas =7;
        int biologia=6;
        int ingles =5;
        int quimica =7;
        int español =6;

        int promedio=0;

        promedio =(matematicas+biologia+ingles+quimica+español)/5;

        if(promedio>=6){
            System.out.println("El alumno aprobo con: "+promedio);
        }else {
            System.out.println("El alumno reprobo con: "+promedio);
        }
     }
}