package JavaOrientadoObjetos.Boletin3.CuentaBancaria;

public class GestionaPersona {
    static void main(String[] args) {
        Persona p1 = new Persona("leon", 1981, "Adrian", "48124716D");
        Persona p2 = new Persona("leon", 1981, "Adrian", "48124716D");

        System.out.println(p1 == p2);

        System.out.println(p1.equals(p2));

    }
}
