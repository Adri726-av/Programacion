package JavaOrientadoObjetos.Simulaciones.Simulacion3;

import java.util.Arrays;

public class Departamento {
    private String nombre;
    private Empleado[] empleados;
    private int numEmpleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        empleados = new Empleado[100];
        numEmpleados = 0;
    }

    public boolean addEmpleado(Empleado e) {
        boolean anadido = false;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] == e) {
                anadido = false;
            }
        }
        if (numEmpleados < empleados.length) {
            empleados[numEmpleados] = e;
            numEmpleados++;
            anadido = true;
        }
        return anadido;
    }

    public boolean addJefe(JefeDepartamento jefe) {
        boolean booleano = false;
        if (!(jefe instanceof JefeDepartamento)) {
            System.out.println("No has introducido un jefe de departamento");
            booleano = false;
        }
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] instanceof JefeDepartamento) {
                System.out.println("Ya existe un jefe en este departamento");
            } else {
                empleados[numEmpleados] = jefe;
                numEmpleados++;
                booleano = true;
            }
        }
        return booleano;
    }

    public int obtenerSueldo() {
        int suma = 0;
        for (int i = 0; i < empleados.length; i++) {
            suma = suma + empleados[i].getSueldo();
        }
        return suma;
    }

    // Este metodo es para el toString
    private void ordenarPorNombre() {

        for (int i = 0; i < numEmpleados - 1; i++) {
            for (int j = i + 1; j < numEmpleados; j++) {

                if (empleados[i].getNombre()
                        .compareTo(empleados[j].getNombre()) > 0) {

                    Empleado aux = empleados[i];
                    empleados[i] = empleados[j];
                    empleados[j] = aux;
                }
            }
        }
    }

    @Override
    public String toString() {
        ordenarPorNombre();

        String texto = "Departamento: " + nombre + "\n";

        for (int i = 0; i < numEmpleados; i++) {
            texto = texto + empleados[i] + "\n";
        }

        return texto;
    }

    // Metodo para el toStringSueldo
    private void ordenarPorSueldo() {

        for (int i = 0; i < numEmpleados - 1; i++) {
            for (int j = i + 1; j < numEmpleados; j++) {

                if (empleados[i].getSueldo() < empleados[j].getSueldo()) {

                    Empleado aux = empleados[i];
                    empleados[i] = empleados[j];
                    empleados[j] = aux;
                }
            }
        }
    }

    public String toStringSueldo() {

        ordenarPorSueldo();

        return toString();
    }
}
