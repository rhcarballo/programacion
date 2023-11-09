package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {

    CuentaBancaria cuentaBancaria = new CuentaBancaria();
    CuentaBancaria cuentaBancaria1 = new CuentaBancaria(17829, "Juan", 1700.50);
    CuentaBancaria cuentaBancaria2 = new CuentaBancaria(302720, "Aitor", 9000.0);

    @Test
    public void depositarDinero1OkTest(){
        double dineroADepositar = 50.0;
        double saldoOk = 1750.50;
        double saldo = cuentaBancaria1.depositarDinero(dineroADepositar);
        Assertions.assertEquals(saldoOk, saldo,"No es el resultado esperado");

    }

    @Test
    public void depositarDinero2OkTest(){
        double dineroADepositar = 25.0;
        double saldoOk = 9025.0;
        double saldo = cuentaBancaria2.depositarDinero(dineroADepositar);
        Assertions.assertEquals(saldoOk, saldo,"No es el resultado esperado");

    }

    @Test
    public void retirarDinero1OkTest(){
        double dineroARetirar = 100.0;
        double saldoOk = 1600.50;
        double saldo = cuentaBancaria1.retirarDinero(dineroARetirar);
        Assertions.assertEquals(saldoOk, saldo, "no es el resultado esperado");
    }

    @Test
    public void retirarDinero2OkTest(){
        double dineroARetirar = 100.0;
        double saldoOk = 8900.0;
        double saldo = cuentaBancaria2.retirarDinero(dineroARetirar);
        Assertions.assertEquals(saldoOk, saldo, "no es el resultado esperado");
    }

}
