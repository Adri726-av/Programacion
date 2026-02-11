package JavaOrientadoObjetos.Boletin4.Herencia1;

public class CocheElectrico extends Automovil {

    private String tipoBateria;

    public CocheElectrico(String dueno, int numPuertas, int numRuedas,
                          String calificacionEcologica, String tipoBateria) {
        super(dueno, numPuertas, numRuedas, calificacionEcologica);
        this.tipoBateria = tipoBateria;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    @Override
    public void imprimeResumen() {
        super.imprimeResumen();
        System.out.println("Tipo de batería: " + tipoBateria);
    }
}

