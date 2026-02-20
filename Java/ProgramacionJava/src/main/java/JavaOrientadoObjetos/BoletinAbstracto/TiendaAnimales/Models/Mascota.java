package JavaOrientadoObjetos.BoletinAbstracto.TiendaAnimales.Models;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mascota {
    private String nombre;
    private int edad;
    private String estado;
    private LocalDate fechaNacimiento;

    public Mascota(String nombre, int edad, String estado, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract boolean habla();

    public abstract void muestra();

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", estado='" + getEstado() + '\'' +
                ", fechaNacimiento=" + getFechaNacimiento() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Mascota mascota)) return false;
        return edad == mascota.edad && Objects.equals(nombre, mascota.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}
