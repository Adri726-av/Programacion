package MasEjerciciosFor;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scanner.nextInt();
        String cadena = "";
        String espacio = " ";
        for (int i = 0; i < num; i++) {
            cadena = cadena + "*";
            System.out.println(cadena);
        }
    }
}
