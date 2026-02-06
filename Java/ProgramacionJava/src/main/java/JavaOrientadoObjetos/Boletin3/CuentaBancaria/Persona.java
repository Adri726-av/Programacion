package JavaOrientadoObjetos.Boletin3.CuentaBancaria;

import java.util.Objects;

public class Persona {
    private String dni;
    private String nombre;
    private int fechaNac;
    private String apellido;

    public Persona(String apellido, int fechaNac, String nombre, String dni) {
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
