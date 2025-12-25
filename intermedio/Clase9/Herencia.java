package Clase9;


/* Una clase hija hereda atributos y
 métodos de una clase padre
 usando la palabra clave extends. */
public class Herencia {
//1 Ejemplo BÁSICO de herencia
class Persona {

    String nombre;

    void saludar() {
        System.out.println("Hola, soy una persona");
    }
}

class Empleado extends Persona {

    String puesto;

    void trabajar() {
        System.out.println("Estoy trabajando");
    }
}
//uso
public class Main {
    public static void main(String[] args) {

        Empleado e = new Empleado();
        e.nombre = "Roberto"; // heredado
        e.puesto = "Developer";

        e.saludar();  // método heredado
        e.trabajar(); // método propio
    }
}

//2 Herencia + super (constructor del padre)
class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }
}

class Empleado extends Persona {

    String puesto;

    Empleado(String nombre, String puesto) {
        super(nombre); // llama al constructor padre
        this.puesto = puesto;
    }
}

//3 Herencia + sobrescritura de métodos (@Override)
class Persona {
    void saludar() {
        System.out.println("Hola desde Persona");
    }
}

class Empleado extends Persona {
    @Override
    void saludar() {
        System.out.println("Hola desde Empleado");
    }
}


//4 Herencia con protected
class Persona {
    protected String nombre;
}

class Empleado extends Persona {
    void mostrar() {
        System.out.println(nombre); // ✔ permitido
    }
}


//5 Herencia con clase abstracta
abstract class Figura {
    abstract double area();
}

class Rectangulo extends Figura {
    double base = 5;
    double altura = 3;

    @Override
    double area() {
        return base * altura;
    }
}

//fin metodo  main o clase mia
}
