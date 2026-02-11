package JavaOrientadoObjetos.Boletin4.Herencia1;

public class Automovil extends Vehiculo {

    private String calificacionEcologica;

    public Automovil(String dueno, int numPuertas, int numRuedas, String calificacionEcologica) {
        super(dueno, numPuertas, numRuedas);
        this.calificacionEcologica = calificacionEcologica;
    }

    public String getCalificacionEcologica() {
        return calificacionEcologica;
    }


    @Override
    public void imprimeResumen() {
        super.imprimeResumen();
        System.out.println("Calificación ecológica: " + calificacionEcologica);
    }
}
