package JavaOrientadoObjetos.Boletin4.Herencia1;

public class Vehiculo {

    protected String dueno;
    protected int numPuertas;
    protected int numRuedas;

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

    public boolean tieneLicenciaParaCircular(String ciudad) {
        return false;
    }
}

