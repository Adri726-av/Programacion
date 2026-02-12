package JavaOrientadoObjetos.Boletin4.Herencia2.Ejercicio2;

public class Satelite extends Astro{

    public Satelite(String nombre, long masa, int diametro_medio, int per_rotacion, int per_translacion, int distancia_media) {
        super(nombre, masa, diametro_medio, per_rotacion, per_translacion, distancia_media);
    }

    @Override
    public String toString() {
        return "Satelite{" +
                "nombre='" + getNombre() + '\'' +
                ", masa=" + getMasa() +
                ", diametro_medio=" + getDiametro_medio() +
                '}';
    }
}
