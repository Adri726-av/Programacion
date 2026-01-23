package Repaso.RepasoNavidad;
import java.util.Scanner;
import java.util.Random;

public class RepasoNavidad {
    static void main(String[] args) {
        int hpHero = 100;
        int mpHero = 20;
        int hpMonster = 80;
        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("Dime el nombre de tu héroe");
        String nombreHeroe = scanner.nextLine();
        while (hpMonster > 0 && hpHero > 0) {
            System.out.println("Héroe: " + hpHero + "HP " + mpHero + "MP");
            System.out.println("Monstruo: " + hpMonster + "HP");
            System.out.println("Acciones");
            System.out.println("1. Ataque Básico");
            System.out.println("2. Ataque Especial");
            System.out.println("3. Curar");
            System.out.println("Que ataque quieres utilizar: ");
            int ataque = scanner.nextInt();
            if (ataque == 1) {
                System.out.println("El héroe ha usado ataque básico");
                int dañoBasico = aleatorio.nextInt(7, 12);
                System.out.println("El héroe ha hecho " + dañoBasico + " de daño");
                hpMonster = hpMonster - dañoBasico;
            } else if (ataque == 2) {
                if (mpHero >= 5) {
                    System.out.println("El héroe ha usado ataque especial");
                    int dañoEspecial = aleatorio.nextInt(15, 25);
                    System.out.println("El héroe ha hecho " + dañoEspecial + " de daño");
                    hpMonster = hpMonster - dañoEspecial;
                    System.out.println("El héroe ha consumido 5 de energía");
                    mpHero = mpHero - 5;
                } else {
                    System.out.println("No te queda energía para realizar un ataque especial");
                }
            } else if (ataque == 3) {
                if (mpHero >= 8) {
                    System.out.println("El heroe ha usado curación");
                    mpHero = mpHero - 8;
                    hpHero = hpHero + 20;
                } else {
                    System.out.println("No tienes suficiente energia para curarte");
                }
            }
            if (hpMonster > 0) {
                int dañoMonster = aleatorio.nextInt(5, 15);
                hpHero = hpHero - dañoMonster;
                System.out.println("El monstruo ha realizado un contrataque" + dañoMonster + " HP");
            }
        }
        if (hpHero > 0) {
            System.out.println("Has ganado");
        }
        else {
            System.out.println("Has perdido");
        }
        }
    }