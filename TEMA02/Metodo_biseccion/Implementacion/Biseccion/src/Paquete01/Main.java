
package Paquete01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String args []){
        Scanner lee = new Scanner(System.in); // Creación del objeto para poder leer desde teclado
        DecimalFormat decimal = new DecimalFormat("##.##");
        
        System.out.println("Programa que usa el método de bisección para calcular la raíz de una función\n");
        System.out.println("x^4 + 3x^3 - 2\n\n");
        System.out.println("Ingrese el valor para el líminte inferior: ");
        double x1 = lee.nextDouble(); // Límite inferior
        System.out.println("Ingrese el valor para el límite superior:");
        double x2 = lee.nextDouble(); // Límite superior
        System.out.println("Ingrese el valor en porcentaje del error aceptado (sin el símbolo de porcentaje):");
        double error = lee.nextDouble(); // Porcentaje de error 
        
        Metodo met = new Metodo(); // Método de la clase método para poder llamar su método
        
        String raizCortada = decimal.format(met.biseccion(x1, x2, error)); // Se guarda en String el resultado con el formato programado
        System.out.println("La raíz es: " + raizCortada); // Salida de datos
    }
}
