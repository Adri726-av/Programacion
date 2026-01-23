package Simulacros.SimulacroExamen;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
    public void Menu() {
        System.out.println("1. Apostar");
        System.out.println("2. Mostrar historial");
        System.out.println("3. Retirarse");
    }
    public String apostar(Scanner sc, int contador) {
        Random aleatorio = new Random();
        String cadena = "";
        int dado1 = aleatorio.nextInt(6)+1;
        int dado2 = aleatorio.nextInt(6)+1;
        int suma = dado1 + dado2;
        System.out.println("Escribe el numero al que apuesta: ");
        int numeroApuesta = sc.nextInt();
        System.out.println("Escribe la cantidad que desea apostar: ");
        int apuesta = sc.nextInt();
        if (numeroApuesta == suma) {
            System.out.println("La suma de los dados fue: " + suma + ", ganando " + apuesta*2 + "€");
            cadena = "En la " + (contador+1) + "º jugada apostó al valor " + numeroApuesta + " y sumó " + suma + ", ganando " + apuesta*2 + "€";
        }
        else {
            System.out.println("La suma de los dados fue: " + suma + ", perdiendo " + apuesta);
            cadena = "En la " + (contador+1) + "º jugada apostó al valor " + numeroApuesta + " y sumó " + suma + ", perdiendo " + apuesta + "€";
        }
        return cadena;
    }

    public void mostrarHistorial(String[]historial, int numPartidas) {
        for (int i = 0; i < numPartidas; i++) {
            System.out.println(historial[i]);
        }
    }

    public void retirarse(String[]historial, int numPartidas) {
        for (int i = 0; i < numPartidas; i++) {
            String cadena = historial[i];
            String ganando = "ganando";
            String perdiendo = "perdiendo";

            Pattern patronGanando = Pattern.compile(ganando);
            Matcher matcherGanando = patronGanando.matcher(cadena);

            Pattern patronPerdiendo = Pattern.compile(perdiendo);
            Matcher matcherPerdiendo = patronPerdiendo.matcher(cadena);

            if (matcherGanando.find()) {
                String regex = "[0-9]+€";

                Pattern patron1 = Pattern.compile(regex);
                Matcher matcher1 = patron1.matcher(cadena);

                if (matcher1.find()) {
                    String ganado = matcher1.group();
                    System.out.println(ganado);
                }
            }

            if (matcherPerdiendo.find()) {
                String regex = "[0-9]+€";

                Pattern patron1 = Pattern.compile(regex);
                Matcher matcher1 = patron1.matcher(cadena);

                if (matcher1.find()) {
                    String perdido = matcher1.group();
                    System.out.println(perdido);
                }
            }
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio1 r = new Ejercicio1();
        r.Menu();
        System.out.println("Escoge una opcion: ");
        int opcion = sc.nextInt();
        int contadorPartidas = 0;
        String [] historial = new String[100];
        while (opcion != 4){
            switch (opcion) {
                case 1:
                    String cadena = r.apostar(sc, contadorPartidas);
                    historial[contadorPartidas]= cadena;
                    contadorPartidas++;
                    break;
                case 2:
                    r.mostrarHistorial(historial, contadorPartidas);
                    break;
                case 3:
                    r.retirarse(historial, contadorPartidas);
                    break;
                default:
                    System.out.println("Numero incorrecto");
            }
            r.Menu();
            opcion = sc.nextInt();
        }
    }
}
