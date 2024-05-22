
package Paquete01;

public class Metodo {
    public double biseccion(double x1, double x2, double err){
        double xr = 0; double erraprox = 0; // Variables que se ocupan durante el procedimiento
        
        do{
            double xrAnterior = xr; // Asigna el valor anterior a xr
            
            xr = ((x1 + x2) / 2); // Calcula xr
            
            if(xr != 0){ // Si xr es diferente de cero calcula el error 
                erraprox = Math.abs( (xr-xrAnterior)/xr );
            }
            
            double funcion = f(x1) * f(x2); // Calcula el producto de la función evaluada en x1 y x2
            
            if(funcion < 0){ // Si es menor a cero, el valor inferior es igual a xr
                x1 = xr;
            } else if(funcion > 0){ // Si es mayor a cero, el valor superior es igual a xr
                x2 = xr;
            } else {
                 break; // Donde el resultado sea cero xr es el resultado, así que quiebra el ciclo
            }
            
        }while(erraprox > err); // Se repite mientras el error calculado sea mayor al esperado
        
        return xr; // Al romper el ciclo devuelve el valor guardado en xr
    }
    
    public double f(double x){
            return Math.pow(x, 4) + 3*Math.pow(x, 3) - 2; // Calcula la función con la variable recibida
        }
}
