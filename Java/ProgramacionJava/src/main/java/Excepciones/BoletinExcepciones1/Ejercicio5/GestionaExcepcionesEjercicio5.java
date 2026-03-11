package Excepciones.BoletinExcepciones1.Ejercicio5;
import Excepciones.GestionaExcepcionesPropias;
import Exceptions.MiExcepcion;

import java.util.Random;

public class GestionaExcepcionesEjercicio5 {
    void metodo1 () {
        try {
            throw new MiExcepcion("Lanzando mi excepcion");
        } catch (MiExcepcion e) {
            System.out.println(e.toString());
        }
    }

    static void main(String[] args) {
        GestionaExcepcionesEjercicio5 g = new GestionaExcepcionesEjercicio5();
        g.metodo1();
    }
}
