package Repaso.BoletinSwitch;

import java.util.Scanner;

public class Ejercicio6_7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Habitación Azul");
        System.out.println("2. Habitación Roja");
        System.out.println("3. Habitación Verde");
        System.out.println("4. Habitación Rosa");
        System.out.println("5. Habitación Gris");

        System.out.println("Introduce un numero de habitacion: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Has elegido la habitación azul");
                System.out.println("Camas: 2");
                System.out.println("Planta: Primera");
                break;
            case 2:
                System.out.println("Has elegido la habitacion roja");
                System.out.println("Camas: 1");
                System.out.println("Planta: Primera");
                break;
            case 3:
                System.out.println("Has elegido la habitacion verde");
                System.out.println("Camas: 3");
                System.out.println("Planta: Segunda");
                break;
            case 4:
                System.out.println("Has elegido la habitacion rosa");
                System.out.println("Camas: 2");
                System.out.println("Planta: Segunda");
                break;
            case 5:
                System.out.println("Has elegido la habitacion gris");
                System.out.println("Camas: 1");
                System.out.println("Planta: Tercera");
                break;
            case 0:
                System.out.println("Finalizando programa...");
                break;
            default:
                System.out.println("Numero de habitacion incorrecta");
        }
    }
}
