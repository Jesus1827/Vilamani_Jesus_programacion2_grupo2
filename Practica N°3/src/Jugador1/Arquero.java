package Jugador1;

public class Arquero extends Personaje {
    private int destreza;

    public Arquero(String nombre, int nivel, int puntosVida, int destreza) {
        super(nombre, nivel, puntosVida);
        this.destreza = destreza;
    }

    public void dispararFlecha() {
        System.out.println(getNombre() + " ha disparado una flecha!");
    }
}