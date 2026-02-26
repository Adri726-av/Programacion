package JavaOrientadoObjetos.BoletinInterfaces.Boletin3;

public class Estudiante extends PersonaFactoriza{
    public Estudiante(String nombre) {
        super(nombre);
    }

    @Override
    public void ejecutarTarea() {
        System.out.println(nombre + " está estudiando");
    }
}
