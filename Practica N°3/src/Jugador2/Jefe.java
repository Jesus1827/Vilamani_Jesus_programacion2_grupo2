package Jugador2;

public class Jefe extends Enemigo {
    private double multiplicadorDaño;

    public Jefe(String nombre, int puntosVida, int dañoBase, double multiplicadorDaño) {
        super(nombre, puntosVida, dañoBase);
        this.multiplicadorDaño = multiplicadorDaño;
    }

    public void hablar() {
        System.out.println(getNombre() + ": ¡Prepárate para tu fin, mortal!");
    }

    public int ataqueCritico() {
        int dañoCritico = (int) (super.atacar() * multiplicadorDaño);
        System.out.println(getNombre() + " ha realizado un ataque crítico de " + dañoCritico + " puntos!");
        return dañoCritico;
    }
}