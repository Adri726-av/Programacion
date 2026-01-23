package Repaso.Introducción;

import java.util.Scanner;

public class Ejercicio10 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un número:");
        int numero1 = scanner.nextInt();
        System.out.println("Dime un número: ");
        int numero2 = scanner.nextInt();

        float division = (float) numero1 / numero2;

        if (numero2 != 0) {
            System.out.println("El resultado de la division es: " + division);
        }
        else {
            System.out.println("El segundo número no puede ser 0");
        }

        System.out.println("Dime el nombre de tu ciudad");
        String ciudad = scanner.nextLine();
        System.out.println(ciudad);
    }
}
