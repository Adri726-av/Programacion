package JavaOrientadoObjetos.BoletinInterfaces.Boletin3;

public class Empleado extends PersonaFactoriza{
    public Empleado(String nombre) {
        super(nombre);
    }

    @Override
    public void ejecutarTarea() {
        System.out.println(nombre + " está trabajando");
    }
}
