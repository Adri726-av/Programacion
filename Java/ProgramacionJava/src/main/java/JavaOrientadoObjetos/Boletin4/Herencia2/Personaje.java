package JavaOrientadoObjetos.Boletin4.Herencia2;

public class Personaje {
    private String nombre;
    private int nivel;
    private int hp;
    private String arma;

    public Personaje(String nombre, int nivel, int hp, String arma) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.hp = hp;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public boolean esAtacado(Personaje Atacante) {
        return false;
    }

    public boolean esAtacado(Personaje atacante, int distancia) {
        return false;
    }

}
