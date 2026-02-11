package JavaOrientadoObjetos.Boletin4.Herencia2;

public class Arquero extends Personaje{

    public Arquero(String nombre, int nivel, int hp, String arma) {
        super(nombre, nivel, hp, arma);
    }

    public String getArma() {
        return super.getArma();
    }

    public boolean esAtacado(Personaje atacante) {
        if (atacante.getClass() == Caballero.class) {
            return false;
        }
        else if (atacante.getClass() == Mago.class) {
            return true;
        }
        return false;
    }

    public boolean esAtacado(Personaje atacante, int distancia) {
        if (atacante.getClass() == Caballero.class && distancia < 50) {
            return true;
        }
        else if (atacante.getClass() == Mago.class) {
            return true;
        }
        return false;
    }

}
