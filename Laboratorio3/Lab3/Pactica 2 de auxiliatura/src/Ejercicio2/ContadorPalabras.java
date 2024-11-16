package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContadorPalabras {

    public static int contarPalabrasConLetra(List<String> palabras, char letra) {
        int contador = 0;

        for (String palabra : palabras) {
            if (palabra.length() > 0 && Character.toLowerCase(palabra.charAt(0)) == Character.toLowerCase(letra)) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        // Crear una lista de palabras
        List<String> palabras = new ArrayList<>();
        palabras.add("manzana");
        palabras.add("banana");
        palabras.add("mora");
        palabras.add("melón");
        palabras.add("cereza");
        palabras.add("mango");

        // Definir la letra a buscar
        char letra = 'm';

        // Contar y mostrar la cantidad de palabras que comienzan con la letra
        int cantidad = contarPalabrasConLetra(palabras, letra);
        System.out.println("Cantidad de palabras que comienzan con '" + letra + "': " + cantidad);
    }
}