package JavaOrientadoObjetos.BoletinInterfaces.Boletin3;

public class Cliente extends PersonaFactoriza{
    public Cliente(String nombre) {
        super(nombre);
    }

    @Override
    public void ejecutarTarea() {
        System.out.println(nombre + " está comprando");
    }
}
