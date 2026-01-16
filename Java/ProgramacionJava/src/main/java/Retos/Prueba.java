package Retos;

public class Prueba {
    static void main(String[] args) {
        String mensaje = "ERR_SISTEMA::Agua::-15++FIN";
        String [] NombreRecurso = mensaje.split(":");
        System.out.println(NombreRecurso[2]);
    }
}
