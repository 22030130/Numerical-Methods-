
package Paquete01;

public class Metodo {
    public double secante(double x0, double x1, double error){
        double xi1; double xi1Anterior; double erCalculado = 100; // variables que se necesitan para el procedimiento
        
        do{
            double fx0 = f(x0); // evalúa x0 en la función
            double fx1 = f(x1); // evalúa x1 en la función
            
            xi1 = x1 - ((fx1*(x1-x0))/(fx1-fx0)); // calcula xi+1
            
            erCalculado = Math.abs( ((xi1-x1)/xi1)*100 ); // calcula el error
            
            x0 = x1; // reasigna el valor; para el valor de x1 a x0
            x1 = xi1; // reasigna el valor; pasa el valor de xi1 (xi+1) a x1
            
        }while(erCalculado > error); // mientras el error calculado sea mayor al esperado esto se repite
        
        return xi1; // te dispara el valor guardado en xi1 (que es xi+1)
    }
    
    double f(double x){ // función 
        return Math.pow(x, 2)-3*x - 4;
    }
}
