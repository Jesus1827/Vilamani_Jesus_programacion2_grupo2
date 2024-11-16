package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private List<EventoNotificacion> notificaciones;

    // Constructor para inicializar el nombre del evento y la lista de notificaciones
    public Evento(String nombre) {
        this.nombre = nombre;
        this.notificaciones = new ArrayList<>();
    }

    // Método para registrar notificaciones
    public void registrarNotificacion(EventoNotificacion notificacion) {
        notificaciones.add(notificacion);
    }

    // Método para activar el evento y notificar a todos
    public void activar() {
        String mensaje = "El evento '" + nombre + "' ha sido activado.";
        for (EventoNotificacion notificacion : notificaciones) {
            notificacion.Notificar(mensaje);
        }
    }
}
