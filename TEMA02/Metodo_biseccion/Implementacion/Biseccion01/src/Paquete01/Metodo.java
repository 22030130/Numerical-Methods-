
package Paquete01;

public class Metodo {
    
    // MÉTODO DE BISECCIÓN EN JAVA :)
    public double biseccion(double xi, double xu, double es, int imax){
        double xr = 0, ea = 0; // xr = raíz calculada || ea = Error aproximado
        int iter = 0; // CONTADOR DE ITERACIONES
        
        do{
            double xrAnterior = xr; // ALMACENA EL VALOR DE "xr" anterior
            
            xr = ((xi + xu) / 2); // CALCULA "xr"
            
            iter++; // SUMA EL CONTADOR DE ITERACIONES
            
            if(xr != 0){ // CALCULA EL ERROR EN PORCENTAJE
                ea = Math.abs(((xr - xrAnterior)/xr)*100); // ERROR OBTENIDO DURANTE EL PROCEDIMEINTO (ERROR DE CÁLCULO)
            }
            
            double test = (f(xi)*f(xr)); // Llama al método "f" para aplicar la función en: "f(xi)*f(xr)"
            
            if (test < 0){ // CUANDO LA RAÍZ QUEDA A LA IZQUIERDA 
                xu = xr;
            } else if(test > 0){
                xi = xr; // CUANDO LA RAÍZ QUEDA A LA DERECHA
            } else {
                ea = 0; // SI CAE AQUÍ, ENTONCES LA RAÍZ DIÓ CERO, POR LO TANTO, EL VALOR OBTENIDO ES LA RAÍZ :))
            }
            
            if(ea < es){ // VALIDA SI EL ERROR OBTENIDO ES MENOR AL ERROR ESPERADO ENTONCES TERMINA LAS ITERACIONES
                break;
            }
            
        }while(true); // MIENTRAS NO HAYA BREAK CONTINÚA CON LAS ITERACIONES
        
        return xr; // RETORNA EL VALOR CALCULADO ALMACENADO EN LA VARIABLE "xr"
    }
    
    
    // Función f(x) = x^3 - x - 8
    public static double f(double x) {
        return Math.pow(x, 3) - x - 8;
    }
}
