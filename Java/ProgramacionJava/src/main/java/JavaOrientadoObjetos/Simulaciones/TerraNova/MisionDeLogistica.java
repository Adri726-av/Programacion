package JavaOrientadoObjetos.Simulaciones.TerraNova;

import java.time.LocalDate;

public class MisionDeLogistica extends Mision{
    private double carga;

    public MisionDeLogistica(String id, String nombreClave, LocalDate fechaLanzamiento, Nave naveAsig, Estado estado, double carga) {
        super(id, nombreClave, fechaLanzamiento, naveAsig, estado);
        this.carga = carga;
    }

    @Override
    protected boolean misionDeRiesgo() {
        boolean riesgo = false;
        if (carga > 50 && (getFechaLanzamiento().getDayOfWeek().toString().equals("Sabado")|| getFechaLanzamiento().getDayOfWeek().toString().equals("Domingo"))) {
            riesgo = true;
        }
        return riesgo;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
}
