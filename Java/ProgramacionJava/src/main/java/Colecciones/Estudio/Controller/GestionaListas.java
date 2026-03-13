package Colecciones.Estudio.Controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionaListas {
    static void main(String[] args) {
        // Creamos la lista (ArrayList)
        List<String> listaArray = new ArrayList<String>();
        listaArray.add("Barcelona");
        listaArray.add("Huelva");
        listaArray.add("Madrid");

        // Recorremos la lista

        for(String elemento : listaArray)
        {
            System.out.println(elemento);
        }

        for(int i = 0; i < listaArray.size(); i++)
        {
            System.out.println(listaArray.get(i));
        }

        // Esta se usa para LinkedList
        Iterator<String> iterador = listaArray.iterator();
        while(iterador.hasNext())
        {
            System.out.println(iterador.next());
        }
    }
}
