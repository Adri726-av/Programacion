package JavaOrientadoObjetos.Probando.Interfaces;

public class Animal extends SerVivo{
    void come() {

    }
    void respira() {

    }

    @Override
    boolean estaVivo() {
        return false;
    }

    @Override
    boolean seDesplaza() {
        return false;
    }
}
