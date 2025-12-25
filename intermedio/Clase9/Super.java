package Clase9;

import Clase7.Persona;

/* ¿Qué es super en Java?

super se usa para acceder a la clase padre (superclase) desde una clase hija.

Sirve para:

Llamar al constructor del padre

Acceder a atributos del padre

Llamar métodos del padre*/


public class Super {

String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }
}
    //cambia super por persona solo nombre super el archivo.java para que se supiera que era para hablar del metodo super
class Empleado extends Super {

    String puesto;

    Empleado(String nombre, String puesto) {
        super(nombre); // llama al constructor de Persona
        this.puesto = puesto;
    }

    void mostrar() {
        System.out.println(nombre + " - " + puesto);
    }

}
