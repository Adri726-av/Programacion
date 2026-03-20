package Colecciones.BoletínOrdenaciones.Ej1.Models;

import java.time.LocalDate;
import java.util.Objects;

public class Animales implements Comparable{
    private int id;
    private static int contador;
    private String nombre;
    private String especie;
    private int edad;
    private Comida comida;
    private LocalDate fechaNac;
    private int peso;
    private Medio medio;
    private Gestacion gestacion;

    public Animales(String nombre, String especie, int edad, Comida comida, LocalDate fechaNac, int peso, Medio medio, Gestacion gestacion) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.comida = comida;
        this.fechaNac = fechaNac;
        this.peso = peso;
        this.medio = medio;
        this.gestacion = gestacion;
        contador = contador +1;
        this.id = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Animales.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Medio getMedio() {
        return medio;
    }

    public void setMedio(Medio medio) {
        this.medio = medio;
    }

    public Gestacion getGestacion() {
        return gestacion;
    }

    public void setGestacion(Gestacion gestacion) {
        this.gestacion = gestacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animales animales = (Animales) o;
        return id == animales.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Object o) {
        Animales aComp = (Animales) o;
        int resultado = this.getNombre().compareTo(aComp.getNombre());
        if (resultado == 0){
            resultado = this.id - aComp.getId();
        }
        return resultado;
    }
}
