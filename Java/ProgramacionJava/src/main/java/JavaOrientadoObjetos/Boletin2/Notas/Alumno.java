package JavaOrientadoObjetos.Boletin2.Notas;

public class Alumno {
    String nombre;
    String apellidos;
    String email;
    NotaAsignatura  notaProg;
    NotaAsignatura notaBBDD;

    public Alumno(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", notaProg=" + notaProg +
                ", notaBBDD=" + notaBBDD +
                '}';
    }

    public void imprimeAprobados (String nombreAsig) {
        if (this.notaProg.nombreAsig.equals(nombreAsig)) {
            if (this.notaProg.NotaMedia()>5) {
                System.out.println("El alumno " + nombre + " ha aprobado la asignatura " + nombreAsig);
            }
        }
        else {
            if (this.notaBBDD.NotaMedia()>5) {
                System.out.println("El alumno " + nombre + " NO ha aprobado la asignatura " + nombreAsig);
            }
        }
    }
}
