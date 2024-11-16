package Ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SistemaDeBotin {

    private static final String[] TIPOS = {"Arma", "Escudo", "Modificador"};
    private static final String[] RAREZAS = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<Map<String, Object>> botinObtenido = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            Map<String, Object> botin = generarBotin();
            botinObtenido.add(botin);
            imprimirBotin(botin);

            System.out.print("¿Deseas seguir enfrentándote a enemigos para obtener más botín? (s/n): ");
            String respuesta = scanner.nextLine();
            continuar = respuesta.equalsIgnoreCase("s");
        }

        mostrarResumen(botinObtenido);
    }

    public static Map<String, Object> generarBotin() {
        Map<String, Object> botin = new HashMap<>();
        
        // Seleccionar tipo de botín
        String tipo = TIPOS[random.nextInt(TIPOS.length)];
        botin.put("tipo", tipo);
        
        // Seleccionar rareza
        String rareza = RAREZAS[random.nextInt(RAREZAS.length)];
        botin.put("rareza", rareza);
        
        // Generar atributos según el tipo de botín
        switch (tipo) {
            case "Arma":
                int dano = random.nextInt(100) + 1; // Daño entre 1 y 100
                botin.put("atributo_1", "Daño");
                botin.put("valor_1", dano);
                break;
            case "Escudo":
                int absorcion = random.nextInt(50) + 1; // Capacidad de absorción entre 1 y 50
                botin.put("atributo_1", "Capacidad de absorción");
                botin.put("valor_1", absorcion);
                break;
            case "Modificador":
                int mejora = random.nextInt(20) + 1; // Mejora entre 1 y 20
                botin.put("atributo_1", "Mejora de habilidad");
                botin.put("valor_1", mejora);
                break;
        }

        return botin;
    }

    public static void imprimirBotin(Map<String, Object> botin) {
        System.out.println("¡Has encontrado un botín!");
        System.out.println("Tipo: " + botin.get("tipo"));
        System.out.println("Rareza: " + botin.get("rareza"));
        System.out.println(botin.get("atributo_1") + ": " + botin.get("valor_1"));
        System.out.println();
    }

    public static void mostrarResumen(List<Map<String, Object>> botinObtenido) {
        System.out.println("Resumen del botín obtenido:");
        for (Map<String, Object> botin : botinObtenido) {
            System.out.println("Tipo: " + botin.get("tipo"));
            System.out.println("Rareza: " + botin.get("rareza"));
            System.out.println(botin.get("atributo_1") + ": " + botin.get("valor_1"));
            System.out.println();
        }
    }
}