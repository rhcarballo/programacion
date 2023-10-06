public class NumerosPerfectos {

    /**
     * Descripcion del algoritmo
     * programa que encuentre e imprima todos los números perfectos en un rango dado (por ejemplo, entre 1 y 1000).
     */
    public static void main(String[] args) {

        System.out.println("Números perfectos entre 1 y 1000");
        int sumadedivisores = 0;

        for(int n = 1; n <= 1000; n++) {
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