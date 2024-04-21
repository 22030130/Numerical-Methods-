
package Paquete01;
import java.util.Scanner;
public class Main {
    public static void main(String args []){
        Scanner lee = new Scanner(System.in);
        
        System.out.println("Programa que calcula la raíz de una función por el método de regla falsan\n\n");
        System.out.println("Ingrese el valor inferior:");
        double xinf = lee.nextDouble();
        System.out.println("Ingrese el valor superior:");
        double xsup = lee.nextDouble();
        System.out.println("Ingrese el porcentaje de error aceptado:");
        double error = lee.nextDouble();
        
        Metodo metodo = new Metodo();
        
        System.out.println("La raíz es: " + metodo.reglaFalsa(xinf, xsup, error));
    }
}
