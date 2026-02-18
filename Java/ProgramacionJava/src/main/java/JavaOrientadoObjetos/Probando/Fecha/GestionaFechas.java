package JavaOrientadoObjetos.Probando.Fecha;

import java.time.LocalDate;
import java.time.Month;

public class GestionaFechas {
    LocalDate fechaExamen = LocalDate.of(2024, 5, 15);
    // Extraer partes de la fecha
    int anio = fechaExamen.getYear();
    Month mes = fechaExamen.getMonth(); // Devuelve un objeto Enum (MAY)
    int numMes = fechaExamen.getMonthValue();
    int diaMes = fechaExamen.getDayOfMonth();
    // Día de la semana (Lunes, Martes...)
    String diaSemana = fechaExamen.getDayOfWeek().toString();

}
