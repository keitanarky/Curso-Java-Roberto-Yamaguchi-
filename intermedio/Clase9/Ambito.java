/* En Java, el ámbito de las variables (scope)
 indica dónde una variable existe y puede usarse 
 dentro del programa. Aquí tienes la explicación
  clara, ordenada y con ejemplos */



 public class Ambito {

int numero = 10; // variable de instancia (ámbito de clase)

    //1. Ámbito de CLASE (variables de instancia y estáticas)
    void mostrar() {
        System.out.println(numero); //  0accesible
    }

    //variable estatica
    static int contador = 0; // variable de clase (static)

    static void incrementar() {
        contador++;
    }


    //Ámbito de MÉTODO (variables locales)
    void calcular() {
        int resultado = 5; // variable local
        System.out.println(resultado); // forma correcta
    }

    void otroMetodo() {
        // resultado erroneo no existe aquí
    }

    //3. Ámbito de BLOQUE { }
    if (true) {
            int x = 10;  // ámbito del bloque if
            System.out.println(x); // correcto
        }

        // System.out.println(x);  ERROR
    }

    //4. Ámbito en CICLOS
    int j = 0;
while (j < 3) {
    System.out.println(j);
    j++;
}
// j  sigue existiendo

//5. Ámbito de PARÁMETROS
void mostrar(int numero) { // parámetro
        System.out.println(numero);
    }

//6. Sombreado de variables (shadowing)
 int valor = 100;

    void mostrar() {
        int valor = 50; // sombrea la variable de clase
        System.out.println(valor); // 50
        System.out.println(this.valor); // 100
    }

/*     | Tipo de variable | Ámbito        |
| ---------------- | ------------- |
| Instancia        | Toda la clase |
| `static`         | Toda la clase |
| Local            | Método        |
| Bloque           | `{}`          |
| Parámetro        | Método        |
 */








}

