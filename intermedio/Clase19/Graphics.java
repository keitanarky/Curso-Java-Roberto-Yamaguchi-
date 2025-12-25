package Clase19;

public class Graphics {

}


//1 Implementación básica de la clase Graph
Grafo usando lista de adyacencia (la más usada)
import java.util.*;

public class Graph {

    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // Agregar vértice
    public void addVertex(int v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    // Agregar arista (no dirigido)
    public void addEdge(int v1, int v2) {
        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1);
    }

    // Mostrar grafo
    public void printGraph() {
        for (int v : adjList.keySet()) {
            System.out.println(v + " -> " + adjList.get(v));
        }
    }
}
//2 Uso de la clase Graph
public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.printGraph();
    }
}


Salida:

1 -> [2, 3]
2 -> [1, 4]
3 -> [1]
4 -> [2]

//3 Grafo DIRIGIDO
public void addEdgeDirected(int from, int to) {
    adjList.get(from).add(to);
}


Ejemplo:

1 → 2 → 3

4️⃣ Grafo ponderado (con peso)
class Edge {
    int destino;
    int peso;

    Edge(int destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }
}

Map<Integer, List<Edge>> adjList = new HashMap<>();

//5 Recorrido BFS (cola)
import java.util.*;

public void bfs(int inicio) {

    Set<Integer> visitado = new HashSet<>();
    Queue<Integer> cola = new LinkedList<>();

    visitado.add(inicio);
    cola.offer(inicio);

    while (!cola.isEmpty()) {
        int v = cola.poll();
        System.out.print(v + " ");

        for (int vecino : adjList.get(v)) {
            if (!visitado.contains(vecino)) {
                visitado.add(vecino);
                cola.offer(vecino);
            }
        }
    }
}

//6 Recorrido DFS (recursivo)
public void dfs(int v, Set<Integer> visitado) {

    visitado.add(v);
    System.out.print(v + " ");

    for (int vecino : adjList.get(v)) {
        if (!visitado.contains(vecino)) {
            dfs(vecino, visitado);
        }
    }
}


//Uso

dfs(1, new HashSet<>());