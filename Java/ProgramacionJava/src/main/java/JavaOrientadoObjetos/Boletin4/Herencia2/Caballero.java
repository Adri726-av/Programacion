package JavaOrientadoObjetos.Boletin4.Herencia2;

public class Caballero extends Personaje{

    public Caballero(String nombre, int nivel, int hp, String arma) {
        super(nombre, nivel, hp, arma);
    }

    public String getArma() {
        return super.getArma();
    }

    public boolean esAtacado(Personaje atacante) {
        if (atacante.getClass() == Arquero.class) {
            return true;
        }
        else if (atacante.getClass() == Mago.class) {
            return true;
        }
        return false;
    }

    public boolean esAtacado(Personaje atacante, int distancia) {
        if (atacante.getClass() == Arquero.class && distancia >100) {
            return true;
        }
        else if (atacante.getClass() == Mago.class) {
            return true;
        }
        return false;
    }

}
