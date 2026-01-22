package ExpresionesRegulares;

public class Ejercicio2 {
    static void main(String[] args) {
        String cadena = "12345";
        String patron = "[0-9]{5}";

        if (cadena.matches(patron)) {
            System.out.println("Valido");
        }
        else {
            System.out.println("No valido");
        }
    }
}
