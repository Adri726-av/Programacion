package Retos;
import java.util.Scanner;

public class RetoMarteTablas {
    public String ExtraerDatos (String mensaje, String recursos, int cantidades, int limites_alerta) {
        String [] Nombre = mensaje.split(":");
        System.out.println(Nombre[2]);
        boolean encontrado = false;
        int i = 0;
        while (i<recursos.length() && !encontrado) {
            if (recursos[i].equals(Nombre[2])) {
                encontrado = true;
                int posicion = i;
            }
            else {
                i = i +1;
            }
        }
        if (encontrado) {
            char cadena = Nombre[2]+":"+cantidades[]
        }
        return
    }
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] recursos = new String[100];
        int [] cantidades = new int[100];
        int [] limites_alerta = new int[100];
        System.out.println("¿Cuantos recursos vas a introducir?: ");
        int entradas = scanner.nextInt();
        for(int i=0; i<entradas; i++) {
            System.out.println("Nombre del recurso: ");
            String recurso = scanner.next();
            recursos[i] = recurso;
            System.out.println("Cantidad: ");
            int cantidad = scanner.nextInt();
            cantidades[i] = cantidad;
            System.out.println("Nivel crítico: ");
            int NivelCritico = scanner.nextInt();
            limites_alerta[i] = NivelCritico;
        }
        String mensaje = "ERR_SISTEMA::Agua::-15++FIN";
    }
}
