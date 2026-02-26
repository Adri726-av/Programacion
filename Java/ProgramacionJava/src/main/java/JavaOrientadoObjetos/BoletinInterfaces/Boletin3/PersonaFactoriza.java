package JavaOrientadoObjetos.BoletinInterfaces.Boletin3;

public abstract class PersonaFactoriza {
    String nombre;
    
    public void identificarse() {
        System.out.println("Soy una persona y me llamo " + nombre);
    }

    public PersonaFactoriza(String nombre) {
        this.nombre = nombre;
    }

    public abstract void ejecutarTarea();

}
