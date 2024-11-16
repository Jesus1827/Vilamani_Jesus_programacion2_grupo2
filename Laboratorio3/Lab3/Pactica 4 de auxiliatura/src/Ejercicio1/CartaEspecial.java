package Ejercicio1;

class CartaEspecial extends Carta implements Accionable {
    public CartaEspecial(int valor, String palo) {
        super(valor, palo);
    }

    @Override
    public void jugar() {
        System.out.println("Se ha jugado una carta especial.");
    }

    @Override
    public void realizarAccion() {
        System.out.println("¡Acción especial de la carta activada!");
    }
}