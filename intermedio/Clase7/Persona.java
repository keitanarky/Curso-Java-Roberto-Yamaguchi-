//getter y setter

public class Persona {

    // Atributos (encapsulados)
    private String nombre;
    private int edad;

    // Getter de nombre
    public String getNombre() {
        return nombre;
    }

    // Setter de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter de edad
    public int getEdad() {
        return edad;
    }

    // Setter de edad
    public void setEdad(int edad) {
        if (edad >= 0) { // validación
            this.edad = edad;
        }
    }
}
