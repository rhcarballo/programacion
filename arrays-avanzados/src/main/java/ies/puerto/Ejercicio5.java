package ies.puerto;

import java.util.Scanner;

public class Ejercicio5 {

    public void crearMatriz(){
        int[][] matriz = new int [5][5];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < matriz.length; i++){
            matriz[i][i] = 1;

        }
    }
}
