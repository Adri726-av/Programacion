package ExpresionesRegulares;

public class Ejercicio3 {
    static void main(String[] args) {
        String contrasena = "contraseña1234";
        String patron = "[a-zA-Z0-9]{8,}";

        if (contrasena.matches(patron)) {
            System.out.println("Valido");
        }
        else {
            System.out.println("No valido");
        }
    }
}
