package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

class Aventura {
    private final List<Tarea> tareas = new ArrayList<>(); // Lista para almacenar tareas

    // Método para agregar una tarea
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    // Método para iniciar y ejecutar todas las tareas
    public void iniciar() {
        for (Tarea tarea : tareas) {
            tarea.ejecutar(); // Ejecuta cada tarea en la lista
        }
    }
}