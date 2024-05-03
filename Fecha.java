
/**
 * Fecha: clase cuyos objetos representan fechas calendarias, para el 
 * calendario gregoriano. Esta clase implementa una variedad de 
 * funcionalidades sobre fechas, como comparaciones, cómputos de días,
 * etc.
 * 
 * @author N. Aguirre 
 * @version 0.1
 */
public class Fecha
{
    // dia de la fecha
    private int dia;
    
    // mes de la fecha
    private int mes;
    
    // año de la fecha
    private int anho;

    /**
     * Constructor por defecto, para la clase fecha.
     * Crea como fecha por defecto la fecha inicial del 
     * calendario gregoriano (15/10/1582)
     */
    public Fecha()
    {
        dia = 15;
        mes = 10;
        anho = 1582;
    }

    /**
     * Constructor de la clase Fecha, que recibe la fecha a 
     * crear como parámetro. La fecha no puede ser previa
     * al 15/10/1582. Debe tenerse en cuenta la creación de
     * fechas válidas, en relación a número de días en los
     * meses, años bisiestos, etc.
     */
    public Fecha(int nuevoDia, int nuevoMes, int nuevoAnho)
    {
        dia = nuevoDia;
        mes = nuevoMes;
        anho = nuevoAnho;
    }
    
    /**
     * Retorna el dia de la fecha
     */
    public int obtenerDia() {
        // Implementar este método, reemplazando la línea siguiente
        return dia; 
    }
    
    /**
     * Retorna el mes de la fecha
     */
    public int obtenerMes() {
        // Implementar este método, reemplazando la línea siguiente
        return mes;
    }
    
    /**
     * Retorna el año de la fecha
     */
    public int obtenerAnho() {
        // Implementar este método, reemplazando la línea siguiente
        return anho;
    }
    
    /**
     * Cambia el día de la fecha. El nuevo día debe ser válido
     * para el mes y año actuales.
     */
    public void cambiarDia(int nuevoDia) {
    dia = nuevoDia;
    
    }
    
    /**
     * Cambia el mes de la fecha. El nuevo mes debe ser válido
     * para el día y año actuales.
     */
    public void cambiarMes(int nuevoMes) {
     
    }
    /**
     * Cambia el año de la fecha. El nuevo año debe ser válido
     * para el día y mes aactuales.
     */
    public void cambiarAnho(int nuevoAnho) {
        //Implementar este método
    }
    
    /**
     * Chequea si la fecha es igual a otra fecha dada
     */
    public boolean equals(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        {
            if(anho!=otraFecha.obtenerAnho())
            {
                return false;
            } else
            if (mes!=otraFecha.obtenerMes())
            {
                return false;
                
            } else if (dia!= otraFecha.obtenerDia())
            {
                return false;
            } else
             return true;
        }
    }
    
    /**
     * Chequea si la fecha es anterior a otra fecha dada
     */
    public boolean esAnterior(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente     
        if(anho < otraFecha.obtenerAnho()){
         return true;
        }else if(anho == otraFecha.obtenerAnho()){
            if(mes < otraFecha.obtenerMes()){
                return true;
            }else if(mes == otraFecha.obtenerMes()){
                if(dia < otraFecha.obtenerDia()){
                  return true;  
                }else{
                  return false;   
                }
            }else{
                return false;
            }
        } else{
            return false;
        }
    }    
            
            
    
         
    
    
    
     
    
    
    
    
    /* Computa distancia en días entre dos fechas.
     * El parámetro otraFecha debe corresponder a una fecha igual o 
     * posterior a la fecha del objeto.
     */
    
    
    
    
    /**
     * Computa la cantidad de días de un mes dado. El parámetro
     * debe corresponder a un mes válido.
     */
    private int cantDias(int unMes) 
    {
        // Implementar este método, reemplazando la línea siguiente
         {
        // Chequeo de precondición: el mes debe estar entre 1 y 12
        if (unMes < 1 || unMes > 12) {
            throw new IllegalArgumentException("El mes debe estar entre 1 y 12.");
        }

        // Array con la cantidad de días por mes (considerando si el año es bisiesto o no)
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Ajustar febrero si el año es bisiesto
        if (unMes == 2 && esBisiesto(anho)) {
            return 29; // Febrero tiene 29 días en años bisiestos
        } else {
            return diasPorMes[unMes - 1]; // Devuelve la cantidad de días del mes correspondiente
            
        }
    }
    }
    
    /**
     * Decide si un año dado es bisiesto o no. Un año es bisiesto
     * si es múltiplo de 4, salvo los múltiplos de 100 que no son 
     * múltiplos de 400.
     * El parámetro debe corresponder a un año válido.
     */
    private boolean esBisiesto(int unAnho) 
    {
      return (anho % 4 == 0 && anho % 100 != 0) || (anho % 400 == 0);
    }





}
