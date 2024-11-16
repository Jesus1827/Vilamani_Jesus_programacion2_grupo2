package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Jesús", 300);
        Jugador jugador2 = new Jugador("Jesús2", 400);

        CalculadoraBonificacion doblePuntos = puntosBase -> puntosBase * 2;


        jugador1.aplicarBonificacion(doblePuntos);
        jugador2.aplicarBonificacion(doblePuntos);

        jugador1.mostrarPuntos();
        jugador2.mostrarPuntos();

    }
}