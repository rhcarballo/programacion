package ies.puerto;

public class Ejercicio4 {

    /**
     * Funcion que nos muestra cual de los dos valores es el maximo.
     * @param numeroA primer numero para determinar si es mayor.
     * @param numeroB segundo numero para determinar si es mayor.
     * @return mayor de los dos numeros.
     */
    public int calcularMaximo(int numeroA, int numeroB){

        
        if (numeroA > numeroB){
            return numeroA;
        } else {
           return numeroB;
        }
    }

    public int calcularMaximo(int numeroA, int numeroB, int numeroC){
       int maximoDeDos = calcularMaximo(numeroA, numeroB);
      return calcularMaximo(maximoDeDos, numeroC);
    }

}