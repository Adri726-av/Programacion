package JavaOrientadoObjetos.Boletin3.PartidaJuegoMesa;

public class GestionaPartida {
    static void main(String[] args) {
        Partida p = new Partida();
        Participante p1 = new Participante("jugador1", "Rodrigo",20, 240);
        Participante p2 = new Participante("jugador2", "Manuel",21, 165);
        Participante p3= new Participante("jugador3", "Fernando",22, 120);
        Participante p4 = new Participante("jugador4", "Puerto",19, 200);

        Participante[] participantes = {p1,p2,p3,p4};
        p.setParticipantes(participantes);
        System.out.println(p.CalculaMayorPuntuacion());
    }
}
