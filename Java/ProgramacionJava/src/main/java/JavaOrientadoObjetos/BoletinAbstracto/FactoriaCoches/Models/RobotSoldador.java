package JavaOrientadoObjetos.BoletinAbstracto.FactoriaCoches.Models;

public class RobotSoldador extends Robot{
    private int temperatura;
    private String espSeguridad;

    public RobotSoldador(String modelo, Estado estado, String combustible, String descripcion, double bateria, int temperatura, String espSeguridad) {
        super(modelo, estado, combustible, descripcion, bateria);
        this.temperatura = temperatura;
        this.espSeguridad = espSeguridad;
    }

    @Override
    void ejecutarTarea() {
        System.out.println("Realiza soldaduras precisas en la carrocería del automóvil");
    }

    @Override
    void recargar(Estado estado) {
        if (estado == Estado.APAGADO) {
            System.out.println("Recargando por electricidad");
        }
        else {
            System.out.println("Estoy encendido y no puedo recargar");
        }
    }
}
