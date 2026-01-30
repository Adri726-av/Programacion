package JavaOrientadoObjetos.Gatos;

public class Gato {
    String color;
    String raza;
    String sexo;
    int edad;
    double peso;

    public Gato(String color, String raza, String sexo, int edad, double peso) {
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    // Metodos

    void maulla() {
        System.out.println("miauuuuuu");
    }

    void ronronea() {
        System.out.println("rrrr");
    }

    void come(String comida) {
        if (comida.equals("pescado")) {
            System.out.println("Yummy Yummy");
        }
        else {
            System.out.println("buaahh, mejor no");
        }
    }

    void pelear(Gato contrincante) {
        if (contrincante.sexo.equals(this.sexo)){
            System.out.println("Ven aqui mamon, que te vas a enterar");
        }
        else {
            System.out.println("La violencia nunca es la solución");
        }
    }
}
