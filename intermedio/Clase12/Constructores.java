package Clase12;

public class Constructores {
}


//1 constructor por defecto
public class Persona {
    // constructor por defecto implícito
}


//2 constructor vacio (explicito)
public class Persona {

    public Persona() {
        System.out.println("Constructor vacío");
    }
}


//3 constructores con parametros
public class Persona {

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}


//4 multiples constructores (sobrecarga)
public class Persona {

    String nombre;
    int edad;

    public Persona() {
        this("Sin nombre", 0); // llama a otro constructor
    }

    public Persona(String nombre) {
        this(nombre, 0);
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}


//5 uso de this en constructores
public class Producto {

    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}


//6 constructores + herencia (super)
class Persona {

    Persona(String nombre) {
        System.out.println("Persona: " + nombre);
    }
}

class Empleado extends Persona {

    Empleado(String nombre) {
        super(nombre); // llama al constructor padre
        System.out.println("Empleado creado");
    }
}


//7 constructor private
public class Utilidad {

    private Utilidad() {
        System.out.println("No se pueden crear objetos");
    }
}
