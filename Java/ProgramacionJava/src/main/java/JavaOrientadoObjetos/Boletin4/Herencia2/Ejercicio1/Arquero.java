package JavaOrientadoObjetos.Boletin4.Herencia2.Ejercicio1;

public class Arquero extends Personaje {

    public Arquero(String nombre, int nivel, int hp, String arma) {
        super(nombre, nivel, hp, arma);
    }

    public String getArma() {
        return super.getArma();
    }

    public boolean esAtacado(Personaje atacante) {
        boolean atacado = false;
        if (atacante.getClass() == Caballero.class) {
            atacado = false;
        }
        else if (atacante.getClass() == Mago.class) {
            atacado = true;
        }
        return false;
    }

    public boolean esAtacado(Personaje atacante, int distancia) {
        boolean atacado = false;
        if (atacante.getClass() == Caballero.class && distancia < 50) {
            atacado = true;
        }
        else if (atacante.getClass() == Mago.class) {
            atacado = true;
        }
        return false;
    }

}
