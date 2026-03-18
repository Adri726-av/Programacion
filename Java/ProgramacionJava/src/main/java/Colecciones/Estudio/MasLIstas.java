package Colecciones.Estudio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MasLIstas {
    static void main(String[] args) {
        List<String> cadenas = new ArrayList<String>();
        cadenas.add("Hola");
        cadenas.add("Adios");
        cadenas.add("Zeta");

        Collections.sort(cadenas);

        for(String cadena : cadenas)
        {
            System.out.println(cadena);
        }
    }
}
