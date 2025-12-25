//8. Sobrescritura de métodos (Override)
//La clase hija modifica un comportamiento del padre.

public class Animal {
public void sonido() {
System.out.println("Sonido generico");
}
}


public class Gato extends Animal {
@Override
public void sonido() {
System.out.println("Miau miau");
}
}