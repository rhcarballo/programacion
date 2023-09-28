/**
 * @author rhcarballo
 * Ejercicio numero 2
 */
public class Ejercicio1 {

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {
        
        
        int valorA;
        int valorB;
        int valorC;

        Scanner lectura = new Scanner (System.in);

        //Bloque 1: Pedimos variables al usuario.

        do{ 
            System.out.println("Ingrese el valor de A");
            valorA = lectura.nextInt();
            System.out.println("Valor de A: "+valorB)

            System.out.println("Ingrese el valor de la variable B: ");
            valorB = lectura.nextInt();
            System.out.println("valor de la variable B: "+valorB);

            System.out.println("Ingrese el valor de la variable C: ");
            valorC = lectura.nextInt();
            System.out.println("valor de la variable C: "+valorC);
        } while (valorA == valorB == valorC);
        
        //Bloque dos, determinar que valor es mayor

        if (valorA == valorB == valorC){
        System.out.printf("Los valores introducidos son iguales, ingrese valores diferentes.")
         } else if (valorA > valorB && valorA > valorC){
            System.out.printf("El mayor es A"+valorA);
         } else if (valorB > valorA && valorB > valorC){
            System.out.printf("El mayor es B"+);
         } else{ System.out.printf("El mayor es C"+valorC);
         }

    }
}