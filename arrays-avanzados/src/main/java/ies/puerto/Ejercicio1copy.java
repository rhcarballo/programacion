package ies.puerto;

import java.util.Scanner;

public class Ejercicio1copy {

    public static void main(String[] args){

    }


    public void pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        float[] array = new float[5];
        int i = 0;
        float temporal;

        do{
            System.out.println("Introduzca el valor para:"+(i+1));
            temporal = scanner.nextFloat();
            if ((temporal >= 0)&&(temporal <= 10)){
                array[i]=temporal;
            }

            i++;
        }while(i < array.length);
        
        mostrarInfoArray(array);
    }

     public void mostrarInfoArray(float[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Notas: "+array[i]);
        }
    }

    public float calcularNotaMedia(float[] array){
        float suma = 0;
        float notaMedia = 0;

        for(int i = 0; i < array.length; i++){
            suma += array[i];

        }

        notaMedia = suma/array.length;

        return notaMedia;
    }

    public float notaMaximoArray(float[] array){
        float maximo = array[0];

        for (int i = 0; i <= array.length; i++){
            if (array[i] > maximo){
                array[i] = maximo;
            }
        }
        
        return maximo;
    }

    public float notaMinimaArray(float[] array){
        float minimo = array[0];

        for(int i = 0; i <= array.length; i++){
            if (array[i] < minimo){
                array[i] = minimo;
            }
        }
        return minimo;
    }

   
}
