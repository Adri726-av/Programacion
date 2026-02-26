package JavaOrientadoObjetos.BoletinInterfaces.Boletin3;

public class GestionaPersonas {
    static void main(String[] args) {
        PersonaFactoriza[] persona = new PersonaFactoriza[10];
        Estudiante es = new Estudiante("Estudiante");
        EstudianteEmpleado esem = new EstudianteEmpleado("Estudiante y Empleado");
        Artista a = new Artista("Artista");
        Cliente c = new Cliente("Cliente");
        Empleado empl = new Empleado("Empleado");

        persona[1] = es;
        persona[2] = esem;
        persona[3] = a;
        persona[4] = c;
        persona[5] = empl;

        for (int i = 0; i < persona.length; i++)
        {
            if (persona[i] != null)
            {
                persona[i].ejecutarTarea();
            }
        }
    }
}
