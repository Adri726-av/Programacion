package JavaOrientadoObjetos.BoletinAbstracto.FactoriaCoches.Models;

import java.util.Objects;

public abstract class Robot {
    private int idIncr;
    private static int contador;
    private String modelo;
    private Estado estado;
    private String combustible;
    private String descripcion;
    private double bateria;

    public Robot(String modelo, Estado estado, String combustible, String descripcion, double bateria) {
        contador = contador+1;
        this.idIncr = contador;
        this.modelo = modelo;
        this.estado = estado;
        this.combustible = combustible;
        this.descripcion = descripcion;
        this.bateria = bateria;
    }

    public int getIdIncr() {
        return idIncr;
    }

    public void setIdIncr(int idIncr) {
        this.idIncr = idIncr;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    boolean esSuficiente() {
        boolean suficiente = false;
        if (bateria > 10) {
            suficiente = true;
        }
        return suficiente;
    }

    abstract void ejecutarTarea();

    abstract void recargar(Estado estado);

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Robot robot)) return false;
        return idIncr == robot.idIncr;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idIncr);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "estado=" + getEstado() +
                ", bateria=" + getBateria() +
                ", idIncr=" + getIdIncr() +
                ", Nombre=" + this.getClass().getSimpleName() + "}";
    }
}
