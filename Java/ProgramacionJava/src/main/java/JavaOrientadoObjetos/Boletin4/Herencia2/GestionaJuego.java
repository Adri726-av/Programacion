package JavaOrientadoObjetos.Boletin4.Herencia2;

public class GestionaJuego {
    static void main(String[] args) {
        Caballero caballero = new Caballero("Leon", 10, 100, "Espada");
        Villano villano = new Villano("Gargamel", 99, 200, "");
        Arquero arquero = new Arquero("Sova", 70, 120, "Flecha");
        Mago mago = new Mago("Alex", 55, 100, "Hechizo");

        System.out.println(caballero.esAtacado(arquero));
        System.out.println(caballero.esAtacado(arquero, 110));
        System.out.println(villano.esAtacado(caballero));
        System.out.println(villano.esAtacado(caballero, 20));
        System.out.println(arquero.esAtacado(caballero));
        System.out.println(arquero.esAtacado(caballero, 15));
        System.out.println(mago.esAtacado(arquero));
        System.out.println(mago.esAtacado(caballero, 5));

        System.out.println("La arma de el caballero es " + caballero.getArma());
        System.out.println("La arma de el villano es " + villano.getArma());
        System.out.println("La arma de el arquero es " + arquero.getArma());
        System.out.println("la arma de el mago es " + mago.getArma());
    }
}
