package Matrices;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public void menu() {
        System.out.println("1. Identificar Amenazas");
        System.out.println("2. Calcular el escudo");
        System.out.println("3. Encontrar el refugio");
        System.out.println("4. Salir");
    }

    public void identificarAmenazas(int[][] mapaEstelar) {
        for (int i = 0; i < mapaEstelar.length; i++) {
            for (int j = 0; j < mapaEstelar.length; j++) {
                int coordenadas = mapaEstelar[i][j];
                if (coordenadas > 80) {
                    System.out.println("Las coordenadas de las posiciones +80 son [" + i + "][" + j + "].");
                }
            }
        }
    }

    public void calcularEscudo(int[][] mapa) {
        int sumaTotal = 0;

        for (int[] fila : mapa) {
            for (int energia : fila) {
                sumaTotal += energia;
            }
        }

        System.out.println("Energia Total del Cuadrante: " + sumaTotal);

        if (sumaTotal > 1000) {
            System.out.println("¡AVISO! Escudos al 100% inmediatamente.");
        }
    }

    static void main(String[] args) {
        Ejercicio3 ref = new Ejercicio3();
        Random aleatorio = new Random();
        int[][] galaxia = new int[5][5];

        for (int i = 0; i < galaxia.length; i++) {
            for (int j = 0; j < galaxia.length; j++) {
                galaxia[i][j] = aleatorio.nextInt(101);
            }
        }

        ref.menu();
        Scanner sc = new Scanner(System.in);
        int eleccion = sc.nextInt();

        while (eleccion != 4) {
            switch (eleccion) {
                case 1:
                    ref.identificarAmenazas(galaxia);
                    break;
                case 2:
                    ref.calcularEscudo(galaxia);
                    break;
                case 3:
                    ref.encontarRefugio(galaxia);
                    break;
            }

            ref.menu();
            eleccion = sc.nextInt();
        }

        System.out.println("Saliendo...");
    }
}
