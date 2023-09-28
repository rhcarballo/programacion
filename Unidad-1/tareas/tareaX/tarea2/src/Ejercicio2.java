/**
 * @author rhcarballo
 * Ejercicio numero 2
 */
public class Ejercicio2 {

    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente. 
     * El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que los tres valores introducidos 
     * por el teclado sean valores distintos. Presente un mensaje de alerta en caso de que se detecte la introducción de valores 
     * iguales.
     */
    public static void main(String[] args) {
        
        
        int valorA;
        int valorB;
        int valorC;

        Scanner lectura = new Scanner (System.in);

        //Bloque 1: Pedimos variables al usuario.

<<<<<<< HEAD
        
            System.out.println("Ingrese el valor de A");
            valorA = lectura.nextInt();
            System.out.println("Valor de A: "+valorB);
=======
        do{ 
            System.out.println("Ingrese el valor de A");
            valorA = lectura.nextInt();
            System.out.println("Valor de A: "+valorB)
>>>>>>> 44883c28feccc4b349ef41aa4feab40300cf2c77

            System.out.println("Ingrese el valor de la variable B: ");
            valorB = lectura.nextInt();
            System.out.println("valor de la variable B: "+valorB);

            System.out.println("Ingrese el valor de la variable C: ");
            valorC = lectura.nextInt();
            System.out.println("valor de la variable C: "+valorC);
<<<<<<< HEAD
        
        
        if ((valorA == valorB)||(valorA == valorC)||(valorB == valorC)) {
            System.out.println("Los valores son iguales");
        }
        
        //Bloque dos, determinar que valor es mayor

       
         if (valorA > valorB && valorA > valorC){
            System.out.printf("El mayor es A"+valorA);
         } else if (valorB > valorA && valorB > valorC){
            System.out.printf("El mayor es B"+valorB);
        } else{ System.out.printf("El mayor es C"+valorC);}
=======
        } while (valorA == valorB == valorC);
        
        //Bloque dos, determinar que valor es mayor

        if (valorA == valorB == valorC){
        System.out.printf("Los valores introducidos son iguales, ingrese valores diferentes.");
         } else if (valorA > valorB && valorA > valorC){
            System.out.printf("El mayor es A"+valorA);
         } else if (valorB > valorA && valorB > valorC){
            System.out.printf("El mayor es B"+);
         } else{ System.out.printf("El mayor es C"+valorC);
         }

>>>>>>> 44883c28feccc4b349ef41aa4feab40300cf2c77
    }

    

}