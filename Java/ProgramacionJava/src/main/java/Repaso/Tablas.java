package Repaso;

public class Tablas {
    static void main(String[] args) {
        int[] tablaEnteros = new int[10];
        System.out.println(tablaEnteros.length);
        System.out.println(tablaEnteros[0]);

        boolean[] tablaBooleanos = new boolean[2];
        System.out.println(tablaBooleanos[1]);

        String[] tablaString = new String[3];
        System.out.println(tablaString[2]);

        int[] tablaNum = new int[50];
        for (int i = 0; i < tablaNum.length; i++){
            tablaNum[i] = i+1;
            System.out.println(tablaNum[i]);
        }
     }
}
