import java

/**
 * @author rhcarballo
 * Ejercicio numero 2
 */
public class Numerosperfectos {

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {

        //Introducimos el programa.
        System.out.println("Números perfectos entre 1 y 1000");

        //Bucle con declaración del rango para los números perfectos.
        for(int n = 1; n <= 1000; n++){
            int sumadedivisores = 0;

            //Bucle para divisores, si es divisor de n, lo añade a sumadedivisores
            for(int divisor = 0; divisor < n; divisor++){
                if (n % divisor == 0);
                sumadedivisores = sumadedivisores + divisor;
            }

            //Comprobación para ver si es número perfecto y exponerlo. 

            if (sumadedivisores == n)
            System.out.printf(n + "")
        }
        
    }
}