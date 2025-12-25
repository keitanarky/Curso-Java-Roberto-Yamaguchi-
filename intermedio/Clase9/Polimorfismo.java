package Clase9;

public class Polimorfismo {
    //1 Ejemplo BÁSICO de polimorfismo
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El gato maúlla");
        }
    }
}

//uso polimorfico
public class Main {
    public static void main(String[] args) {

        Animal a1 = new Perro(); // polimorfismo
        Animal a2 = new Gato();

        a1.hacerSonido(); // El perro ladra
        a2.hacerSonido(); // El gato maúlla
    }
}



//2 Polimorfismo con MÉTODOS sobrescritos (@Override)
class Empleado {
    double calcularSalario() {
        return 5000;
    }
}

class Gerente extends Empleado {
    @Override
    double calcularSalario() {
        return 8000;
    }
}

//uso
Empleado e = new Gerente();
System.out.println(e.calcularSalario()); // 8000


//3 Polimorfismo con CLASE ABSTRACTA
abstract class Figura {
    abstract double area();
}

class Circulo extends Figura {
    double radio = 5;

    @Override
    double area() {
        return Math.PI * radio * radio;
    }
}
//uso
Figura f = new Circulo();
System.out.println(f.area());

//4 Polimorfismo con INTERFACES (muy usado en Spring)
interface Pago {
    void procesar();
}

class PagoTarjeta implements Pago {
    public void procesar() {
        System.out.println("Pago con tarjeta");
    }
}

class PagoEfectivo implements Pago {
    public void procesar() {
        System.out.println("Pago en efectivo");
    }
}
//uso
Pago pago = new PagoTarjeta();
pago.procesar();
