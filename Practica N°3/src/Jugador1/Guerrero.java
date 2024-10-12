package Jugador1;

public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int nivel, int puntosVida, int fuerza) {
        super(nombre, nivel, puntosVida);
        this.fuerza = fuerza;
    }

    public void atacar() {
        System.out.println(getNombre() + " ha realizado un ataque!");
    }
}