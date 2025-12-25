//4.Métodos (acciones)
//Son funciones dentro de las clases.

public class Calculadora {
public int sumar(int a, int b) {
return a + b;
}
    //calc.sumar  llama al metodo del objeto
    //los objetos tienen metodos
    // y atributos
    //los atributos son por ejemplo persona , tus atributos son edad,nombre,etc
    //y los metodos de persona podrian ser guardar,borrar,etc.
    Calculadora calc = new Calculadora();
System.out.println(calc.sumar(4, 5));
}