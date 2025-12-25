//cadenas de caracteres con el metodo equals

import java.util.Scanner;

public class Clase17 {
    public static void  main(String[] args){

        String nombre1="";
        String nombre2="";
        Scanner entrada_datos = new Scanner(System.in);

        stem.out.println("Ingresa el primer nombre");
        nombre1= entrada_datos.nextLine();

        stem.out.println("Ingresa el segundo nombre");
        nombre2= entrada_datos.nextLine();

        if(nombre1.equals(nombre2)){
            System.out.println("Los nombres son iguales");
        }else {
            System.out.println("Los nombres son diferentes")
        }
        //otro ejemplo
        //Login
        String usuario="";
        String password="";


        stem.out.println("Ingresa el nombre nombre de usuario");
        usuario= entrada_datos.nextLine();

        stem.out.println("Ingresa password o contraseña");
        password= entrada_datos.nextLine();

        if(usuario.equals("usuario") && password.equals("1234") ){
            System.out.println("Login realizado exitosamente");
        }else {
            System.out.println("Usuario o contraseña incorrectos")
        }


//fin de la clase
    }
}