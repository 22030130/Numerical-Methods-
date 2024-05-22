
package Paquete01;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main (String args []){
        Scanner lee = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("Método Simpson 1/3\n");
        System.out.println("Ingrese el valor inferior para la función:");
        double xinf = lee.nextDouble();
        System.out.println("Ingrese el valor superior para la función:");
        double xsup = lee.nextDouble();
        System.out.println("Ingrese el número de interbalos (rectángulos):");
        int nInterbalos = lee.nextInt();
        
        Metodo objetoMetodo = new Metodo();
        System.out.println("El área bajo la curva es: " + formato.format(objetoMetodo.Simpson(xinf, xsup, nInterbalos)));
    }
    
}
