package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Aventura
        Aventura aventura = new Aventura();

        // Agregar diferentes tareas usando expresiones lambda
        aventura.agregarTarea(() -> System.out.println("Recolectar madera para construir un refugio."));
        aventura.agregarTarea(() -> System.out.println("Buscar agua en el río cercano."));
        aventura.agregarTarea(() -> System.out.println("Encender una fogata para mantener el calor."));
        aventura.agregarTarea(() -> System.out.println("Luchar contra los enemigos que acechan en la noche."));

        // Iniciar la aventura y ejecutar las tareas
        System.out.println("Iniciando la aventura...");
        aventura.iniciar();
    }
}