package JavaOrientadoObjetos.Simulaciones.Incidentes;

import java.time.LocalDate;

public class Incidencia {
    private int id;
    private String nombre;
    private String descripcion;
    private String fechaRegistro;
    private String fechaCierre;
    private Estado estado;
    private Criticidad criticidad;
    private Equipo equipo;

    public Incidencia(int id, String nombre, String descripcion, Estado estado, Criticidad criticidad, Equipo equipo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.criticidad = criticidad;
        this.equipo = equipo;
        this.fechaRegistro = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Criticidad getCriticidad() {
        return criticidad;
    }

    public void setCriticidad(Criticidad criticidad) {
        this.criticidad = criticidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public boolean esUrgente() {
        boolean urgente = false;
        LocalDate hoy = LocalDate.now();
        if (criticidad == Criticidad.CRITICA){
            urgente = true;
        }
        else if (this.criticidad == Criticidad.GRAVE && this.estado == Estado.CERRADA && hoy.minusDays(7).isAfter(this.fechaRegistro)){
            urgente = true;
        }
        else if (this.criticidad == Criticidad.MEDIA && this.estado != Estado.CERRADA && hoy.minusDays(30).isAfter(this.fechaRegistro)){
            urgente = true;
        }
        return urgente;
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "nombre='" + getNombre() + '\'' +
                ", estado=" + getEstado() +
                ", criticidad=" + getCriticidad() +
                ", fechaRegistro='" + getFechaRegistro() + '\'' +
                ", equipo=" + getEquipo() +
                '}';
    }
}
