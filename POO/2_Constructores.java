//2. Constructores
//Los constructores sirven para inicializar un objeto automaticamente

//por ejemplo al cargar los datos de una pagina
//en automatico los datos de la tabla se llenaran
//ya que esta se inicializara automaticamente

public class Persona {
    String nombre;
    int edad;

    //este es el constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //constructor
    Persona p = new Persona("Roberto", 30);
}