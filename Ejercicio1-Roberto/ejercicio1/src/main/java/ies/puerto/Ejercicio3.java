package ies.puerto;

/**
 * Getters/Setters de los parámetros de la clase
 */
public class  Ejercicio3{
    
    /**
     * Metodo para clasificar notas utilizando condiciones If
     * @param nota
     * @return resultado de la nota. 
     */
    public String clasificarNotasIf (double nota){
    String resultado = "";

    if (nota < 4.99){
        resultado = "Suspenso";
    }else if ((nota > 4.99)&&(nota < 5.99)){
        resultado = "Aprobado";
    }else if ((nota > 5.99)&&(nota < 6.99)){
        resultado = "Bien";
    }else if ((nota > 6.99)&&(nota < 8.99)){
        resultado = "Notable";
    }else if ((nota > 8.99)&&(nota < 9.99)){
        resultado = "Sobresaliente";
    }else if (nota > 9.99){
        resultado = "Matricula";
    }
    return resultado;
    }


    /**
    * Metodo para clasificar notas utilizando Switch
    * @param nota
    * @return resultado de la nota
    */
    public String clasificarNotasSwitch(double nota){
    String resultado = "";
    int caso=0;
    
    if (nota < 4.99){
        caso = 1;
    }else if ((nota > 4.99)&&(nota < 5.99)){
        caso = 2;
    }else if ((nota > 5.99)&&(nota < 6.99)){
        caso = 3;
    }else if ((nota > 6.99)&&(nota < 8.99)){
        caso = 4;
    }else if ((nota > 8.99)&&(nota < 9.99)){
        caso = 5;
    }else if((nota > 9.99)){
        caso=6;
    }

        switch(caso){

            case 1:
                if (nota < 4.99){
                    resultado = "Suspenso";
                }
                break;
                
            
            case 2: 
                if ((nota > 4.99)&&(nota < 5.99)){
                    resultado = "Aprobado";
                } 
                break;
            
            case 3:
                if ((nota > 5.99)&&(nota < 6.99)){
                    resultado="Bien";
                }
                break; 

            case 4: 
                if ((nota > 6.99)&&(nota < 8.99)){
                    resultado = "Notable";
                }
                break;

            case 5: 
                if ((nota > 8.99)&&(nota < 9.99)){
                    resultado="Sobresaliente";
                }
                break;
            
            case 6:
                if (nota == 10){
                    resultado = "Matricula";
                }
                break;

        }

    return resultado;
    }

public String calcularNotaSwitch(float nota){
    String calificacion = "";
    int enteroNota = (int) nota;

    switch (enteroNota) {
        case 0:   
        case 1:
        case 2:
        case 3:
        case 4:
            calificacion = "Suspenso";
            break;
        case 5:
            calificacion = "Aprobado";
            break;
        case 6:
            calificacion = "bien";
            break;
        case 7:
            calificacion = "Notable";
            break;
        case 8:
            calificacion = "Notable";
            break;
        case 9:
            calificacion = "Sobresaliente";
            break;
        case 10:
            calificacion = "Matricula";
            break;

        default:
            calificacion="Algo esta mal.";
    }

    return calificacion;
}

}
