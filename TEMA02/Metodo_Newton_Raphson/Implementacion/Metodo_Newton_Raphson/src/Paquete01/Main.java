
package Paquete01;
import java.util.Scanner;
public class Main {
    public static void main(String args []){
        Scanner lee = new Scanner(System.in);
        
        double x0 = 2; // Punto de inicio para el método
        double tolerancia = 0.0001; // Tolerancia para la convergencia
        int maxIteraciones = 100; // Número máximo de iteraciones permitidas
        
        Metodo metodo = new Metodo();
        double raiz = metodo.newtonRaphson(x0, tolerancia, maxIteraciones);
    }
}
