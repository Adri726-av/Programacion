package JavaOrientadoObjetos.Boletin2.Libro.Gatos;

public class GestionarGatos {
    static void main(String[] args) {
        Gato gato1 = new Gato("gris", "siberiano", "macho", 7, 3.5);
        Gato gato2 = new Gato("blanco", "korat", "hembra", 9, 4.5);

        gato1.maulla();
        gato1.come("pienso");
        gato2.ronronea();
        gato2.come("pescado");
        gato1.pelear(gato2);

    }
}
