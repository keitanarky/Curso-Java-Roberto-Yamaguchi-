package Clase18;

public class Colas {

}


//1 cola basica
import java.util.LinkedList;
import java.util.Queue;

public class ColaEjemplo {
    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();

        cola.add("Cliente 1");
        cola.add("Cliente 2");
        cola.add("Cliente 3");

        System.out.println(cola);
    }
}

//uso o salida 
[Cliente 1, Cliente 2, Cliente 3]


//2 operaciones principales de una cola
Queue<String> cola = new LinkedList<>();

cola.add("A");
cola.add("B");
cola.add("C");

// Ver el primero (sin quitar)
System.out.println(cola.peek()); // A

// Sacar el primero
System.out.println(cola.poll()); // A

// Estado actual
System.out.println(cola); // [B, C]

//3 metodos importantes de Queue
/* | Método      | Qué hace                                |
| ----------- | --------------------------------------- |
| `add()`     | Inserta (lanza excepción si falla)      |
| `offer()`   | Inserta (no lanza excepción)            |
| `poll()`    | Extrae el primero                       |
| `remove()`  | Extrae (lanza excepción si está vacía)  |
| `peek()`    | Muestra el primero                      |
| `element()` | Muestra (lanza excepción si está vacía) |

 */

//4 cola con numeros  ejemplo
Queue<Integer> cola = new LinkedList<>();

cola.offer(10);
cola.offer(20);
cola.offer(30);

while (!cola.isEmpty()) {
    System.out.println("Atendiendo: " + cola.poll());
}

//uso o  salida
Atendiendo: 10
Atendiendo: 20
Atendiendo: 30


//5 ArrayDeque
import java.util.ArrayDeque;
import java.util.Queue;

Queue<String> cola = new ArrayDeque<>();

cola.offer("Uno");
cola.offer("Dos");
cola.offer("Tres");


//6 priorityQueue (cola con prioridad)
import java.util.PriorityQueue;
import java.util.Queue;

Queue<Integer> cola = new PriorityQueue<>();

cola.offer(30);
cola.offer(10);
cola.offer(20);

while (!cola.isEmpty()) {
    System.out.println(cola.poll());
}
//uso o salida
10
20
30


//7 ejemplo tipo vida real (fila de banco)
Queue<String> fila = new LinkedList<>();

fila.offer("Juan");
fila.offer("Ana");
fila.offer("Luis");

System.out.println("Atendiendo: " + fila.poll());
System.out.println("Siguiente: " + fila.peek());
