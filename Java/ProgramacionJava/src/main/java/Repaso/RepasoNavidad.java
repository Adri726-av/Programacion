package Repaso;
import java.util.Scanner;
import java.util.Random;

public class RepasoNavidad {
    static void main(String[] args) {
        int hpHero = 100;
        int mpHero = 20;
        int hpMonster = 80;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el nombre de tu héroe");
        String nombreHeroe = scanner.nextLine();
        System.out.println("Héroe: " + hpHero + "HP " + mpHero + "MP");
        System.out.println("Monstruo: " + hpMonster + "HP");
        System.out.println("Acciones");
        System.out.println("1. Ataque Básico");
        System.out.println("2. Ataque Especial");
        System.out.println("3. Curar");
        System.out.println("Que ataque quieres utilizar: ");
        String ataque = scanner.nextLine();
        switch (ataque) {
            case "1":
                System.out.println("El héroe ha usado ataque básico");
                Random aleatorio = new Random();
                int dañoBasico = aleatorio.nextInt(7,12);
                System.out.println("El héroe ha hecho " + dañoBasico + " de daño");
            case "2":
                if (mpHero >= 5) {
                    System.out.println("El héroe ha usado ataque especial");
                    Random aleatorio = new Random();
                    int dañoEspecial = aleatorio.nextInt(15,25);
                    System.out.println("El héroe ha hecho " + dañoEspecial + " de daño");
                    System.out.println("El héroe ha consumido 5 de energía");
                }
        }
    }
}
