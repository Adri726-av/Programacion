package JavaOrientadoObjetos.Notas;

public class NotaAsignatura {
    String nombreAsig;
    double notaprimertrimestre;
    double notasegundotrimestre;
    double notatercertrimestre;

    public NotaAsignatura(String nombre, double notaprimertrimestre, double notasegundotrimestre, double notatercertrimestre) {
        this.nombreAsig = nombre;
        this.notaprimertrimestre = notaprimertrimestre;
        this.notasegundotrimestre = notasegundotrimestre;
        this.notatercertrimestre = notatercertrimestre;
    }

    public double NotaMedia() {
        double media = (notaprimertrimestre + notasegundotrimestre + notatercertrimestre) / 3;
        return media;
    }

    int calculaTrimestresAprobados() {
        int contador = 0;
        if (notaprimertrimestre>=5) {
            contador++;
        }
        else if (notasegundotrimestre>=5) {
            contador++;
        }
        else if (notatercertrimestre>=5) {
            contador++;
        }
        return contador;
    }

    @Override
    public String toString() {
        return "NotaAsignatura{" +
                "nombreAsig='" + nombreAsig + '\'' +
                ", notaprimertrimestre=" + notaprimertrimestre +
                ", notasegundotrimestre=" + notasegundotrimestre +
                ", notatercertrimestre=" + notatercertrimestre +
                '}';
    }
}
