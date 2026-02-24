package JavaOrientadoObjetos.BoletinAbstracto.FactoriaCoches.Models;

public class RobotEnsamblador extends Robot{

    public RobotEnsamblador(String modelo, Estado estado, String combustible, String descripcion, double bateria) {
        super(modelo, estado, combustible, descripcion, bateria);
    }

    @Override
    void ejecutarTarea() {
        System.out.println("Ensamblar piezas");
    }

    @Override
    void recargar(Estado estado) {
        if (estado == Estado.APAGADO) {
            System.out.println("Recargando por gasolina");
        }
        else {
            System.out.println("Estoy encendido y no puedo recargar");
        }
    }

}
