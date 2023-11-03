package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

 Ejercicio7 ejercicio7 = new Ejercicio7();

    @Test
    public void calcularLunesTestOK() {
        verificarDaSemana("Lunes", 1);
        verificarDaSemana("Martes", 2);
        verificarDaSemana("Miércoles", 3);
        verificarDaSemana("Jueves", 4);
        verificarDaSemana("Viernes", 5);
        verificarDaSemana("Sábado", 6);
        verificarDaSemana("Domingo", 7);
        verificarDaSemana("No es un día de la semana", 8);

    }


    public void verificarDaSemana(String strDia, int numeroDia) {

            String resultado = "";
            resultado = ejercicio7.calcularDiaSemana(numeroDia);
            Assertions.assertEquals(strDia, resultado, "No se ha obtenido el resultado esperado");

    }
}
