package Ejercicio6;

import java.util.Scanner;

public class FraccionesContinuas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el valor de N
        int N = scanner.nextInt();
        
        // Calcular el numerador de P_N, que es F(N+1)
        int resultado = fibonacci(N + 1);
        
        // Imprimir el resultado
        System.out.println(resultado);
        
        scanner.close();
    }

    // Función para calcular el n-ésimo número de Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b; // b es F(n)
    }
}