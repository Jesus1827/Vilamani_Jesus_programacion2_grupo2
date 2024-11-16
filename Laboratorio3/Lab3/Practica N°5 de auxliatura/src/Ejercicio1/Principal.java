package Ejercicio1;

public class Principal {
    public static void main(String[] args) {
        // Crear un evento
        Evento evento1 = new Evento("Lanzamiento de cofre raro");

        // Registrar diferentes notificaciones utilizando lambdas
        evento1.registrarNotificacion(mensaje -> System.out.println("Jugador 1 recibió: " + mensaje));
        evento1.registrarNotificacion(mensaje -> System.out.println("Jugador 2 recibió: " + mensaje));
        evento1.registrarNotificacion(mensaje -> System.out.println("Jugador 3 recibió: " + mensaje));

        // Activar el evento y notificar a todos
        evento1.activar();

        // Crear otro evento y demostrar la flexibilidad
        Evento evento2 = new Evento("Invasión de enemigos");
        evento2.registrarNotificacion(mensaje -> System.out.println("Sistema alerta: " + mensaje));
        evento2.registrarNotificacion(mensaje -> System.out.println("Administrador notificado: " + mensaje));
        
        evento2.activar();
    }
}
