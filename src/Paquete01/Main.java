
package Paquete01;

public class Main {
    public static void main (String args []){
        Metodo objeto = new Metodo();
        
        // Valores iniciales
        double x0 = 0.1;
        double y0 = 0.6;
        double xFinal = 2.0;
        double h = 0.2;
        
        // Llama al método de Taylor de orden 2
        objeto.taylor(x0, y0, xFinal, h);
    }
}
