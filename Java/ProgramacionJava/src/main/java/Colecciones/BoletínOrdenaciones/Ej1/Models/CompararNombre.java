package Colecciones.BoletínOrdenaciones.Ej1.Models;

import java.util.Comparator;

public class CompararNombre implements Comparator<Animales> {

    @Override
    public int compare(Animales o1, Animales o2) {
        int resultado = o1.getNombre().compareTo(o2.getNombre());
        if (resultado == 0){
            resultado = o1.getFechaNac().compareTo(o2.getFechaNac());
        }
        return resultado;
    }
}
