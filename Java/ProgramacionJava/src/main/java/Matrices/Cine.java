package unidad2.Matrices;
import java.util.Scanner;
public class Cine {
    void menu (){
        System.out.println("1. Registrar espectadores");
        System.out.println("2. Contar público");

    }
    static void main(String[] args) {
        boolean [][] sala = new boolean [3][4];
        Cine r = new Cine();
        int numTotal=r.registrarEspectadores(sala);

    }
    int registrarEspectadores(boolean [][] sala){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la fila del asiento");
        int filaE = sc.nextInt();
        System.out.println("Introduce la columna del asiento");
        int columnaE = sc.nextInt();
        int numeroEspectadores=0;
        if (sala[filaE][columnaE]==false){
            numeroEspectadores= numeroEspectadores+1;
        }

        return numeroEspectadores;

    }

}
