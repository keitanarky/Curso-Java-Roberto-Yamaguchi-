//9. Clases Abstractas
//
//No se pueden instanciar y sirven como base.

public abstract class Figura {
    abstract double area();
}


public class Circulo extends Figura {
    double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }


    @Override
    double area() {
        return Math.PI * radio * radio;
    }
}