package Colecciones.BoletínListas.Ej3.Models;

import Colecciones.BoletínListas.Ej3.Exceptions.BibliotecaException;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }

    public void prestarLibro(Libro l)throws BibliotecaException{
        if(this.libros.contains(l)){
            int pos = libros.indexOf(l);
            Libro libroencontrado = libros.get(pos);
            if(libroencontrado.getEstado().equals(Estado.LIBRE))
            libroencontrado.setEstado(Estado.PRESTADO);
        else{
            throw new BibliotecaException("Libro ya esta prestado");
            }
        }
        else {
            throw new BibliotecaException("Libro no esta en la biblioteca " + l);
        }
    }

    public void devolverLibro(Libro libro) throws BibliotecaException {
        if (!this.libros.contains(libro) || libro.getEstado() == Estado.LIBRE){
            throw new BibliotecaException("No está en el inventario o es libre");
        }
        else {
            System.out.println("Devolviendo libro...");
        }
    }

    public void mostrarLista(){
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void mostrarInfo(Libro libro){
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Género: " + libro.getGenero());
        System.out.println("Año publicacion: " + libro.getAno_publ());
        System.out.println("Ejemplares libres");
        for (Libro librot : libros){
            if(librot.getEstado() == Estado.LIBRE){
                System.out.println(librot.getTitulo() + " de " + librot.getAutor());
            }
        }
        System.out.println("Ejemplares prestados");
        for (Libro librot : libros){
            if(librot.getEstado() == Estado.PRESTADO){
                System.out.println(librot.getTitulo() + " de " + librot.getAutor());
            }
        }
    }

    public void buscarLibro(String tit){
        for (Libro libro : libros){
            if (libro.getTitulo().equalsIgnoreCase(tit)){
                System.out.println(libro);
            }
        }
        for (Libro libro : libros){
            if (libro.getAutor().equalsIgnoreCase(tit)){
                System.out.println(libro);
            }
        }
    }
}
