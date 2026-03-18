package Colecciones.BoletínListas.Ej3.Models;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo implements Comparable{
    private Libro libro;
    private int id;
    private static int contador;
    private Usuario usuario;
    private LocalDate fecha;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fecha) {
        this.libro = libro;
        contador = contador + 1;
        this.id = contador;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Prestamo prestamo)) return false;
        return id == prestamo.id && Objects.equals(libro, prestamo.libro) && Objects.equals(usuario, prestamo.usuario) && Objects.equals(fecha, prestamo.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libro, id, usuario, fecha);
    }

    @Override
    public int compareTo(Object o) {
        Prestamo p = (Prestamo) o;
        return this.fecha.compareTo(fecha);
    }
}
