package JavaOrientadoObjetos.Simulaciones.Simulacion3;

public class Gestiona {
    static void main(String[] args) {
        EmpleadoBase e = new EmpleadoBase("432312D", "Adrian", Puesto.ADMINISTRATIVO);
        int sueldo = e.calcularSueldo();
        System.out.println(sueldo);
        Departamento d = new Departamento("Informatica");
        d.addEmpleado(e);
        System.out.println(d.toString());
        System.out.println(d.toStringSueldo());
    }
}
