package JavaOrientadoObjetos.BoletinAbstracto.FactoriaCoches.Controller;
import JavaOrientadoObjetos.BoletinAbstracto.FactoriaCoches.Models.*;

public class GestionaFactoria {
    static void main(String[] args) {
        Robot[] inventarioRobots = new Robot[20];
        RobotSoldador r1 = new RobotSoldador("Xiaomi", Estado.ENCENDIDO, "Diesel", "Esto es un robot soldador", 11.2, 23, "Perfecto");
        RobotPintor r2 = new RobotPintor("Vivo", Estado.APAGADO, "Gasolina", "Esto es un robot pintor", 9);
        RobotEnsamblador r3 = new RobotEnsamblador("Samsung", Estado.APAGADO, "Gasolina", "Esto es un robot ensamblador", 12);

        inventarioRobots[0] = r1;
        inventarioRobots[1] = r2;
        inventarioRobots[2] = r3;

        for (Robot r:inventarioRobots) {
            System.out.println(r);
        }
    }
}
