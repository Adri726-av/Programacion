package JavaOrientadoObjetos.Boletin3.CuentaBancaria;

public class CuentaBancaria {
    private double saldo;
    private String numCuenta;
    private Persona infoTitular;
    private Persona autorizado;

    public CuentaBancaria(double saldo, String numCuenta, Persona infoTitular) {
        this.saldo = saldo;
        this.numCuenta = numCuenta;
        this.infoTitular = infoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Persona getInfoTitular() {
        return infoTitular;
    }

    public void setInfoTitular(Persona infoTitular) {
        this.infoTitular = infoTitular;
    }

    public Persona getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Persona autorizado) {
        this.autorizado = autorizado;
    }

    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
        System.out.println("Has retirado:" + cantidad + "€, tienes en la cuenta: " + saldo + "€");
    }

    public void retirarDinero(double cantidad) {
        saldo -= cantidad;
        System.out.println("Has retirado: " + cantidad + "€, tienes en la cuenta: " + saldo + "€");
    }

    public boolean validarImporte(double cantidad) {
        boolean valido = false;
        if (cantidad > 0) {
            valido = true;
        }
        else {
            valido = false;
        }
        return valido;
    }

    public void eliminarAutorizado(String dni) {

    }

    public void validarDNI()


}
