package Retos;

import java.util.Scanner;

public class Arbol_De_Navidad {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nivel del arbol");
        int n = scanner.nextInt();
        String espacio = " ";

        for (int i = 0; i > n; i ++) {
            System.out.println();
        }
    }
}
