package JavaOrientadoObjetos.BoletinEstatico.Ejercicio1.Models;

import java.time.LocalDate;

public class CuentaBancaria {
    private double saldo;
    private LocalDate fechaApertura;
    private int idIncr;
    private static int contador;
    private String iban;
    private String clienteTit;
    private String clienteAut;

    public CuentaBancaria(double saldo, LocalDate fechaApertura, String iban, String clienteTit) {
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.iban = iban;
        this.clienteTit = clienteTit;
        contador = contador +1;
        this.idIncr = contador;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public int getIdIncr() {
        return idIncr;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getClienteTit() {
        return clienteTit;
    }

    public void setClienteTit(String clienteTit) {
        this.clienteTit = clienteTit;
    }

    public String getClienteAut() {
        return clienteAut;
    }

    public void setClienteAut(String clienteAut) {
        this.clienteAut = clienteAut;
    }
}
