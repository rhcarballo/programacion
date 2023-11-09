package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CirculoTest {

   double radio = 12.0;
   Circulo circulo;
   
   @BeforeEach

   public void beforeEach(){
        circulo = new Circulo(radio);
   }

   @Test
   public void constructorTestOk(){
        Circulo circulo = new Circulo(radio);
        Assertions.assertEquals(radio, circulo.getRadio(), "No se ha obtenido el resultado esperado");
   }

   @Test
   public void setRadioTestOk(){
      double miRadio = 16.0;
      circulo.setRadio(miRadio);
      Assertions.assertEquals(miRadio, circulo.getRadio(), "No es el resultado esperado.");
   }

   @Test
   public void areaCirculoOkTest(){
    double resultadoOK = 452.16;
    double resultado = circulo.areaCirculo();
    Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
   }


   @Test
   public void circunferenciaCirculoOkTest(){
      double circunferenciaOk = 75.36;
      double circunferencia = circulo.circunfrenciaCirculo();
      Assertions.assertEquals(circunferenciaOk, circunferencia, "No es el resultado esperado");
   }

   @Test
    public void imprimirTestOk(){
      String resultadoOk= "Radio del círculo: "+radio+".";
      Assertions.assertEquals(resultadoOk, circulo.imprimir(), "No se ha obtenido el resultado esperado");
    }


}

