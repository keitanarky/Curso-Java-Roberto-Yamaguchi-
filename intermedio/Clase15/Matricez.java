package Clase15;

public class Matricez {

}


//1 suma de matrices
public class SumaMatrices {

    public static void main(String[] args) {

        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int filas = A.length;
        int columnas = A[0].length;

        int[][] suma = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = A[i][j] + B[i][j];
            }
        }

        // Mostrar resultado
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//2 resta de matrices
public class RestaMatrices {

    public static void main(String[] args) {

        int[][] A = {
            {9, 8},
            {7, 6}
        };

        int[][] B = {
            {1, 2},
            {3, 4}
        };

        int[][] resta = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resta[i][j] = A[i][j] - B[i][j];
            }
        }

        // Mostrar resultado
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resta[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//3 multiplicacion de matrices
public class MultiplicacionMatrices {

    public static void main(String[] args) {

        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int filasA = A.length;
        int columnasA = A[0].length;
        int columnasB = B[0].length;

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Mostrar resultado
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
