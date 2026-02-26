package JavaOrientadoObjetos.BoletinInterfaces.Boletin3;

public class EstudianteEmpleado extends Estudiante{
    public EstudianteEmpleado(String nombre) {
        super(nombre);
    }

    public void trabajar() {
        System.out.println(nombre + " está estudiando y trabajando.");
    }


}
