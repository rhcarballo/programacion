package ies.puerto;

/**
 * Getters/Setters de los parámetros de la clase
 */
public class  Ejercicio2{
    
    public int[] burbuja(int [] array) {
        int tamanio = array.length;
        boolean intercambio;
        int[] ordenado = new int[tamanio];

        do{
            intercambio = false;
            for(int i = 1; i < tamanio-1; i++){
                if (array[i-1] > array[i]) {
                    int temporal = array[i];
                    array[i] = array[i-1];
                    array[i-1]=temporal;
                    intercambio = true;
                }
            }
        }while (intercambio);

        return array;
    }

}
