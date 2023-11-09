package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CirculoTest {

   Circulo circulo1 = new Circulo(2);
   Circulo circulo2 = new Circulo(12);

   @Test
   public void areaCirculo1OkTest(){
    double resultadoOK = 12.56;
    double resultado = circulo1.areaCirculo();
    Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
   }

   @Test
   public void areaCirculo2OkTest(){
    double resultadoOK = 452.16;
    double resultado = circulo2.areaCirculo();
    Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
   }

   @Test
   public void circunferenciaCirculo1OkTest(){
      double circunferenciaOk = 12.56;
      double circunferencia = circulo1.circunfrenciaCirculo();
      Assertions.assertEquals(circunferenciaOk, circunferencia, "No es el resultado esperado");
   }

   @Test
   public void circunferenciaCirculo2OkTest(){
      double circunferenciaOk = 75.36;
      double circunferencia = circulo2.circunfrenciaCirculo();
      Assertions.assertEquals(circunferenciaOk, circunferencia, "No es el resultado esperado");
   }



}

