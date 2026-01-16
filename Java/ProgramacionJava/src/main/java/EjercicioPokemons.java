import java.util.Scanner;
import java.util.Random;

public class EjercicioPokemons {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Capturar pokemon");
        System.out.println("2. Realizar Batalla");
        System.out.println("3. Mostrar Pokédex");
        System.out.println("4. Finalizar");
    }

    public int capturarpokemon (Scanner scanner, int contador, String [] nombres, int [] niveles){
        System.out.println("Dime el nombre del pokemon: ");
        String nombre = scanner.next();
        System.out.println("Dime el nivel del pokemon: ");
        int nivel = scanner.nextInt();
        nombres[contador] = nombre;
        niveles[contador] = nivel;
        contador = contador + 1;
        return contador;
    }

    public void mostrarpokedex (int contador, String [] nombres, int [] niveles){
        for (int i = 0;i < contador; i++){
            System.out.println(nombres[i] + " - " + niveles[i]);
        }
    }

    public void realizarBatalla (Scanner scanner, String [] nombres, int [] niveles, int contador){
        Random random = new Random();
        System.out.println("Escoge la posición de uno de tus pokemons: ");
        int pos = scanner.nextInt();
        while (pos >= contador){
            System.out.println("Escoge una posición correcta, tienes " + (contador) + " pokemons");
            pos = scanner.nextInt();
        }
        int pos_sistema = random.nextInt(0,contador);
        while (pos_sistema == pos){
            pos_sistema = random.nextInt(0,contador);
        }
        String miPokemon = nombres[pos];
        int miNivel = niveles[pos];
        String pokemonEntrenador = nombres[pos];
        int nivelEntrenador = niveles[pos];
        if (miNivel > nivelEntrenador){
            System.out.println("Has ganado");
        }
        else if (miNivel == nivelEntrenador){
            System.out.println("Empate");
        }
        else if (miNivel < nivelEntrenador){
            System.out.println("Has perdido");
        }
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        String [] nombres = new String[15];
        int [] niveles = new int[15];
        EjercicioPokemons r = new EjercicioPokemons();
        r.menu();
        System.out.println("Elige la opción: ");
        int opcion = scanner.nextInt();
        while (opcion != 4) {
            if (opcion == 1){
                contador = r.capturarpokemon(scanner, contador, nombres, niveles);
            }
            if (opcion == 2){
                r.realizarBatalla(scanner, nombres, niveles, contador);
            }
            if (opcion == 3){
                r.mostrarpokedex(contador, nombres, niveles);
            }
            r.menu();
            System.out.println("Elige la opción: ");
            opcion = scanner.nextInt();
        }
        System.out.println("Finalizando programa...");
    }
}
