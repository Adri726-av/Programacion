package JavaOrientadoObjetos.Probando.Anime;

public class Luffy extends PersonajeAnime{
    private String fruta;
    private boolean estaEnAgua;

    public Luffy(String nombre) {
        super(nombre);
    }

    public void reir() {
        System.out.println("Esta riendo");
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public boolean isEstaEnAgua() {
        return estaEnAgua;
    }

    public void setEstaEnAgua(boolean estaEnAgua) {
        this.estaEnAgua = estaEnAgua;
    }

    @Override
    public String toString() {
        return "Luffy{" +
                "fruta='" + getFruta() + '\'' +
                ", estaEnAgua=" + isEstaEnAgua() +
                ", nombre='" + getNombre() + '\'' +
                ", serie=" + getSerie() +
                ", transformacion=" + getTransformacion() +
                ", edad=" + getEdad() +
                '}';
    }
}
