package JavaOrientadoObjetos.Boletin4.Herencia1;

import java.sql.SQLOutput;

public class Camion extends Vehiculo {

    private int tonelajeKilos;
    private int numPasajeros;
    private int numEjes;
    private int mma;

    public Camion(String dueno, int numPuertas, int numRuedas, int tonelajeKilos, int numPasajeros, int mma, int numEjes) {
        super(dueno, numPuertas, numRuedas);
        this.tonelajeKilos = tonelajeKilos;
        this.numPasajeros = numPasajeros;
        this.mma = mma;
        this.numEjes = numEjes;
    }

    public int getTonelajeKilos() {
        return tonelajeKilos;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public int getNumEjes() {
        return numEjes;
    }

    @Override
    public void imprimeResumen() {
        super.imprimeResumen();
        System.out.println("Tonelaje (kg): " + tonelajeKilos);
        System.out.println("Pasajeros: " + numPasajeros);
        System.out.println("Ejes: " + numEjes);
    }

    public void getLicencias() {

        if (mma > 3500) {
            System.out.println("C");
        }

        if (mma >= 3500 && mma <= 7500) {
            System.out.println("C1");
        }

        if (mma <= 3500) {
            System.out.println("C1+E");
        }

    }

}
