
package Paquete01;

public class Metodo {
    // Definimos la función f(x, y)
    public static double f(double x, double y) {
        // Ejemplo: dy/dx = y - x^2 + 1
        return y - x * x + 1;
    }

    // Método que implementa el método de Runge-Kutta de cuarto orden (RK4)
    public static void rungeKutta(double x0, double y0, double xFinal, double h) {
        double x = x0;
        double y = y0;

        // Imprime el punto inicial
        System.out.printf("x: %.4f, y: %.4f%n", x, y);

        // Itera mientras x no alcanza el valor final
        while (x < xFinal) {
            double k1 = h * f(x, y);
            double k2 = h * f(x + h / 2, y + k1 / 2);
            double k3 = h * f(x + h / 2, y + k2 / 2);
            double k4 = h * f(x + h, y + k3);
            
            // Calcula el nuevo y
            y = y + (k1 + 2 * k2 + 2 * k3 + k4) / 6;
            // Incrementa x
            x = x + h;

            // Imprime el nuevo punto
            System.out.printf("x: %.4f, y: %.4f%n", x, y);
        }
    }
}
