package JavaOrientadoObjetos.Boletin4.Herencia1;

public class GestionaVehiculos {

    public static void main(String[] args) {

        Vehiculo coche1 = new Automovil("Juan", 5, 4, "C");
        Vehiculo camion1 = new Camion("Pedro", 2, 6, 12000, 2, 3, 2);

        coche1.imprimeResumen();
        System.out.println("-------------");
        camion1.imprimeResumen();
    }
}
