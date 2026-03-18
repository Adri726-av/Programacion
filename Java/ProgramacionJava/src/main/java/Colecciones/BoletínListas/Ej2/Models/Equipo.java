package Colecciones.BoletínListas.Ej2.Models;

import Colecciones.BoletínListas.Ej2.Exceptions.DeportivosException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {
    private String nombre;
    List<Alumno> alumnos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<Alumno>();
    }

    public void anadirAlumno(Alumno a) throws DeportivosException {
        if (!this.alumnos.contains(a)){
            alumnos.add(a);
        }
        else {
            throw new DeportivosException("El alumno ya existe en el equipo");
        }
    }

    public void borrarAlumno(Alumno a) throws DeportivosException{
        if (this.alumnos.contains(a)){
            alumnos.remove(a);
        }
        else{
            throw new DeportivosException("El alumno no existe en el equipo");
        }
    }

    public Alumno perteneceEquipo(Alumno a){
        Alumno alumno = null;
        if(this.alumnos.contains(a)){
            int pos = this.alumnos.indexOf(a);
            alumno = this.alumnos.get(pos);
        }
        return alumno;
    }

    public void mostrarEquipo(){
        for (Alumno alumno : alumnos){
            System.out.println(alumno);
        }
    }

    public Equipo unirEquipo(Equipo e){
        Equipo e1 = new Equipo(this.nombre);
        e1.alumnos = this.alumnos;
        e1.alumnos.addAll(e.alumnos);
        return e1;
    }

    public Equipo interseccionEquipo(Equipo e){
        Equipo e1 = new Equipo(this.nombre);
        e1.alumnos = this.alumnos;
        e1.alumnos.retainAll(e.alumnos);
        return e1;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Equipo equipo)) return false;
        return Objects.equals(nombre, equipo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
