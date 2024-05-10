
package Paquete01;

public class Metodo {
    double interpolacionLineal(double x0, double x1, double x, double y0, double y1){
        return (y0 + ((y1-y0)/(x1-x0)) * (x -x0));
    }
}
