package Ejercicio2;


public class JuegoDeCarreras {
    public static void main(String[] args) {
        // Crear un coche
        Vehiculo coche = new Coche("Toyota", "Corolla", 180);
        coche.mostrarInfo();
        coche.acelerar();

        // Crear una moto
         Moto moto = new Moto("Yamaha", "YZF-R3", 200);
        moto.mostrarInfo();
        moto.acelerar();
        moto.activarTurbo();
    }
}