import java.util.Scanner;

public class Ejercicio8 {

    /**
     * Descripcion del algoritmo
     * 8. Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. 
     * Solicita el límite por teclado.
     */
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        System.out.println("Desde el número 1, ¿hasta qué rango quiere que se muestren los números perfectos?");
        int rango = lectura.nextInt();
        int sumadedivisores = 0;

        for(int n = 1; n <= rango; n++) {
            for(int divisor = 1; divisor <= n/2; divisor++) {
                if(n % divisor == 0) {
                    sumadedivisores += divisor;
                }
            }
            if(sumadedivisores == n) {
                System.out.println(n);
            }
            sumadedivisores = 0;
        }
    }
}