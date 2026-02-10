package JavaOrientadoObjetos.Boletin2.Libro;

public class GestionaLibro {
    static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Don Quijote";
        libro1.autor = "Cervantes";
        libro1.numPaginas = 86;
        libro1.isbn = "1234567";

        Libro libro2 = new Libro();
        libro2.titulo = "100 años de soledad";
        libro2.autor = "García Márquez";
        libro2.numPaginas = 496;
        libro2.isbn = "98765";

        Libro libro3 = new Libro();
        libro3.titulo = "odisea";
        libro3.autor = "Homero";
        libro3.numPaginas = 528;
        libro3.isbn = "13579";

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
    }
}
