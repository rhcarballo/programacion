package ies.puerto;

public class Ejercicio4 {

    /**
     * Funcion que nos muestra cual de los dos valores es el maximo.
     * @param numeroA primer numero para determinar si es mayor.
     * @param numeroB segundo numero para determinar si es mayor.
     * @return mayor de los dos numeros.
     */
    public int maximoDeDosValores(int numeroA, int numeroB){

        int mayor = 0;
        if (numeroA > numeroB){
            mayor = numeroA;
        } else {
            mayor = numeroB;
        }
        return mayor;
    }

    public int maximoDeTresValores(int maximoDeDosValores, int numeroC){
        int mayor = 0;
        if (numeroC > maximoDeDosValores){
            mayor = numeroC;
        } else {
            mayor = maximoDeDosValores;
        }
        
        return mayor;
    }
}