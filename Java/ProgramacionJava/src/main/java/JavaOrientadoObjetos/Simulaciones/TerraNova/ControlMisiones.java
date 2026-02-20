package JavaOrientadoObjetos.Simulaciones.TerraNova;

import java.time.LocalDate;

public class ControlMisiones {
    static void main(String[] args) {
        Nave nave1 = new Nave("NCC-1991", "Xiaomi", 20);
        Nave nave2 = new Nave("NCC-1983", "Samsung", 45);
        MisionDeExploracion misionExp1 = new MisionDeExploracion("101", "Mars", LocalDate.now().plusDays(4), nave1, Estado.PLANIFICADA, "Marte", 40);

    }
}
