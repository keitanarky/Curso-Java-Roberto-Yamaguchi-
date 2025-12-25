package Clase10;

//try
//cath
//finaly

public class Clase10 {

    public static void main(String[] args) {
        //Estructura básica
    try {
    // Código que puede generar error
} catch (Exception e) {
    // Se ejecuta si ocurre el error
} finally {
    // Se ejecuta SIEMPRE (haya error o no)
}
    }


    
    // 1 ejemplo Ejemplo básico try - catch
try {
            int resultado = 10 / 0; // error
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero");
        }

    
    //2 varios cath
    try {
    int[] numeros = {1, 2, 3};
    System.out.println(numeros[5]); // error
} catch (ArithmeticException e) {
    System.out.println("Error aritmético");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Índice fuera de rango");
}

//3 cath generico
try {
    String texto = null;
    System.out.println(texto.length());
} catch (Exception e) {
    System.out.println("Ocurrió un error");
}

//4 uso de finally
try {
    int numero = Integer.parseInt("10");
    System.out.println(numero);
} catch (NumberFormatException e) {
    System.out.println("Formato incorrecto");
} finally {
    System.out.println("Este bloque siempre se ejecuta");
}



    //final de mi clase
  }
}
