
package Paquete01;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String args []){
        DecimalFormat formato = new DecimalFormat("#.##");
        Scanner lee = new Scanner(System.in);
        // WWW
        System.out.println("Método de interpolación cuadrática\n\nIngrese el valor para x0:");
        double x0 = lee.nextDouble();
        System.out.println("Ingrese el valor para x:");
        double x = lee.nextDouble();
        System.out.println("Ingrese el valor para x1:");
        double x1 = lee.nextDouble();
        System.out.println("Ingrese el valor para x2:");
        double x2 = lee.nextDouble();
        System.out.println("Ingrese el valor para y0:");
        double y0 = lee.nextDouble();
        System.out.println("Ingrese el valor para y1:");
        double y1 = lee.nextDouble();
        System.out.println("Ingrese el valor para y2:");
        double y2 = lee.nextDouble();
        
        Metodo objetoMetodo = new Metodo();
        
        System.out.println("\nCalculando...\n\nEl valor para f(x) cuando x = " + x + " es: " + formato.format(objetoMetodo.interpolacionCuadratica(x0, x, x1, x2, y0, y1, y2)) );
    }
}
