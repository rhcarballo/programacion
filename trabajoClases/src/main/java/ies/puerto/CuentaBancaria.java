public class CuentaBancaria{
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
     * Constructor con parametro numeroCuenta
     * @param numeroCuenta
     */

    public CuentaBancaria(int numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }

    /**
     * Constructor con parametro numeroCuenta y nombreTitular
     * @param numeroCuenta
     * @param nombreTitular
     */

    public CuentaBancaria(int numeroCuenta, String nombreTitular){
        this.numeroCuenta=numeroCuenta;
        this.nombreTitular=nombreTitular;
    }

    /**
     * Constructor con parametro numeroCuenta, nombreTitular y saldo
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

    public double depositarDinero(double dineroADepositar, double saldo){

        saldo += dineroADepositar;
    
        return saldo;
        
    }

    /**
     * Funcion para retirar dinero
     * @param dineroARetirar
     * @param saldo
     * @return saldo
     */
    public double retirarDinero(double dineroARetirar, double saldo){
        
        saldo -= dineroARetirar;

        return saldo;
    }


    CuentaBancaria banco1 = new CuentaBancaria(17829, "Juan", 1700.50);
    CuentaBancaria banco2 = new CuentaBancaria(302720, "Aitor", 9000);


}
