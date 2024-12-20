package Ejercicio3;

public class Oveja extends Animal implements Productor {
    public Oveja(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La oveja hace: Beeeeee");
    }

    @Override
    public void producir() {
        System.out.println("La oveja está produciendo lana.");
    }
}