package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test{

    Ejercicio4 gestionBancaria;
    String titular = "Roberto";
    double saldo = 9000.0;

    @BeforeEach

    public void beforeEach(){
        gestionBancaria = new Ejercicio4(titular, saldo);
    }
   
    @Test
    public void setTitular(){
        String miTitular="Fernando Alonso";
        gestionBancaria.setTitular(miTitular);
        Assertions.assertEquals(miTitular, gestionBancaria.getTitular(), "No es el resultado esperado");
    }

    @Test
    public void setSaldo(){
        double miSaldo = 10500.0;
        gestionBancaria.setSaldo(miSaldo);
        Assertions.assertEquals(miSaldo, gestionBancaria.getSaldo(), "No es el resultado esperado");
    }


    @Test
    public void depositarDineroTestOk(){
        double dineroADepositar = 150.0;
        double saldoOk = 9150.0;
        double saldo = gestionBancaria.depositarDinero(dineroADepositar);
        Assertions.assertEquals(saldoOk, saldo, "No es el resultado esperado");
    }

    @Test
    public void retirarDineroTestOk(){
        double dineroARetirar = 800.0;
        double saldoOk = 8200.0;
        double saldo = gestionBancaria.retirarDinero(dineroARetirar);
        Assertions.assertEquals(saldoOk, saldo, "No es el resultado esperado");
    }

    @Test
    public void imprimirTestOk(){
        String resultadoOk =  "Titular de la cuenta: "+titular+", saldo de la cuenta: "+saldo;
        String resultado = gestionBancaria.imprimir();
        Assertions.assertEquals(resultadoOk, resultado, "No es el resltado esperado");
    }

}
