package JavaOrientadoObjetos.Boletin4.Herencia2.Ejercicio2;

import java.util.Objects;

public class Astro {
    private String nombre;
    private long masa;
    private int diametro_medio;
    private int per_rotacion;
    private int per_translacion;
    private int distancia_media;

    public Astro(String nombre, long masa, int diametro_medio, int per_rotacion, int per_translacion, int distancia_media) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro_medio = diametro_medio;
        this.per_rotacion = per_rotacion;
        this.per_translacion = per_translacion;
        this.distancia_media = distancia_media;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(long masa) {
        this.masa = masa;
    }

    public int getDiametro_medio() {
        return diametro_medio;
    }

    public void setDiametro_medio(int diametro_medio) {
        this.diametro_medio = diametro_medio;
    }

    public int getPer_rotacion() {
        return per_rotacion;
    }

    public void setPer_rotacion(int per_rotacion) {
        this.per_rotacion = per_rotacion;
    }

    public int getPer_translacion() {
        return per_translacion;
    }

    public void setPer_translacion(int per_translacion) {
        this.per_translacion = per_translacion;
    }

    public int getDistancia_media() {
        return distancia_media;
    }

    public void setDistancia_media(int distancia_media) {
        this.distancia_media = distancia_media;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Astro astro)) return false;
        return masa == astro.masa && distancia_media == astro.distancia_media && Objects.equals(nombre, astro.nombre);
    }

    @Override
    public String toString() {
        return "Astro{" +
                "diametro_medio=" + getDiametro_medio() +
                ", masa=" + getMasa() +
                ", nombre='" + getNombre() + '\'' +
                '}';
    }
}
