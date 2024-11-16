package Ejercicio1;

abstract class Carta {
    protected int valor;
    protected String palo;

    // Constructor para inicializar los atributos
    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // Método abstracto que debe ser implementado por las clases derivadas
    public abstract void jugar();

    // Método para mostrar la carta
    public void mostrarCarta() {
        System.out.println("Carta: " + valor + " de " + palo);
    }
}