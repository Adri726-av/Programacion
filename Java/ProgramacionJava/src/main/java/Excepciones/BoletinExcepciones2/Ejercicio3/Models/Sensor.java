package Excepciones.BoletinExcepciones2.Ejercicio3.Models;

public class Sensor {
    private int id;
    private static int contador;
    TipoParametro tipoParametro;
    private double max;
    private double min;
    Lectura[] historial;
}
