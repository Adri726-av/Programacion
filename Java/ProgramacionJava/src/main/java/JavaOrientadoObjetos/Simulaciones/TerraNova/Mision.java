package JavaOrientadoObjetos.Simulaciones.TerraNova;

import java.time.LocalDate;

public abstract class Mision {
    private String id;
    private String nombreClave;
    private LocalDate fechaLanzamiento;
    private Nave naveAsig;
    private Estado estado;

    public Mision(String id, String nombreClave, LocalDate fechaLanzamiento, Nave naveAsig, Estado estado) {
        this.id = id;
        this.nombreClave = nombreClave;
        this.fechaLanzamiento = fechaLanzamiento;
        this.naveAsig = naveAsig;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Nave getNaveAsig() {
        return naveAsig;
    }

    public void setNaveAsig(Nave naveAsig) {
        this.naveAsig = naveAsig;
    }

    protected abstract boolean misionDeRiesgo();


}
