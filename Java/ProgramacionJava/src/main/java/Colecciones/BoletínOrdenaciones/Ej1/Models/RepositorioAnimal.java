package Colecciones.BoletínOrdenaciones.Ej1.Models;

import JavaOrientadoObjetos.Probando.Interfaces.Animal;

import java.util.Set;
import java.util.TreeSet;

public class RepositorioAnimal {
    private String nombre;
    private String lugar;
    private int presupuestoAnual;
    private Set<Animales> animales;

    public RepositorioAnimal(String nombre, String lugar, int presupuestoAnual, Set<Animal> animales) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.presupuestoAnual = presupuestoAnual;
        this.animales = new TreeSet<Animales>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getPresupuestoAnual() {
        return presupuestoAnual;
    }

    public void setPresupuestoAnual(int presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }



}
