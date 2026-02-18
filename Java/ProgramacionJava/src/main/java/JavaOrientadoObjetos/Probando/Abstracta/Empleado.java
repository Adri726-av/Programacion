package JavaOrientadoObjetos.Probando.Abstracta;

public class Empleado extends Persona{
    @Override
    protected void comer() {
        System.out.println("Un empleado comiendo");
    }

    public Empleado(String dni) {
        super(dni);
    }
}
