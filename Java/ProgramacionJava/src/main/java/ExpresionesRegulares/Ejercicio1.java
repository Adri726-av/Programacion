package ExpresionesRegulares;

public class Ejercicio1 {
    static void main(String[] args) {
        String cadena = "621210120";
        String patron = "[0-9]{1,}";

        if (cadena.matches(patron)) {
            System.out.println("Valido");
        }
        else {
            System.out.println("No valido");
        }
    }
}
