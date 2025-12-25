//11. Composición
//
//Una clase contiene objetos de otras clases.

public class Motor {
    void encender() {
        System.out.println("Motor encendido");
    }
}


public class Auto {
    Motor motor = new Motor();


    void arrancar() {
        motor.encender();
        System.out.println("Auto arrancando");
    }
}