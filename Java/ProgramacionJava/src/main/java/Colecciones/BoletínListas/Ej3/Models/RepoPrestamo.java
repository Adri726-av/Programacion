package Colecciones.BoletínListas.Ej3.Models;

import Colecciones.BoletínListas.Ej3.Exceptions.BibliotecaException;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RepoPrestamo{
    LinkedHashSet<Prestamo> prestamos;

    public RepoPrestamo() {
        this.prestamos = new LinkedHashSet<Prestamo>();
    }

    public void agregarPrestamo(Libro libro) throws BibliotecaException{
        Scanner sc = new Scanner(System.in);
        if (!libro.getEstado().equals(Estado.PRESTADO)){
            System.out.println("Introduce tu nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Introduce tu dni: ");
            String dni = sc.nextLine();
            Usuario user = new Usuario(nombre, dni);
            Prestamo pres = new Prestamo(libro, user, LocalDate.now());
            prestamos.add(pres);
            libro.setEstado(Estado.PRESTADO);
        }
        else {
            throw new BibliotecaException("No es posible realizar el préstamo de un libro que ya está prestado");
        }
    }

    public void devolverPrestamo(Libro libro) throws BibliotecaException{
        if (libro.getEstado().equals(Estado.PRESTADO)){
            libro.setEstado(Estado.LIBRE);
        }
        else {
            throw new BibliotecaException("No es posible devolver el prestamo de un libro que esta libre");
        }
    }

    public void mostrarPrestamos(){

    }

}
