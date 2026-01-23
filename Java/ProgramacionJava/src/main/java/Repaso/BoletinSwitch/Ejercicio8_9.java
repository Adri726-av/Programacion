package Repaso.BoletinSwitch;

import java.util.Scanner;

public class Ejercicio8_9 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String operacion = "";
        while (operacion != "@") {
            System.out.println("========================================");
            System.out.println("            CALCULADORA                 ");
            System.out.println("========================================");
            System.out.println("Introduzca + si desea sumar");
            System.out.println("Introduzca - si desea restar");
            System.out.println("Introduzca * si desea multiplicar");
            System.out.println("Introduzca / si desea dividir");
            System.out.println("Introduzca @ si desea salir del menú");
            System.out.println("========================================");
            System.out.println("Introduce el simbolo de la operacion: ");
            operacion = scanner.nextLine();
            System.out.println("Introduzca un numero: ");
            int num1 = scanner.nextInt();
            System.out.println("Introduzca otro numero: ");
            int num2 = scanner.nextInt();
            switch (operacion) {
                case "+":
                    int resultado = num1 + num2;
                    System.out.println("La suma entre " + num1 + " y " + num2 + " es " + resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    System.out.println("La resta entre " + num1 + " y " + num2 + " es " + resultado);
                    break;
                case "*":
                    resultado = num1 * num2;
                    System.out.println("La multiplicación entre " + num1 + " y " + num2 + " es " + resultado);
                    break;
                case "/":
                    resultado = num1 / num2;
                    System.out.println("La división entre " + num1 + " y " + num2 + " es " + resultado);
                    break;
                case "@":
                    System.out.println("Saliendo del menu...");
                    break;
                default:
                    System.out.println("Simbolo incorrecto");
            }
        }
    }
}
