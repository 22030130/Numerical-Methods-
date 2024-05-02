
package Paquete01;
import java.util.Scanner;
import java.util.function.Function;
public class Main {
    
    // Método para calcular el área bajo la curva utilizando el método del trapecio
    // Function es una función matemática que acepta un argumento T <> (Acepta de todo)
    public static double calcularArea(Function<Double, Double> funcion, double a, double b, int n) {
        double h = (b - a) / n; // Calcula el ancho de cada trapecio
        double suma = 0.0;
        
        // Calcular la suma de las áreas de los trapecios
        for (int i = 0; i < n; i++) {
            double xi = a + i * h; // Calcula el extremo izquierdo del trapecio actual
            double xi1 = a + (i + 1) * h; // Calcula el extremo derecho del trapecio actual
            suma += (funcion.apply(xi) + funcion.apply(xi1)) / 2.0 * h; // Calcula el área del trapecio y lo suma a la suma total
        }
        
        return suma; // Retorna el área bajo la curva
    }
    
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        
        // Solicitar al usuario que ingrese la función
        System.out.println("Ingresa la función (por ejemplo: x^2):");
        String funcionString = scanner.nextLine(); // Lee la función ingresada por el usuario como una cadena
        
        // Definir la función a partir de la cadena ingresada por el usuario
        Function<Double, Double> funcion = x -> evaluarFuncion(funcionString, x); // Define una función a partir de la cadena ingresada
        
        // Definir los límites de integración
        System.out.println("Ingresa el límite inferior de integración:");
        double a = scanner.nextDouble(); // Lee el límite inferior de integración ingresado por el usuario
        System.out.println("Ingresa el límite superior de integración:");
        double b = scanner.nextDouble(); // Lee el límite superior de integración ingresado por el usuario
        
        // Definir el número de trapezoides
        System.out.println("Ingresa el número de trapezoides:");
        int n = scanner.nextInt(); // Lee el número de trapezoides ingresado por el usuario
        
        // Calcular el área bajo la curva
        double area = calcularArea(funcion, a, b, n); // Calcula el área bajo la curva utilizando el método del trapecio
        
        // Imprimir el resultado
        System.out.println("El área bajo la curva es: " + area); // Imprime el área calculada
        
        scanner.close(); // Cierra el objeto Scanner
    }
    
     // Método para evaluar la función a partir de una cadena
    private static double evaluarFuncion(String funcionString, double x) {
        // Reemplazar "x" en la cadena de la función por el valor de x y evaluarla
        return Parser.eval(funcionString.replaceAll("x", "(" + x + ")")); // Reemplaza "x" por el valor de x en la cadena de la función y luego la evalúa
    }
}
