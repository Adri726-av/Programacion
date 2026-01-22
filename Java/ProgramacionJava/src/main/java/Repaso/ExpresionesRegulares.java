package Repaso;

public class ExpresionesRegulares {
    static void main(String[] args) {
        // Fecha
        String frase = "Hoy es 22/01/2026";
        String patron = ".*\\d{2}/\\d{2}/\\d{4}";

        if (frase.matches(patron)) {
            System.out.println("Hay una fecha");
        }
        else {
            System.out.println("Error");
        }

        // DNI

        String DNI = "47264812D";
        String patron1 = "\\d{8}[a-zA-Z]";

        if (DNI.matches(patron1)) {
            System.out.println("DNI Valido");
        }
        else {
            System.out.println("Error");
        }

        //Matricula

        String matricula = "1823QWD";
        String patron2 = "\\d{4}[A-Z]{3}";

        //Email

        String email = "aleovel726@gmail.com";
        String patron3 = "[a-z0-9]+\\@[a-z]+\\.[a-z]{2,}";

        if (email.matches(patron3)) {
            System.out.println("Correo valido");
        }
        else {
            System.out.println("Correo NO valido");
        }
    }
}
