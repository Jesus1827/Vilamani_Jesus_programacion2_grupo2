package Ejercicio4;

class Objeto {
    private final String nombre;
    private final double peso;

    // Constructor
    public Objeto(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    // Método toString para imprimir el objeto
    @Override
    public String toString() {
        return "Objeto{" + "nombre='" + nombre + '\'' + ", peso=" + peso + '}';
    }
}