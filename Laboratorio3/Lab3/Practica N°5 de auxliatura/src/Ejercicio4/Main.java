package Ejercicio4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un inventario y agregar objetos
        Inventario inventario = new Inventario();
        inventario.agregarObjeto(new Objeto("Espada", 5.0));
        inventario.agregarObjeto(new Objeto("Escudo", 10.0));
        inventario.agregarObjeto(new Objeto("Poción de vida", 1.5));
        inventario.agregarObjeto(new Objeto("Lingote de oro", 20.0));
        inventario.agregarObjeto(new Objeto("Mapa del tesoro", 0.5));

        // Filtrar objetos por diferentes criterios usando expresiones lambda
        System.out.println("Objetos con peso menor a 5:");
        List<Objeto> ligeros = inventario.filtrarObjetos(obj -> ((Objeto) obj).getPeso() < 5);
        ligeros.forEach(System.out::println);

        System.out.println("\nObjetos cuyo nombre contiene 'de':");
        List<Objeto> nombreContieneDe = inventario.filtrarObjetos(obj -> ((Objeto) obj).getNombre().contains("de"));
        nombreContieneDe.forEach(System.out::println);

        System.out.println("\nObjetos con peso mayor o igual a 10:");
        List<Objeto> pesados = inventario.filtrarObjetos(obj -> ((Objeto) obj).getPeso() >= 10);
        pesados.forEach(System.out::println);
    }
}