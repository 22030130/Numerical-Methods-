
package Paquete01;

public class Metodo {
    // Definimos la función f(x, y)
    public static double f(double x, double y) {
        // Ejemplo: dy/dx = y - x^2 + 1
        return y - x * x + 1;
    }
    
    // Definimos la derivada de la función f respecto a x
    public static double df(double x, double y) {
        // Derivada parcial de f respecto a x para la función dada:
        // df/dx = d/dx (y - x^2 + 1) = -2x
        return -2 * x;
    }
    
    // Método que implementa el método de Taylor de orden 2
    public static void taylor(double x0, double y0, double xFinal, double h) {
        double x = x0;
        double y = y0;
        
        // Imprime el punto inicial
        System.out.printf("x: %.4f, y: %.4f%n", x, y);
        
        // Itera mientras x no alcanza el valor final
        while (x < xFinal) {
            double fValue = f(x, y);
            double dfValue = df(x, y);
            y = y + h * fValue + (h * h / 2) * dfValue;  // Calcula el nuevo y
            x = x + h;  // Incrementa x
            System.out.printf("x: %.4f, y: %.4f%n", x, y);  // Imprime el nuevo punto
        }
    }
}
