package JavaOrientadoObjetos.Simulaciones.Simulacion3;

public class JefeDepartamento extends Empleado implements IActualizableSueldo{
    private int antiguedad;

    public JefeDepartamento(String dni, String nombre, int antiguedad) {
        super(dni, nombre);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int calcularSueldo() {
        this.sueldo = 1300;
        return sueldo;
    }

    @Override
    public void actualizarSueldo(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 20) {
            sueldo = sueldo + (int)(sueldo * porcentaje / 100);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "antiguedad=" + antiguedad +
                '}';
    }
}
