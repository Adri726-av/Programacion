package Colecciones.BoletínListas.Ej2.Controller;

import Colecciones.BoletínListas.Ej2.Exceptions.DeportivosException;
import Colecciones.BoletínListas.Ej2.Models.Alumno;
import Colecciones.BoletínListas.Ej2.Models.Equipo;

public class GestionaEquipos {
    static void main(String[] args) throws DeportivosException {
        Alumno a1 = new Alumno("Adrian", "48124726D");
        Alumno a2 = new Alumno("Leon", "21414423R");
        Alumno a3 = new Alumno("Juan", "3424234F");
        Alumno a4 = new Alumno("Antonio", "4324426S");
        Alumno a5 = new Alumno("Adrian", "48124726D");
        Alumno a6 = new Alumno("Leon", "21414423R");
        Equipo e1 = new Equipo("Heretics");
        Equipo e2 = new Equipo("Ikaos");
        e2.anadirAlumno(a3);
        e2.anadirAlumno(a4);
        e2.anadirAlumno(a5);
        e2.anadirAlumno(a6);
        e1.anadirAlumno(a1);
        e1.anadirAlumno(a2);
        Equipo e3 = e1.interseccionEquipo(e2);
        e3.mostrarEquipo();
    }
}
