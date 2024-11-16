package ejercicio2;

public class Jugador {
    private String name;
    private int puntos;
    
    public Jugador(String name, int puntos) {
        this.name = name;
        this.puntos = puntos;
    }
    
    public void aplicarBonificacion(CalculadoraBonificacion calculadora){
        this.puntos = calculadora.calcular(this.puntos);
    
    }
    public void mostrarPuntos(){
        System.out.println("Nombre: "+this.name);
        System.out.println("Puntos con bonificación: "+this.puntos);
    }
    
}
