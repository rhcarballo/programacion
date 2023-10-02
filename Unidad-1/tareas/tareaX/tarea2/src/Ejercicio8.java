/**
 * @author rhcarballo
 * Ejercicio numero 2
 */
public class Ejercicio8 {

    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0.
     */
    public static void main(String[] args) {
        int n;

        Scanner lectura = new Sacnner (System.in);
        System.out.println("¿Cuántas materias tienes? ");
         n = lectura.nextInt();

        for(int materia; n>=0; n++);{
            System.out.printf("Nota Materia"+n);
        }


    }
}