package ejercicio4;

import java.util.Scanner;

public class DuraciónDiscurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el número de directores
        int N = scanner.nextInt();
        // Leer la duración máxima de la reunión
        int K = scanner.nextInt();
        
        // Calcular la duración máxima de cada discurso
        int maxDuration = (K - (N - 1)) / N;
        
        // Asegurarse de que la duración mínima sea al menos 1 minuto
        if (maxDuration < 1) {
            maxDuration = 1;
        }
        
        // Imprimir el resultado
        System.out.println(maxDuration);
        
        scanner.close();
    }
}