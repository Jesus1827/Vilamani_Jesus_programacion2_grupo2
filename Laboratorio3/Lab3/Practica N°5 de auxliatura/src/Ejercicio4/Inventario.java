package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

class Inventario {
    private final List<Objeto> objetos = new ArrayList<>();

    // Método para agregar un objeto al inventario
    public void agregarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }

    // Método para filtrar objetos según un filtro dado
    public List<Objeto> filtrarObjetos(FiltroObjeto filtro) {
        List<Objeto> resultado = new ArrayList<>();
        for (Objeto objeto : objetos) {
            if (filtro.filtrar(objeto)) {
                resultado.add(objeto);
            }
        }
        return resultado;
    }
}