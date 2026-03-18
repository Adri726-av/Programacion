package Colecciones.BoletínListas.Ej3.Controller;

import Colecciones.BoletínListas.Ej3.Exceptions.BibliotecaException;
import Colecciones.BoletínListas.Ej3.Models.Biblioteca;
import Colecciones.BoletínListas.Ej3.Models.Estado;
import Colecciones.BoletínListas.Ej3.Models.Libro;
import Colecciones.BoletínListas.Ej3.Models.RepoPrestamo;

import java.util.Scanner;

public class GestionaBiblioteca {
    public int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Agregar un nuevo libro al inventario.");
        System.out.println("2. Prestar un ejemplar de un libro.");
        System.out.println("3. Devolver un ejemplar prestado.");
        System.out.println("4. Mostrar la lista de todos los libros en el inventario.");
        System.out.println("5. Mostrar información detallada de un libro a partir de su isbn: título, autor, " +
                "género, año de publicación, ejemplares disponibles y ejemplares prestados.");
        System.out.println("6. Buscar libros por título o autor.");
        System.out.println("7. Salir del programa.");
        System.out.println("\n Elige una opcion: ");
        int opcion = sc.nextInt();
        return opcion;
    }
    static void main(String[] args) throws BibliotecaException {
        Libro l1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico", 1967, Estado.LIBRE);
        Libro l2 = new Libro("1984", "George Orwell", "Distopía", 1949, Estado.PRESTADO);
        Libro l3 = new Libro("El principito", "Antoine de Saint-Exupéry", "Fábula", 1943, Estado.LIBRE);
        Biblioteca b = new Biblioteca();
        GestionaBiblioteca g = new GestionaBiblioteca();
        RepoPrestamo r = new RepoPrestamo();
        int opcion = g.menu();
        while (opcion != 7) {
            if (opcion == 1){
                //Agregar libro
            }
            if (opcion == 2){
                //Prestar libro
                //Agregar prestamo
            }
            if (opcion == 3){
                //Devolver libro
                //Devolver prestamo
            }
            if (opcion == 4){
                //Mostrar lista de libros
            }
            if (opcion == 5){
                //Mostrar informacion de un libro
            }
            if (opcion == 6){
                //Buscar libro
            }
            opcion = g.menu();
        }
    }
}
