
package Paquete01;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main (String args []){
        Scanner lee = new Scanner (System.in);
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("Método Simpson 3/8\n");
        System.out.println("Ingrese el límite inferior para la función:");
        double xinf = lee.nextDouble();
        System.out.println("Ingrese el límite superior para la función");
        double xsup = lee.nextDouble();
        System.out.println("Ingrese el númreo de interbalos:");
        int nInterbalos = lee.nextInt();
        
        Metodo objetoMetodo = new Metodo();
        System.out.println("El área bajo la curva es: " + formato.format(objetoMetodo.Simpson(xinf, xsup, nInterbalos)));
    }
}
