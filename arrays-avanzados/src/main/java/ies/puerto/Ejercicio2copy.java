package ies.puerto;

import java.util.Scanner;

public class Ejercicio2copy {

    public static void main (String[] args){

    }


    public void pedirDatos(){
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int elementosMostrar = 0;
        int temporal;
        boolean salir = false;
        do{
            System.out.println("Introduce el valor "+(elementosMostrar+1));
            temporal = scanner.nextInt();
            if (temporal >= 0) {
                salir = true;
            }else{
                array[elementosMostrar] = temporal;
                elementosMostrar++;
            }
        }while (elementosMostrar < array.length && !salir);
        mostrarInfoArray(array, temporal);
    } 

    public void mostrarInfoArray(int[] array, int total){
        for(int i = 0; i < total; i++){
            
            System.out.println(array[i]);
        }
    }
}
