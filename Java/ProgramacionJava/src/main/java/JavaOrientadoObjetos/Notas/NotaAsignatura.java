package JavaOrientadoObjetos.Notas;

public class NotaAsignatura {
    String nombre;
    double notaprimertrimestre;
    double notasegundotrimestre;
    double notatercertrimestre;

    public NotaAsignatura(String nombre, double notaprimertrimestre, double notasegundotrimestre, double notatercertrimestre) {
        this.nombre = nombre;
        this.notaprimertrimestre = notaprimertrimestre;
        this.notasegundotrimestre = notasegundotrimestre;
        this.notatercertrimestre = notatercertrimestre;
    }

    public void NotaMedia() {
        double media = (notaprimertrimestre + notasegundotrimestre + notatercertrimestre) / 3;

    }
}
