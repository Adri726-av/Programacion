package JavaOrientadoObjetos.Anime;

public class Naruto extends PersonajeAnime{
    private Elemento elemento;
    private Aldea aldea;

    public Naruto(String nombre) {
        super(nombre);
    }

    public void Entrenar() {
        System.out.println("Esta entrenando");
    }

    public void CrearClones() {
        System.out.println("Crea clones");
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Aldea getAldea() {
        return aldea;
    }

    public void setAldea(Aldea aldea) {
        this.aldea = aldea;
    }
}
