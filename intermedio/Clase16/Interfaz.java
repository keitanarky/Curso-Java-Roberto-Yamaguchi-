package Clase16;

public class Interfaz {

}

/* En Java, las interfaces se usan para definir contratos:
dicen qué métodos debe tener una clase, pero no cómo se implementan.

Son clave para polimorfismo, arquitectura limpia y Spring Boot. */


//1 interfaz basica
public interface Animal {

    void hacerSonido(); // método abstracto
}

//2 clase que implementa una interfaz
public class Perro implements Animal {

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}
//uso
public class Main {
    public static void main(String[] args) {

        Animal animal = new Perro(); // polimorfismo
        animal.hacerSonido();
    }
}


//3 interfaz con varios metodos
public interface Calculadora {

    int sumar(int a, int b);
    int restar(int a, int b);
}


//uso
public class CalculadoraBasica implements Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }
}

//4 atributos en interfaces  son public static final
public interface Constantes {
    double PI = 3.1416;
}

//Uso

java
Copiar código
System.out.println(Constantes.PI);

//5 metodos default 
public interface Vehiculo {

    default void arrancar() {
        System.out.println("Arrancando vehículo");
    }
}

//uso
public class Auto implements Vehiculo {
    // no es obligatorio sobrescribir
}


//metodos static en interfaces
public interface Util {

    static void saludar() {
        System.out.println("Hola desde interfaz");
    }
}
//uso
Util.saludar();

//7 implementar multiples interfaces
interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}

class Pato implements Volador, Nadador {

    public void volar() {
        System.out.println("El pato vuela");
    }

    public void nadar() {
        System.out.println("El pato nada");
    }
}


