package Ejercicio1;

public class JuegoDeCartas {
    public static void main(String[] args) {
        // Crear una carta normal
        Carta cartaNormal = new CartaNormal(5, "Corazones");
        cartaNormal.mostrarCarta();
        cartaNormal.jugar();

        // Crear una carta especial
        CartaEspecial cartaEspecial = new CartaEspecial(10, "Espadas");
        cartaEspecial.mostrarCarta();
        cartaEspecial.jugar();
        cartaEspecial.realizarAccion();
    }
}