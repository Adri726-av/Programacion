package JavaOrientadoObjetos.Boletin4.Herencia2.Ejercicio2;

public class Planeta extends Astro{
    private Satelite [] satelites;
    private int numSatelite;

    public Planeta(String nombre, long masa, int diametro_medio, int per_rotacion, int per_translacion, int distancia_media) {
        super(nombre, masa, diametro_medio, per_rotacion, per_translacion, distancia_media);
        satelites = new Satelite[10];
        this.numSatelite = 0;
    }

    public Satelite[] getSatelites() {
        return satelites;
    }

    public void setSatelites(Satelite[] satelites) {
        this.satelites = satelites;
    }

    public void agregaSatelite(Satelite nombre) {
        this.satelites[numSatelite] = nombre;
        numSatelite ++;
    }



    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + getNombre() + '\'' +
                ", masa=" + getMasa() +
                ", diametro_medio=" + getDiametro_medio() +
                '}';
    }
}
