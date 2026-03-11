package Excepciones.BoletinExcepciones1.Ejercicio4;

import java.util.Random;

public class Ejercicio4 {
    public double[] division() {
        double [] resultados = new double[20];

        try {
            for (int i = 0; i < resultados.length; i++) {

                Random r = new Random(10);
                Random ran = new Random(10);

                int num1 = r.nextInt();
                int num2 = ran.nextInt();

                int resultado = num1 / num2;

                if (i == 10) {
                    throw new ArrayIndexOutOfBoundsException("Estas intentando guardar en la posicion 10");
                } else {
                    resultados[i] = resultado;
                }
            }

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");

        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println(i.getMessage());

        } finally {
            System.out.println();
        }
        System.out.println();

        return resultados;
    }
}
