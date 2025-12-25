//operadores
// < menor que
//> mayor que
//        == igual igual
//        != no igual
//        <= menor o igual
//        >= mayor o igual

//operadores logicos
//&& AND se deben de cumplir las 2 condiciones
//|| OR  se debe cumplir almenos una condicion
public class Clase9 {
    public static void main(String[] args){

            String empresa = "Coppel";

        // Tres ejemplos de empleados
        String claveEmpleado1 = "COP123";
        int antiguedad1 = 5;

        String claveEmpleado2 = "COP555";
        int antiguedad2 = 2;

        String claveEmpleado3 = "COP999";
        int antiguedad3 = 10;

        System.out.println("---- Validación de empleados en " + empresa + " ----");

        validarEmpleado(claveEmpleado1, antiguedad1);
        validarEmpleado(claveEmpleado2, antiguedad2);
        validarEmpleado(claveEmpleado3, antiguedad3);
    }

    public static void validarEmpleado(String clave, int antiguedad) {
        System.out.println("\nEmpleado: " + clave);
        System.out.println("Antigüedad: " + antiguedad + " años");

        if (antiguedad >= 3) {
            System.out.println("Cumple con la antigüedad mínima.");
        } else {
            System.out.println(" No cumple con la antigüedad mínima.");
        }
    }
    }
}