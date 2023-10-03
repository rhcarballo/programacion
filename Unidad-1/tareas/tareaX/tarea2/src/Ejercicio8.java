/**
 * @author rhcarballo
 * Ejercicio numero 8
 */
public class Ejercicio8 {

    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0.
     */
    public static void main(String[] args) {
        //Declaración de variables
        int n;
        int cuenta = 0; //Iniciamos la cuenta y acumulación
        int acumula = 0;
        int promedio = 0;

        Scanner lectura = new Scanner (System.in);

        
        
        do{
            System.out.println("Introduzca sus calificaciones o 0 para finalizar");
            n = lectura.nextInt();

            if (n > 0) {
                cuenta++;
                acumula = acumula + n;
            }
        }while (n != 0);

        if (cuenta > 0) {
            promedio = acumula / cuenta; 
        }

        System.out.printf("Promedio:" +promedio);

    }
}