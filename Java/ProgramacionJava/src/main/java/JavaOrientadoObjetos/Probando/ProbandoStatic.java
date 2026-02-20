package JavaOrientadoObjetos.Probando;

public class ProbandoStatic {
    static void metStatic() {
        System.out.println("Metodo estatico");
    }

    public void noStatic() {
        System.out.println("Metodo no estatico");
    }
    static void main(String[] args) {
        ProbandoStatic.metStatic();
        ProbandoStatic c = new ProbandoStatic();
        c.noStatic();
    }
}
