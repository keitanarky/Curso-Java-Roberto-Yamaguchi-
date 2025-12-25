package Clase14;

public class RaizCuadrada {

}

//1  Raíz cuadrada con Math.sqrt()
double numero = 2;
double raiz = Math.sqrt(numero);

System.out.println(raiz); // 1.4142135623730951

//2 Limitar decimales con DecimalFormat (RECOMENDADO)
import java.text.DecimalFormat;

public class Decimales {
    public static void main(String[] args) {

        double numero = 2;
        double raiz = Math.sqrt(numero);

        DecimalFormat df = new DecimalFormat("#.##"); // 2 decimales
        System.out.println(df.format(raiz));
    }
}



//3   Limitar decimales con String.format()
double raiz = Math.sqrt(2);

System.out.printf("%.3f", raiz); // 3 decimales


o

String resultado = String.format("%.2f", raiz);
System.out.println(resultado);

//4 Limitar decimales con Math.round()
double raiz = Math.sqrt(2);

double redondeado = Math.round(raiz * 100.0) / 100.0;
System.out.println(redondeado); // 1.41


//5 Usando BigDecimal (más preciso)
import java.math.BigDecimal;
import java.math.RoundingMode;

double raiz = Math.sqrt(2);

BigDecimal bd = new BigDecimal(raiz);
bd = bd.setScale(4, RoundingMode.HALF_UP);

System.out.println(bd);


