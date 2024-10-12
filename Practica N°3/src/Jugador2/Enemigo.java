package Jugador2;

public class Enemigo {
    private String nombre;
    private int puntosVida;
    private int dañoBase;

    public Enemigo(String nombre, int puntosVida, int dañoBase) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.dañoBase = dañoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getDañoBase() {
        return dañoBase;
    }

    public void setDañoBase(int dañoBase) {
        this.dañoBase = dañoBase;
    }

    public int atacar() {
        return dañoBase;
    }

    public void recibirDaño(int daño) {
        puntosVida -= daño;
        System.out.println(nombre + " ha recibido " + daño + " puntos de daño. Puntos de vida restantes: " + puntosVida);
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + ", Puntos de vida: " + puntosVida);
    }
}