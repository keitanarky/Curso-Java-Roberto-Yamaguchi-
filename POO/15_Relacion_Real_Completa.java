//15. Relación real completa (mini sistema)
//Ejemplo completo con varias partes de POO

public class Producto {
    private String nombre;
    private double precio;


    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public double getPrecio() { return precio; }
    public String getNombre() { return nombre; }
}


public class Carrito {
    private List<Producto> productos = new ArrayList<>();


    public void agregar(Producto p) {
        productos.add(p);
    }


    public double total() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
}


public class App {
    public static void main(String[] args) {
        Carrito c = new Carrito();


        c.agregar(new Producto("Mouse", 200));
        c.agregar(new Producto("Teclado", 500));


        System.out.println("Total: " + c.total());
    }
}