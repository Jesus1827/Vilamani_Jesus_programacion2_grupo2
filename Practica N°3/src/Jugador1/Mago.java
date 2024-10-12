package Jugador1;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    public void lanzarHechizo() {
        System.out.println(getNombre() + " ha lanzado un hechizo!");
    }
}