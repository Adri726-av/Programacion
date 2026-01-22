import java.util.Scanner;

public class JavaRacingTeam {
    public int ejecutarMenu(Scanner scanner) {
        System.out.println("1. Cargar/Reiniciar Datos");
        System.out.println("2. Formatear Nombres");
        System.out.println("3. Ver Estadísticas");
        System.out.println("4. Buscar Piloto");
        System.out.println("5. Generar IDs de Carrera");
        System.out.println("6. Salir");
        System.out.println("Elige una opcion: ");
        int opcion = scanner.nextInt();
        return opcion;
    }

    public int inicializarEscuderia(String [] nombresP, double [] tiemposP, Scanner scanner) {
        System.out.println("Cuantos pilotos desea registrar: ");
        int numPilotos = scanner.nextInt();
        for (int i = 0; i < numPilotos; i++) {
            System.out.println("Dime el nombre: ");
            String nombre = scanner.next().toUpperCase();
            System.out.println("Dime su mejor tiempo: ");
            double tiempo = scanner.nextDouble();
            while (tiempo <= 0) {
                System.out.println("Ese tiempo es imposible...");
                System.out.println("Dime su mejor tiempo real: ");
                tiempo = scanner.nextDouble();
            }
            nombresP[i] = nombre;
            tiemposP[i] = tiempo;
        }
        return numPilotos;
    }

    public void formatearPilotos(String [] nombresP, int numPilotos) {
        for (int i = 0; i < numPilotos; i++) {
            nombresP[i] = nombresP[i].trim();
            if (nombresP[i].length()>=10){
                nombresP[i] = nombresP[i].substring(0,10);
            }
            System.out.println(nombresP[i]);
        }
    }

    public void obtenerEstadisticas(String [] nombresP, double [] tiemposP, int numPilotos) {
        double tiempo = 0;
        double min = 9999;
        int pos = 0;
        for (int i = 0; i < numPilotos; i++) {
            tiempo = tiempo + tiemposP[i];
            if (tiemposP[i] < min) {
                min = tiemposP[i];
                pos = i;
            }
        }
        double media = tiempo / numPilotos;
        System.out.println("El tiempo medio de la sesion es de " + media + "segundos");
        System.out.println("El mejor tiempo de la sesion es de " + tiemposP[pos]);
        System.out.println("El piloto que ostenta ese mejor tiempo es " + nombresP[pos]);
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JavaRacingTeam r = new JavaRacingTeam();
        String [] nombres = new String[20];
        double [] tiempos = new double[20];
        int option = r.ejecutarMenu(scanner);
        int numPilotos =0;
        while (option != 6) {
            if (option == 1) {
                numPilotos = r.inicializarEscuderia(nombres, tiempos, scanner);
            }
            else if (option == 2) {
                r.formatearPilotos(nombres, numPilotos);
            }
            else if (option == 3) {
                r.obtenerEstadisticas(nombres, tiempos, numPilotos);
            }
            else if (option == 4) {

            }
            else if (option == 5) {

            }
            option = r.ejecutarMenu(scanner);
        }
        System.out.println("Finalizando programa...");
    }
}
