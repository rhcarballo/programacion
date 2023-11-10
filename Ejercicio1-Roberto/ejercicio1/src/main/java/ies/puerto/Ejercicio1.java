package ies.puerto;

/**
 * Getters/Setters de los parámetros de la clase
 */
public class  Ejercicio1{
    
    public int busquedaBinaria(int valor){
        int[] array = {1, 2, 3, 4, 5};
        int inicio = 0;
        int fin = 4;

        while (inicio <= fin){
            int medio = (inicio + fin)/2;
            if (array[medio] == valor){
                return medio;
            }else if  (array[medio] < valor){
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }

        }
        return -1;
    }

}
