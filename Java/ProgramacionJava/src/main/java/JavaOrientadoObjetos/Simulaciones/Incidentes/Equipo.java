package JavaOrientadoObjetos.Simulaciones.Incidentes;

import java.util.Objects;

public class Equipo {
    private String nombre;
    private String mac;
    private String sistemaOperativo;
    private int numIncidentes;

    public Equipo(String nombre, String mac, String sistemaOperativo, int numIncidentes) {
        this.nombre = nombre;
        this.mac = mac;
        this.sistemaOperativo = sistemaOperativo;
        this.numIncidentes = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Equipo equipo)) return false;
        return Objects.equals(mac, equipo.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mac);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "numIncidentes=" + numIncidentes +
                ", mac='" + getMac() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                '}';
    }
}
