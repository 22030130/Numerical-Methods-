
package Paquete01;

public class Metodo {
    // Definir la función para la cual queremos encontrar la raíz
    static double funcion(double x) {
        // Aquí defines tu función, por ejemplo:
        // return x*x - 4;  // La raíz cuadrada de 4
        return Math.pow(x, 3) - 2*x - 5;  // Ejemplo de una función cúbica
    }
    
    // Calcular la derivada de la función
    static double derivada(double x) {
        // Aquí defines la derivada de tu función
        // Por ejemplo, para x^2 - 4, la derivada sería 2*x
        return 3*Math.pow(x, 2) - 2; // Ejemplo de la derivada de la función cúbica anterior
    }
    
    // Método de Newton-Raphson para encontrar la raíz de la función
    public double newtonRaphson(double x0, double tolerancia, int maxIteraciones) {
        double x = x0;
        int iteracion = 0;
        double error = Double.MAX_VALUE;
        
        while (error > tolerancia && iteracion < maxIteraciones) {
            double xAnterior = x;
            x = x - (funcion(x) / derivada(x));
            error = Math.abs((x - xAnterior) / x);
            iteracion++;
        }
        
        if (iteracion == maxIteraciones) {
            System.out.println("El método no converge después de " + maxIteraciones + " iteraciones.");
        } else {
            System.out.println("Raíz encontrada en " + iteracion + " iteraciones: " + x);
        }
        
        return x;
    }
}
