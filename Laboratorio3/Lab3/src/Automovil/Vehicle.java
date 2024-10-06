package Automovil;

public class Vehicle {
    private String brand;
    private String model;
    private double price;
// Constructor
    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
// Método para arrancar
    public void start() {
        System.out.println(brand + " " + model + " is starting.");
    }
// Método para detener
    public void stop() {
        System.out.println(brand + " " + model + " is stopping.");
    }
// Método para mostar imformacion del vehiculo
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}
