package JavaOrientadoObjetos.Probando.Anime;

public class Goku extends PersonajeAnime{
    private boolean estaVivo;

    public Goku(String nombre) {
        super(nombre);
    }

    public void volar() {
        System.out.println("Esta volando");
    }

    public void obtenerEnergiaVital() {
        System.out.println("Obteniendo energia vital...");
    }

    public void teletransportarse() {
        System.out.println("Esta teletransportandonse");
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
}
