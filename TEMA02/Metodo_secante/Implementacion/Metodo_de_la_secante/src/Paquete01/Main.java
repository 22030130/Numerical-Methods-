
package Paquete01;
import java.text.DecimalFormat; // librería para darle formato de dos decimales al número
import java.util.Scanner;
public class Main {
    public static void main (String args []){
        Scanner lee = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.##"); // objeto donde se define el formato para los decimales
        
        System.out.println("Programa que calcula la raíz de una función con el método de la secante\n\nIngrese el valor para x0:");
        double x0 = lee.nextDouble();
        System.out.println("Ingrese el valor para x1:");
        double x1 = lee.nextDouble();
        System.out.println("Ingrese el porcentaje de error aceptado:");
        double error = lee.nextDouble();
        
        Metodo metodo = new Metodo();
        
        System.out.println("La raíz es: " + formato.format( metodo.secante(x0, x1, error)) );
    }
}
