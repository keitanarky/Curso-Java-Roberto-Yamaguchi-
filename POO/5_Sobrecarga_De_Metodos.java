//5. Sobrecarga de Métodos (Overloading)

//Varios métodos con el mismo nombre pero parámetros distintos.

public class Mensaje {
    public void enviar(String texto) {
        System.out.println("Enviando: " + texto);
    }


    public void enviar(String texto, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("Enviando: " + texto);
        }
    }
}