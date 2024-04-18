
package Paquete01;
import java.text.DecimalFormat; // LIBRERÍA PARA ASIGNAR FORMATO A LOS DECIMALES
import java.util.Scanner; // LIBRERÍA PARA LEER
public class Main {
    public static void main (String args []){
        Scanner lee  = new Scanner(System.in);
        
        // CONFIGURACIÓN DEL DOUBLE PARA CORTARLO
        DecimalFormat df = new DecimalFormat("#.###");
        
        //ENTRADA DE DATOS
        System.out.println("Programa que calcula la raíz de una función por el método de bisección\n\n");
        System.out.println("f(x) = x^3 - x - 8");
        System.out.println("\nIngrese:\nLímite inferior");
        double x1 = lee.nextDouble();
        System.out.println("Límite superior:");
        double xu = lee.nextDouble();  
        System.out.println("Error aceptado en % (sin el símbolo):");
        double es = lee.nextDouble();
        System.out.println("Número máximo de iteraciones:");
        int imax = lee.nextInt();
        
        // SALIDA DE DATOS
        
        Metodo metodo = new Metodo();// SE CREA EL OBJETO PARA ACCEDER AL MÉTODO DE LA CLASE "Metodo"
        
        String raizCortada = df.format(metodo.biseccion(xu, xu, es, imax)); // SE GUARDA LA RAÍZ EN UN STRING PARA CORTARLA
        
        System.out.println("\n***********************************************\nLa raíz es:" + raizCortada);
    }
}
