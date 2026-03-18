package Colecciones.BoletínListas.Ej3.Models;

import java.util.Date;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int ano_publ;
    private Estado estado;

    public Libro(String titulo, String autor, String genero, int ano_publ, Estado estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano_publ = ano_publ;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno_publ() {
        return ano_publ;
    }

    public void setAno_publ(int ano_publ) {
        this.ano_publ = ano_publ;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", ano_publ=" + getAno_publ() +
                ", estado=" + getEstado() +
                '}';
    }
}
