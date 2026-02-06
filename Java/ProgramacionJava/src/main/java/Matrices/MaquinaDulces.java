package unidad2.Matrices;

public class MaquinaDulces {
    static void main(String[] args) {


        int[][] inventario = {
                {5, 0, 8},
                {2, 10, 0},
                {0, 4, 1}
        };
        MaquinaDulces r = new MaquinaDulces();
        r.deteccionAgotados(inventario);
        int agotado= r.contabilizaAgotados(inventario);
        System.out.println("¡Alerta!, hay "+agotado+" productos agotados, por lo tanto hacen falta "+ agotado+" productos nuevos");
    }

    void deteccionAgotados (int [][] inventario){
        for (int i = 0; i < inventario.length; i++) {
            int [] fila = inventario[i];
            for (int j = 0; j < fila.length; j++) {
                if (fila[j]==0){
                    System.out.println("¡Alerta! Producto agotado en la Fila " +i+" ,Columna " +j);
                }

            }
        }
    }
    int contabilizaAgotados (int [][] inventario){
        int contador =0;
        for (int i = 0; i < inventario.length; i++) {
            int [] fila = inventario[i];
            for (int j = 0; j < fila.length; j++) {
                if (fila[j]==0){
                    contador=contador+1;
                }

            }
        }
        return contador;
    }



}
