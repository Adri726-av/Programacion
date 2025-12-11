package unidad2;

import java.util.Scanner;

public class RepasoSwitch {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scanner.nextInt();
        switch (num)
        {
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            default:
                System.out.println("OTRO");
                break;
        }

    }
}
