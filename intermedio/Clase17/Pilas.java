package Clase17;

public class Pilas {

}


/* En Java, una Lista (List) es una estructura 
de datos que permite almacenar
elementos en orden, acepta duplicados y 
crece dinámicamente. */

//1 Arraylist 
import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Roberto");
        nombres.add("Ana");
        nombres.add("Roberto"); // permite duplicados

        System.out.println(nombres);
    }
}

//2 acceder a los elementos
System.out.println(nombres.get(0)); // Roberto

//3 recorrer una lista

//for
for (int i = 0; i < nombres.size(); i++) {
    System.out.println(nombres.get(i));
}
//for-each
for (String nombre : nombres) {
    System.out.println(nombre);
}
//forEach (Lambda)
nombres.forEach(n -> System.out.println(n));


//4 modificar elementos
nombres.set(1, "Carlos");

//5 eliminar elementos
nombres.remove(0);        // por índice
nombres.remove("Carlos"); // por valor


//6 LinkedList
import java.util.LinkedList;
import java.util.List;

List<String> lista = new LinkedList<>();
lista.add("A");
lista.add("B");

//7 lista de objetos
class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

//uso
List<Persona> personas = new ArrayList<>();

personas.add(new Persona("Roberto", 25));
personas.add(new Persona("Ana", 30));

for (Persona p : personas) {
    System.out.println(p.nombre + " " + p.edad);
}


/* //8 metodos importantes de List
| Método       | Descripción |
| ------------ | ----------- |
| `add()`      | Agregar     |
| `get()`      | Obtener     |
| `set()`      | Modificar   |
| `remove()`   | Eliminar    |
| `size()`     | Tamaño      |
| `contains()` | Buscar      |
| `clear()`    | Vaciar      |
 */


//9 List vs Array
/* | Array       | List            |
| ----------- | --------------- |
| Tamaño fijo | Tamaño dinámico |
| Primitivos  | Objetos         |
| Más rápido  | Más flexible    |

 */