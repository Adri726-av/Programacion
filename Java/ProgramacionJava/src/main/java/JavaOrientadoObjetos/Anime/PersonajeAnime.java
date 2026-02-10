package JavaOrientadoObjetos.Anime;

public class PersonajeAnime {
    private String nombre;
    private SerieAnime serie;
    private Transformacion transformacion;
    private int edad;

    public PersonajeAnime(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println("Esta comiendo");
    }

    public void atacar() {
        System.out.println("Esta atacando");
    }

    public boolean transformarse(PersonajeAnime origen, PersonajeAnime destino) {
        boolean transformado = true;
        this.transformacion = new Transformacion(origen, destino);
        return transformado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SerieAnime getSerie() {
        return serie;
    }

    public void setSerie(SerieAnime serie) {
        this.serie = serie;
    }

    public Transformacion getTransformacion() {
        return transformacion;
    }

    public void setTransformacion(Transformacion transformacion) {
        this.transformacion = transformacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "PersonajeAnime{" +
                "nombre='" + nombre + '\'' +
                ", serie=" + serie +
                ", transformacion=" + transformacion +
                ", edad=" + edad +
                '}';
    }


}
