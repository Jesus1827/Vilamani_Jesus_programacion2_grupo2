package Jugador1;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<String> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }
    
    public void agregarItem(String item) {
        items.add(item);
        System.out.println(item + " añadido al inventario.");
    }

    public void mostrarItems() {
        if (items.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario: " + String.join(", ", items));
        }
    }
}
