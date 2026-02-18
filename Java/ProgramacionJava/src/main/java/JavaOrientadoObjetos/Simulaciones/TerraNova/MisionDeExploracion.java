package JavaOrientadoObjetos.Simulaciones.TerraNova;

import java.time.LocalDate;

public class MisionDeExploracion extends Mision{
    private String destino;
    private int tripulacion;

    public MisionDeExploracion(String id, String nombreClave, LocalDate fechaLanzamiento, Nave naveAsig, Estado estado, String destino, int tripulacion) {
        super(id, nombreClave, fechaLanzamiento, naveAsig, estado);
        this.destino = destino;
        this.tripulacion = tripulacion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }

    @Override
    protected boolean misionDeRiesgo() {
        boolean riesgo = false;
        if (destino.equals("Marte") || getFechaLanzamiento().minusDays(7).isBefore(LocalDate.now())) {
            riesgo = true;
        }
        return riesgo;
    }
}
