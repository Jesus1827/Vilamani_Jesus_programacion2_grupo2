package Jugador1;

public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosVida;
    private Inventario inventario;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.inventario = new Inventario();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + ", Nivel: " + nivel + ", Puntos de vida: " + puntosVida);
    }

    public void recibirDaño(int daño) {
        puntosVida -= daño;
        System.out.println(nombre + " ha recibido " + daño + " puntos de daño. Puntos de vida restantes: " + puntosVida);
    }

    public void curar() {
        puntosVida += 20;
        System.out.println(nombre + " ha sido curado. Puntos de vida: " + puntosVida);
    }

    public Inventario getInventario() {
        return inventario;
    }
}