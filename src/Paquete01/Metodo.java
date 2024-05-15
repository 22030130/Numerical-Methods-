
package Paquete01;

public class Metodo {
    double interpolacionCuadratica(double x0, double x, double x1, double x2, double y0, double y1, double y2){
        
        double b0 = y0;
        
        double b1 = (y1 - y0)/(x1 - x0);
        
        double b2 = ( ( (y2 - y1)/(x2 - x1) ) - ( (y1 - y0)/(x1-x0) ) )/(x2 - x0);
        
        return b0 + (b1 * (x - x0)) + (b2 * ((x - x0)*(x - x1)) );
    }
    
}
