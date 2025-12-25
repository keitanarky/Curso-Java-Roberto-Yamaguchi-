//6. Herencia
//
//Permite que una clase hija reutilice código de una clase padre.

public class Animal {
    public void comer() {
        System.out.println("El animal come");
    }
}


public class Perro extends Animal {
    public void ladrar() {
        System.out.println("Guau guau");
    }

    //uso
    Perro p = new Perro();
    //El perro hereda  el metodo comer de su clase padre animal
    p.comer();
    //el perro hace uso de su metodo ladrar
    p.ladrar();
}