package JavaOrientadoObjetos.BoletinInterfaces.Boletin3;

public class Artista extends PersonaFactoriza{
    public Artista(String nombre) {
        super(nombre);
    }

    @Override
    public void ejecutarTarea() {
        System.out.println(nombre + " está pintando");
    }

    public void pintar() {
        System.out.println(nombre + " está pintando.");
    }
}
