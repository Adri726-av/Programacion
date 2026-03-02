package JavaOrientadoObjetos.Simulaciones.Simulacion3;

public class EmpleadoBase extends Empleado implements IActualizableSueldo{
    private Puesto puesto;

    public EmpleadoBase(String dni, String nombre, Puesto puesto) {
        super(dni, nombre);
        this.puesto = puesto;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public int calcularSueldo(){
        if (this.puesto == Puesto.ADMINISTRATIVO){
            this.sueldo = 1150;
        }
        else if (this.puesto == Puesto.OPERARIO){
            this.sueldo = 1100;
        }
        else {
            this.sueldo = 1350;
        }
        return this.sueldo;
    }

    @Override
    public void actualizarSueldo(double porcentaje) {
        sueldo = sueldo + (int)(sueldo * 0.025);
    }

    @Override
    public String toString() {
        return super.toString() +
                "puesto=" + puesto +
                '}';
    }
}
