package ies.puerto;

/**
 * Clase que tiene como objetivo realizar el calculo del factorial
 * @author rhcarballo
 */

public class CalculoFactorial {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Calculando el factorial de "+numero+", resultado:"+calculoFactorial(numero));
    }

    /**
     * Metodo que realiza el calculo del factorial. 
     * @param numero Valor sobre el que se va a realizar el calculo
     * @return factorial del numero dado
     */
    public static int calculoFactorial (int numero) {
        int resultado = 1;

        for(int i = 2; i <= numero; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }
}