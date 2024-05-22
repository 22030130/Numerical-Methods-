
package Paquete01;
import java.util.Scanner;
public class Main {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        Metodo objetoMetodo = new Metodo();

        // Leer la cantidad de puntos
        System.out.print("Ingrese la cantidad de puntos: ");
        int n = scanner.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        // Leer los puntos
        System.out.println("Ingrese los puntos (x y): ");
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextDouble();
            y[i] = scanner.nextDouble();
        }

        // Calcular coeficientes de diferencias divididas
        double[] coeficientes = objetoMetodo.diferenciasDivididas(x, y);

        // Leer el valor a interpolar
        System.out.print("Ingrese el valor a interpolar: ");
        double valor = scanner.nextDouble();

        // Evaluar el polinomio en el valor dado
        double resultado = objetoMetodo.evaluarPolinomio(coeficientes, x, valor);

        // Mostrar el resultado
        System.out.println("El valor interpolado en x = " + valor + " es " + resultado);

        scanner.close();
    }
}
