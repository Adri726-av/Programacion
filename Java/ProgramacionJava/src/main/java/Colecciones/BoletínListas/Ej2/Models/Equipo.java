package Colecciones.BoletínListas.Ej2.Models;

import Colecciones.BoletínListas.Ej2.Exceptions.DeportivosException;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    List<Alumno> alumnos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<Alumno>();
    }

    public void anadirAlumno(Alumno a) throws DeportivosException {
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < alumnos.size()){
            if (alumnos.get(i).getDni().equalsIgnoreCase(a.getDni())){
                encontrado = true;
            }
            i++;
        }
        if (!encontrado){
            alumnos.add(a);
        }
        else {
            throw new DeportivosException("El alumno ya existe en el equipo");
        }
    }

    public void borrarAlumno(Alumno a) throws DeportivosException{
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < alumnos.size()){
            if (alumnos.get(i).getDni().equalsIgnoreCase(a.getDni())){
                encontrado = true;
            }
            i++;
        }
        if (encontrado){
            alumnos.remove(a);
        }
        else{
            throw new DeportivosException("El alumno no existe en el equipo");
        }
    }

    public Alumno perteneceEquipo(Alumno a){
        boolean encontrado = false;
        Alumno alumno = null;
        int i = 0;
        while (!encontrado && i < alumnos.size()){
            if (alumnos.get(i).getDni().equalsIgnoreCase(a.getDni())){
                alumno = a;
                encontrado = true;
            }
            i++;
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
}
