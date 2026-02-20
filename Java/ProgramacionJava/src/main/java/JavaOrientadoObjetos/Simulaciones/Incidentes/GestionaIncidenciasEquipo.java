package JavaOrientadoObjetos.Simulaciones.Incidentes;

public class GestionaIncidenciasEquipo {
    static void main(String[] args) {
        Equipo equipo1 = new Equipo("equipo1", "3C:D9:2B:88:99:AA", "", 2);
        Equipo equipo2 = new Equipo("equipo2", "3C:D9:2B:88:99:AA", "", 0);
        Equipo equipo3 = new Equipo("equipo3", "3C:D9:2B:88:99:AA", "", 1);
        Equipo equipo4 = new Equipo("equipo4", "3C:D9:2B:88:99:AA", "", 2);

        Incidencia incidente1 = new Incidencia(1234, "hola", "",Estado.EN_RESOLUCION, Criticidad.CRITICA, equipo1);


        Incidencia incidente2 = new Incidencia(1534, "hola1", "",Estado.CERRADA, Criticidad.LEVE, equipo2);
        Incidencia incidente3 = new Incidencia(1224, "hola2", "", Estado.ANALIZADA, Criticidad.MEDIA, equipo3);
        Incidencia incidente4 = new Incidencia(3234, "hola3", "", Estado.REGISTRADA, Criticidad.GRAVE, equipo4);

    }
}
