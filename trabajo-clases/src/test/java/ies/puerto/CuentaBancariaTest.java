package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {

    int numeroCuenta;
    String nombreTitular;
    double saldo = 7500.50;
    CuentaBancaria cuentaBancaria;

    @BeforeEach

    public void beforeEach(){
        cuentaBancaria = new CuentaBancaria(numeroCuenta, nombreTitular, saldo);
    }

    @Test
    public void setNumeroCuentaTestOk(){
        int miNumeroCuenta = 123456;
        cuentaBancaria.setNumeroCuenta(miNumeroCuenta);
        Assertions.assertEquals(miNumeroCuenta, cuentaBancaria.getNumeroCuenta(), "No se ha obtenido el resultado esperado");
    }

    @Test
    public void setNombreTitularTestOk(){
        String miNombreTitular = "Juan";
        cuentaBancaria.setNombreTitular(miNombreTitular);
        Assertions.assertEquals(miNombreTitular, cuentaBancaria.getNombreTitular(), "No se ha obtenido el resultado esperado");
    }

    @Test
    public void setSaldoTestOk(){
        double miSaldo = 9000.50;
        cuentaBancaria.setSaldo(miSaldo);
        Assertions.assertEquals(miSaldo, cuentaBancaria.getSaldo(), "No se ha obtenido el resultado esperado");
    }

    @Test
    public void depositarDineroOkTest(){
        double dineroADepositar = 50.0;
        double saldoOk = 7550.50;
        double saldo = cuentaBancaria.depositarDinero(dineroADepositar);
        Assertions.assertEquals(saldoOk, saldo,"No es el resultado esperado");

    }


    @Test
    public void retirarDineroOkTest(){
        double dineroARetirar = 100.0;
        double saldoOk = 7400.50;
        double saldo = cuentaBancaria.retirarDinero(dineroARetirar);
        Assertions.assertEquals(saldoOk, saldo, "no es el resultado esperado");
    }


    @Test
    public void imprimirTestOk(){
         String resultadoOk="Numero de cuenta"+numeroCuenta+"Nombre del titular: "+nombreTitular+"Saldo: "+saldo;
        Assertions.assertEquals(resultadoOk, cuentaBancaria.imprimir(), "No se ha obtenido el resultado esperado");
    }
    
}
