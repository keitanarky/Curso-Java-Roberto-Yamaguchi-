package Clase13;

public class Math {

}


//1 Math.sin() – Seno
public class SenoEjemplo {
    public static void main(String[] args) {

        double grados = 30;
        double radianes = Math.toRadians(grados);

        double seno = Math.sin(radianes);

        System.out.println("Seno de 30° = " + seno);
    }
}


📌 Resultado ≈ 0.5

//2 Math.cos() – Coseno
public class CosenoEjemplo {
    public static void main(String[] args) {

        double grados = 60;
        double radianes = Math.toRadians(grados);

        double coseno = Math.cos(radianes);

        System.out.println("Coseno de 60° = " + coseno);
    }
}


📌 Resultado ≈ 0.5
//3 Math.tan() – Tangente
public class TangenteEjemplo {
    public static void main(String[] args) {

        double grados = 45;
        double radianes = Math.toRadians(grados);

        double tangente = Math.tan(radianes);

        System.out.println("Tangente de 45° = " + tangente);
    }
}


📌 Resultado ≈ 1.0

//4 Funciones trigonométricas INVERSAS

Estas devuelven radianes, no grados.

Math.asin() – Arcoseno
double valor = 0.5;
double rad = Math.asin(valor);
System.out.println(Math.toDegrees(rad)); // 30°

Math.acos() – Arcocoseno
double valor = 0.5;
double rad = Math.acos(valor);
System.out.println(Math.toDegrees(rad)); // 60°

Math.atan() – Arcotangente
double valor = 1;
double rad = Math.atan(valor);
System.out.println(Math.toDegrees(rad)); // 45°

//5 Otras funciones trigonométricas útiles
Función	Descripción
Math.atan2(y, x)	Ángulo correcto según cuadrante
Math.hypot(a, b)	√(a² + b²)
Ejemplo atan2
double x = 1;
double y = 1;

double angulo = Math.toDegrees(Math.atan2(y, x));
System.out.println(angulo); // 45°