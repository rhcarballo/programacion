package ies.puerto;

public class CuentaBancaria {
    private int numeroCuenta;
    private String nombreTitular;
    private double saldo;


    /**
     * Getters/Setters de la clase
     */
    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return this.nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Constructor de la clase por defecto
     */
    public CuentaBancaria(){
    }

    /**
     * Constructor de la clase con todos los parametros.
     * @param numeroCuenta
     * @param nombreTitular
     * @param saldo
     */
    public CuentaBancaria(int numeroCuenta, String nombreTitular, double saldo){
        this.numeroCuenta=numeroCuenta;
        this.nombreTitular=nombreTitular;
        this.saldo=saldo;
    }



    /**
     * Funcion para depositar dinero
     * @param dineroADepositar
     * @param saldo
     * @return saldo
     */

    public double depositarDinero(double dineroADepositar){
        
        saldo += dineroADepositar;

        return saldo;

    }

    /**
     * Funcion para retirar dinero
     * @param dineroARetirar
     * @param saldo
     * @return saldo
     */
    public double retirarDinero(double dineroARetirar){

        saldo -= dineroARetirar;

        return saldo;
    }

    public String imprimir(){
        String resultado;

        resultado = "Numero de cuenta"+numeroCuenta+"Nombre del titular: "+nombreTitular+"Saldo: "+saldo;
        return resultado;
    }

}
