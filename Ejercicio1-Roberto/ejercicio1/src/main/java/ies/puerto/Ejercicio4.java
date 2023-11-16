package ies.puerto;

/**
 * Getters/Setters de los parámetros de la clase
 */
public class  Ejercicio4{
    
    private String titular;
    private double saldo;

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Constructor por defecto de la clase
     */
    public Ejercicio4 (){
    }

    /**
     * Constructor con los parámetros de la clase
     * @param titular de la cuenta bancaria
     * @param saldo de la cuenta bancaria
     */
    public Ejercicio4 (String titular, double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }

    /**
     * Funcion para depositar una cantidad de dinero de la cuenta.
     * @param dineroADepositar
     * @return saldo con el dinero depositado
     */
    public double depositarDinero(double dineroADepositar){

        saldo += dineroADepositar;
        
        return saldo;
    }

    public void depositar(double deposito) {
        if (deposito > 0) {
            this.saldo += deposito;
        }
    }

    public boolean retirar(double saldo) {
        if ((this.saldo - saldo) > 0) {
            this.saldo -= saldo;
            return true;
        }
        return false;
    }



    /**
     * Funcion para retirar una cantidad de dinero de la cuenta.
     * @param dineroARetirar
     * @return saldo con el dinero retirado. 
     */
    public double retirarDinero(double dineroARetirar){
        
        saldo -= dineroARetirar;
        
        return saldo;
    }

    public String imprimir(){
        return "Titular de la cuenta: "+titular+", saldo de la cuenta: "+saldo;
    }

    @Override
    public String toString(){
        return "Titular de la cuenta: "+titular+", saldo de la cuenta: "+saldo;
    }

}
