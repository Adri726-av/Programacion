package JavaOrientadoObjetos.Boletin2.Libro;

public class Libro {
    // Atributos
    String isbn;
    String titulo;
    String autor;
    int numPaginas;

    // Metodo
    @Override
    public String toString() {
        return "libro{" +
                "titulo='" + titulo + '\'' +
                ", numpaginas=" + numPaginas +
                '}';
    }
}
