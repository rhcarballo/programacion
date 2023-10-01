/**
 * @author rhcarballo
 * Ejercicio numero 3
 */
public class Ejercicio3 {

    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10, 
<<<<<<< HEAD
     * es decir, 1 + 2 + 3 + …. + 10. Utilia un buble for y un bucle while.
=======
     * es decir, 1 + 2 + 3 + …. + 10. 
     * Utilia un buble __for__ y un bucle __while__.
     */
    public static void main(String[] args) {

        int suma = 0; 
        for(int i=0; i <= 10; i++){
            suma = suma + i; //suma += i (es otra manera de escribir la suma)
            
        }
        System.out,println("Suma en bucle for:"+suma);

       int i=0;
       int suma = 0;
       while (i=<10){
        suma += i;
        i++;
       }
       System.out.printf("Suma en bucle while:"+suma)
    }
}