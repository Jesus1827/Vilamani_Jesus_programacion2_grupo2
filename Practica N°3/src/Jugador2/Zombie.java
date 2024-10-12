package Jugador2;

public class Zombie extends Enemigo {
    public Zombie(String nombre, int puntosVida, int dañoBase) {
        super(nombre, puntosVida, dañoBase);
    }

    @Override
    public int atacar() {
        recibirVida(5); // Regenera vida al atacar
        return super.atacar();
    }

    public void recibirVida(int vida) {
        System.out.println(getNombre() + " ha regenerado " + vida + " puntos de vida.");
        setPuntosVida(getPuntosVida() + vida);
    }
}