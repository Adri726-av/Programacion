package JavaOrientadoObjetos.Anime;

import JavaOrientadoObjetos.Boletin3.CuentaBancaria.Persona;

public class GestionaPersonajesAnime {
    static void main(String[] args) {
        SerieAnime onePiece= new SerieAnime("One Piece", "Bertin");
        Luffy luffy = new Luffy("Luffy");
        // Tiempo Compilación Luffy y en Tiempo Ejecución es Tipo Luffy
        // Todo lo que se ve del PersonajeAnime y todo lo de Luffy
        PersonajeAnime luffy1 = new Luffy("Luffy");
        //Tiempo de Compilación PersonajeAnime y Tiempo Ejecución Luffy
        // Tiene sólo lo de PersonajeAnime
        // Luffy luffyTemp2 = new PersonajeAnime("luffy2");
        //No compila Tiempo Compilación tipo Luffy pero en Tiempo de Ejecución PersonajeAnime
        // Pasar a Luffy supone perder información --> FALLA
        Luffy luffyTemp2 = (Luffy) new PersonajeAnime("luffy2");
        //Casting explícito desde PersonajeAnime a Luffy
        luffy.reir();
        luffy.setSerie(onePiece);
        System.out.println(luffy);

        Goku goku = new Goku("Goku");
        PersonajeAnime personaje = goku;

    }
}
