package RepasoNavidad;
import java.util.Scanner;

public class ElCodificadorDelGremioDeMagos {
    public boolean validarAcceso (String usuario, String clave) {
        boolean validacion = false;
        int longitud = clave.length();
        if (longitud >= 8) {
            System.out.println("Esta bien");
            validacion = true;
        }
        return validacion;
    }

    static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nombre de usuario: ");
    String usuario = scanner.nextLine();
    System.out.println("Contraseña: ");
    String clave = scanner.nextLine();
    System.out.println("Texto del conjuro que contiene errores o palabras prohibidas: ");
    String mensaje = scanner.nextLine();

    }
}
