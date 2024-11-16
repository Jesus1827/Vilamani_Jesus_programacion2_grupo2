package Ejercicio3;

public class SimulacionGranjas {
    public static void main(String[] args) {
        // Crear instancias de Vaca y Oveja
        Animal vaca = new Vaca("Lola", 5);
        Animal oveja = new Oveja("Dolly", 3);

        // Mostrar información y acciones de la vaca
        vaca.mostrarInfo();
        vaca.hacerSonido();
        ((Productor) vaca).producir();

        System.out.println();

        // Mostrar información y acciones de la oveja
        oveja.mostrarInfo();
        oveja.hacerSonido();
        ((Productor) oveja).producir();
    }
}