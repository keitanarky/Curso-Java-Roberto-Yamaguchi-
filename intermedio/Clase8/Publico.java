/* En Java existen 4 modificadores de acceso, y uno de ellos es el modificador por defecto (default).
 */

/* public      → todos
protected   → mismo paquete / herencia
default     → mismo paquete
private     → misma clase
 */


class Persona {   // default

    String nombre;   // default
    int edad;        // default

    void saludar() { // default
        System.out.println("Hola, soy " + nombre);
    }
}


//publico
public class Publico {

    public String mensaje = "Hola desde public";

    public void mostrar() {
        System.out.println(mensaje);
    }
}


//mismo paquete o herencia
public class Protegido {

    protected String mensaje = "Hola desde protected";

    protected void mostrar() {
        System.out.println(mensaje);
    }
}

//uso de subclase

import modelo.Protegido;

public class Hijo extends Protegido {

    public void ver() {
        System.out.println(mensaje); // ✔ permitido por herencia
        mostrar();
    }
}



//ejemplo default sin modificador - solo mismo paquete
package modelo;

class DefaultEjemplo {   // default

    String mensaje = "Hola desde default";

    void mostrar() {
        System.out.println(mensaje);
    }
}

