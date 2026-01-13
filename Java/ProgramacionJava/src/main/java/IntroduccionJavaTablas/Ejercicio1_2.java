package IntroduccionJavaTablas;

public class Ejercicio1_2 {
    static void main(String[] args) {
        String[] diaSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (int i = 0; i < 7; i++) {
            System.out.println(diaSemana[i]);
            boolean Lunes = diaSemana[i].equals("Lunes");
            boolean Martes = diaSemana[i].equals("Martes");
            boolean Miercoles = diaSemana[i].equals("Miércoles");
            boolean Jueves = diaSemana[i].equals("Jueves");
            boolean Viernes = diaSemana[i].equals("Viernes");
            if (Lunes || Martes || Miercoles || Jueves || Viernes) {
                System.out.println("Es laborable");
            }
            else {
                System.out.println("Es festivo");
            }
        }
    }
}
