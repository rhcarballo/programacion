package ies.puerto;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo al ejercicio X");
    }
        public String calcularDiaSemana(int dia){
            String resultado = "Lunes";

            switch(dia) {
                case 1:
                    
                    resultado = "Lunes";
                    break;
                
                case 2:
                    
                    resultado = "Martes";
                    break;
            
                case 3:
                   
                    resultado = "Miércoles";
                    break;   
                
                case 4:
           
                    resultado = "Jueves";
                    break; 

                case 5:
                 
                    resultado = "Viernes";
                    break; 
                
                case 6:
                   
                    resultado = "Sábado";
                    break; 

                case 7:
                    
                    resultado = "Domingo";
                    break; 

                default: 
                    System.out.println("No es un dia de la semana.");
            }

            return resultado;
        }
    
}