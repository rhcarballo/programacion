package ies.puerto;

import java.util.Scanner;

public class Ejercicio6 {

    public void crearMatriz(){
        int[][] matriz = new int [5][5];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j <matriz[i].length; j++){
                if(i == 0 || i == matriz.length-1){
                    matriz[i][j] = 1;
                }
                if(j == 0 || j == matriz[i].length-1){
                    matriz[i][j] = 1;
                }

            }
        }

        for(int i = 0; i < matriz.length; i++){
            if(i == 0 || i == matriz.length-1){
                matriz[i][0] = 1;
            }
            for (int j = 0; j < matriz[i].length; j++){
                if(j == 0 || j == matriz[i].length-1){
                    matriz[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j <matriz[i].length; j++){
                if(i == 0 || i == matriz.length-1){
                    matriz[i][j] = 1;
                }else if(j == 0 || j == matriz[i].length-1){
                    matriz[i][j] = 1;
                }

            }
        }
    }
}
