package JavaOrientadoObjetos.Boletin4.Herencia2.Ejercicio1;

public class Villano extends Personaje {

    public Villano(String nombre, int nivel, int hp, String arma) {
        super(nombre, nivel, hp, arma);
    }

    public String getArma () {
        return super.getArma();
    }

    public boolean esAtacado(Personaje atacante) {
        return true;
    }

    public boolean esAtacado(Personaje atacante, int distancia) {
        return true;
    }

}
