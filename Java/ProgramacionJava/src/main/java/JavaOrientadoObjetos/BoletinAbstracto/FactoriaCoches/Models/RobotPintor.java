package JavaOrientadoObjetos.BoletinAbstracto.FactoriaCoches.Models;

public class RobotPintor extends Robot{

    public RobotPintor(String modelo, Estado estado, String combustible, String descripcion, double bateria) {
        super(modelo, estado, combustible, descripcion, bateria);
    }

    @Override
    void ejecutarTarea() {
        System.out.println("Aplica pintura a los vehículos de manera uniforme");
    }

    @Override
    void recargar(Estado estado) {
        System.out.println("Recargando por electricidad");
    }
}
