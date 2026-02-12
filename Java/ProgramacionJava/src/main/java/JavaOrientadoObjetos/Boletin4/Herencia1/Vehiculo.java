package JavaOrientadoObjetos.Boletin4.Herencia1;

import java.util.Objects;

public class Vehiculo {

    private String dueno;
    private int numPuertas;
    private int numRuedas;

    public Vehiculo(String dueno, int numPuertas, int numRuedas) {
        this.dueno = dueno;
        this.numPuertas = numPuertas;
        this.numRuedas = numRuedas;
    }


    public String getDueno() {
        return dueno;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void imprimeResumen() {
        System.out.println("Dueño: " + dueno);
        System.out.println("Puertas: " + numPuertas);
        System.out.println("Ruedas: " + numRuedas);
    }



    @Override
    public String toString() {
        return "Vehiculo{" +
                "dueno='" + getDueno() + '\'' +
                ", numPuertas=" + getNumPuertas() +
                ", numRuedas=" + getNumRuedas() +
                '}';
    }
}

