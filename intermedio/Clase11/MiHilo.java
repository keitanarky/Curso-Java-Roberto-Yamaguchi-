package Clase11;


//1 crear un hilo extendiendo Thead
public class MiHilo extends Thread {


    @Override
    public void run() {
        System.out.println("Hilo en ejecución: " + getName());
    }
}

public class Main {
    public static void main(String[] args) {

        MiHilo h1 = new MiHilo();
        MiHilo h2 = new MiHilo();

        h1.start(); // inicia el hilo
        h2.start();
    }
}
}


//2 crear un hilo implementando Runnable 
class Tarea implements Runnable {

    @Override
    public void run() {
        System.out.println("Ejecutando tarea en hilo");
    }
}

public class Main {
    public static void main(String[] args) {

        Thread hilo = new Thread(new Tarea());
        hilo.start();
    }
}


//3 Hilo con LLambda
public class Main {
    public static void main(String[] args) {

        Thread hilo = new Thread(() -> {
            System.out.println("Hilo con lambda");
        });

        hilo.start();
    }
}

//4 sleep() pausar un hilo
public class Pausa {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            Thread.sleep(1000); // 1 segundo
        }
    }
}


//5 esperar a que termine un hilo
Thread h1 = new Thread(() -> {
    System.out.println("Hilo 1");
});

h1.start();
h1.join(); // espera a que termine

System.out.println("Main continúa");


//6 prioridad de hilos
Thread h = new Thread(() -> System.out.println("Hilo"));
h.setPriority(Thread.MAX_PRIORITY);

//7 problema comun : condicion de carrera
class Contador {
    int count = 0;

    void incrementar() {
        count++;
    }
}


//8 solucion syncronized
class Contador {
    int count = 0;

    synchronized void incrementar() {
        count++;
    }
}

//9 ExecutorService forma  moderna
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(() -> System.out.println("Tarea 1"));
        executor.execute(() -> System.out.println("Tarea 2"));

        executor.shutdown();
    }
}

