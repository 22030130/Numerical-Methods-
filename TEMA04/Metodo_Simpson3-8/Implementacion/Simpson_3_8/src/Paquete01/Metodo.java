
package Paquete01;

public class Metodo {
    double Simpson(double xinf, double xsup, int nInterbalos){
        double h = ((xsup - xinf)/nInterbalos); // calcula la distancia entre intérbalos
        // vector que guarda el valor de los intérbalos
        double[] valorInterbalos = new double[nInterbalos+1];
        for(int i=0; i<=nInterbalos; i++){
            if(i == 0){// si es el primer valor asigna el valor de xinf
                valorInterbalos[i] = xinf;
            }else if(i == nInterbalos){ // si es el último valor asigna el valor de xsup
                valorInterbalos[i] = xsup;
            }
            else{
                valorInterbalos[i] = valorInterbalos[i-1] + h; // si no es el primero ni el último hace la sumatoria
            }
        }
        
        // aplica la fórmula
        double suma = 0;
        for(int i=0; i<=nInterbalos; i++){
            if(i == 0){ // si es el primer valor no tiene coeficiente
                suma = suma + f(valorInterbalos[i]);
            }else if((i&3) != 0){ // si no es múltiplo de 3 su coeficiente es 3
                suma = suma + (3 * f(valorInterbalos[i]));
            }else if((i%3) == 0){ // si es múltiplo de 3 su coeficiente es 2
                suma = suma + (2 * f(valorInterbalos[i]));
            }else if(i == nInterbalos){ // si es el último valor no tiene coeficiente
                suma = suma + f(valorInterbalos[i]);
            }
        }
        
        return (((3*h)/8) * suma);
        
    }
    // método que evalúa la función respecto de x
    double f(double x){
        return 1/x;
    }
}
