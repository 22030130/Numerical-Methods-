
public class Metodo {
    // Definimos la función f(x, y)
    public static double f(double x, double y) {
        // Ejemplo: dy/dx = y - x^2 + 1
        return y - x*x + 1;
    }
    
    // Método que implementa el método de Euler
    public static void euler(double x0, double y0, double xFinal, double h) {
        double x = x0;
        double y = y0;
        
        // Imprime el punto inicial
        System.out.printf("x: %.4f, y: %.4f%n", x, y);
        
        // Itera mientras x no alcanza el valor final
        while (x < xFinal) {
            y = y + h * f(x, y);  // Calcula el nuevo y
            x = x + h;  // Incrementa x
            System.out.printf("x: %.4f, y: %.4f%n", x, y);  // Imprime el nuevo punto
        }
    }
}
