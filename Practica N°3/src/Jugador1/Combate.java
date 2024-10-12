package Jugador1;
import java.util.Random;

public class Combate {
    public static void main(String[] args) {
        Random random = new Random();

        Mago mago = new Mago("Thor", random.nextInt(10) + 1, 100, 50);
        Guerrero guerrero = new Guerrero("Thanos", random.nextInt(10) + 1, 100, 70);

        while (mago.getPuntosVida() > 0 && guerrero.getPuntosVida() > 0) {
            // Mago ataca
            int dañoMago = random.nextInt(11) + 10;
            guerrero.recibirDaño(dañoMago);
            mago.lanzarHechizo();
            mago.mostrarEstado();
            guerrero.mostrarEstado();

            if (guerrero.getPuntosVida() <= 0) {
                System.out.println(mago.getNombre() + " ha ganado el combate!");
                break;
            }

            // Guerrero ataca
            int dañoGuerrero = random.nextInt(11) + 10;
            mago.recibirDaño(dañoGuerrero);
            guerrero.atacar();
            mago.mostrarEstado();
            guerrero.mostrarEstado();

            if (mago.getPuntosVida() <= 0) {
                System.out.println(guerrero.getNombre() + " ha ganado el combate!");
            }
        }
    }
}