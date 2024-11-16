package Ejercicio2;

abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;

    // Constructor para inicializar los atributos
    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método abstracto que debe ser implementado por las clases derivadas
    public abstract void acelerar();

    // Método para mostrar la información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}