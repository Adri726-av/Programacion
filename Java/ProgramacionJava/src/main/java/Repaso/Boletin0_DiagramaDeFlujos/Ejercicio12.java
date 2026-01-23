package Repaso.Boletin0_DiagramaDeFlujos;

import java.util.Scanner;

public class Ejercicio12 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una contrasena: ");
        int contrasena = scanner.nextInt();

        while (contrasena != 1234) {
            System.out.println("Introduce de nuevo la contrasena: ");
            contrasena = scanner.nextInt();
        }
        System.out.println("Contrasena valida");
    }
}
