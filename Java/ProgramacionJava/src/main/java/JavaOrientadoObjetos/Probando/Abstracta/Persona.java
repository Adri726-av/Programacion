package JavaOrientadoObjetos.Probando.Abstracta;

import java.util.Objects;

public abstract class Persona {
    private String dni;

    protected abstract void comer();

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Persona(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Persona persona)) return false;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + getDni() + '\'' +
                '}';
    }
}
