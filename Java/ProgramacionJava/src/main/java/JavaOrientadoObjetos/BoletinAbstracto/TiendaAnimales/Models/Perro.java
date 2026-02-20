package JavaOrientadoObjetos.BoletinAbstracto.TiendaAnimales.Models;

import java.time.LocalDate;

public class Perro extends Mascota{
    private String raza;
    private int pulgas;

    public Perro(String nombre, int edad, String estado, LocalDate fechaNacimiento, String raza, int pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }


    @Override
    public boolean habla() {
        return false;
    }

    @Override
    public void muestra() {

    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + getNombre() + '\'' +
                '}';
    }
}
