import java.util.Random;

import Jugador1.Mago;
import Jugador2.Jefe;

public class MiniJuego {
    public static void main(String[] args) {
        Random random = new Random();
        Mago mago = new Mago("Thor", random.nextInt(10) + 1, 100, 50);
        Jefe jefe = new Jefe("Thanos", 150, 30, 2.5);

        jefe.hablar();

        while (mago.getPuntosVida() > 0 && jefe.getPuntosVida() > 0) {
            // Mago ataca
            int dañoMago = random.nextInt(11) + 10;
            jefe.recibirDaño(dañoMago);
            mago.lanzarHechizo();
            mago.mostrarEstado();
            if (!jefe.estaVivo()) {
                System.out.println(mago.getNombre() + " ha derrotado al jefe " + jefe.getNombre() + "!");
                break;
            }

            // Jefe ataca con ataque crítico
            int dañoJefe = jefe.ataqueCritico();
            mago.recibirDaño(dañoJefe);
            jefe.mostrarEstado();

            if (mago.getPuntosVida() <= 0) {
                System.out.println(jefe.getNombre() + " ha derrotado a " + mago.getNombre() + "!");
            }
        }
    }
}
