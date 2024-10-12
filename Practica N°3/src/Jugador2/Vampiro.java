package Jugador2;

public class Vampiro extends Enemigo {
    public Vampiro(String nombre, int puntosVida, int dañoBase) {
        super(nombre, puntosVida, dañoBase);
    }

    @Override
    public int atacar() {
        int daño = super.atacar();
        recibirVida(daño / 2); // Roba vida al atacar
        return daño;
    }

    public void recibirVida(int vida) {
        System.out.println(getNombre() + " ha robado " + vida + " puntos de vida.");
        setPuntosVida(getPuntosVida() + vida);
    }
}