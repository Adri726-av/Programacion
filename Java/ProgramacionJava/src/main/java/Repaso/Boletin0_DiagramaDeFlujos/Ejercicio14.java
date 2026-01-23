package Repaso.Boletin0_DiagramaDeFlujos;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Ejercicio14 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Random generador = new Random();
        int num1 = generador.nextInt(5);
        int num2 = generador.nextInt(5);
        int resultado = num1 + num2;
        System.out.println("Introduce la suma: ");
        int respuesta = scanner.nextInt();
        do {
            System.out.println("Introduce de nuevo la suma");
            respuesta = scanner.nextInt();
        }
        while (respuesta != resultado);
        System.out.println("La respuesta es correcta");
    }
}
