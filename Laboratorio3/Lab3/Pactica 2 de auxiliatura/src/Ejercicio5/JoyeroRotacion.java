package Ejercicio5;

import java.util.Scanner;

public class JoyeroRotacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer tamaño de la matriz
        int N = sc.nextInt();
        int[][] joyero = new int[N][N];
        int[][] original = new int[N][N];

        // Leer matriz de entrada y guardar el estado original
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                joyero[i][j] = sc.nextInt();
                original[i][j] = joyero[i][j];
            }
        }

        // Probar cuántas rotaciones son necesarias
        for (int rotaciones = 0; rotaciones < 4; rotaciones++) {
            if (rotaciones > 0) {
                joyero = rotarAntihorario(joyero);
            }
            if (esIgual(joyero, original)) {
                System.out.println(rotaciones);
                return;
            }
        }
    }

    // Método para rotar la matriz 90° en sentido antihorario
    private static int[][] rotarAntihorario(int[][] matriz) {
        int N = matriz.length;
        int[][] rotada = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotada[N - j - 1][i] = matriz[i][j];
            }
        }
        return rotada;
    }

    // Método para comparar dos matrices
    private static boolean esIgual(int[][] matriz1, int[][] matriz2) {
        int N = matriz1.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
