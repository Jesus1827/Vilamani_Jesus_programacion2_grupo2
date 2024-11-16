package Ejercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FechaConverter {

    private static final Map<String, Integer> meses = new HashMap<>();

    static {
        meses.put("enero", 1);
        meses.put("febrero", 2);
        meses.put("marzo", 3);
        meses.put("abril", 4);
        meses.put("mayo", 5);
        meses.put("junio", 6);
        meses.put("julio", 7);
        meses.put("agosto", 8);
        meses.put("septiembre", 9);
        meses.put("octubre", 10);
        meses.put("noviembre", 11);
        meses.put("diciembre", 12);
    }

    public static boolean validarFecha(int dia, int mes, int año) {
        // Días por mes
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Verificar si el año es bisiesto
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            diasPorMes[2] = 29; // Febrero tiene 29 días
        }

        // Validar mes y día
        if (mes < 1 || mes > 12) {
            return false;
        }
        return dia > 0 && dia <= diasPorMes[mes];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una fecha (ejemplo: '4 de junio, 2004'): ");
        String fechaStr = scanner.nextLine();

        try {
            String[] partes = fechaStr.split(" de ");
            int dia = Integer.parseInt(partes[0].trim());
            String[] mesAño = partes[1].split(", ");
            String mesStr = mesAño[0].trim();
            int año = Integer.parseInt(mesAño[1].trim());

            Integer mes = meses.get(mesStr.toLowerCase());

            if (mes != null && validarFecha(dia, mes, año)) {
                System.out.printf("%d / %02d / %d%n", dia, mes, año);
            } else {
                System.out.println("Error: Fecha inválida.");
            }
        } catch (Exception e) {
            System.out.println("Error: Formato de fecha incorrecto.");
        } finally {
            scanner.close();
        }
    }
}