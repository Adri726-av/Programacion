package JavaOrientadoObjetos.BoletinEstatico.Ejercicio1.Controller;

import java.time.LocalDate;
import JavaOrientadoObjetos.BoletinEstatico.Ejercicio1.Models.CuentaBancaria;

public class GestionaCuentas {
    static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria(290.98,LocalDate.of(2026,2,12), "ES61 1234 3456 42", "Adrian");
        c1.setClienteAut("Juan");
        CuentaBancaria c2 = new CuentaBancaria(342.43,LocalDate.of(2025,5,17), "ES61 7214 3656 52", "Carlos");
        c2.setClienteAut("Maria");
        CuentaBancaria c3 = new CuentaBancaria(1203.58,LocalDate.of(2022,7,2), "ES61 5224 3558 12", "Lucia");
        System.out.println(c3.getIdIncr());
    }
}
