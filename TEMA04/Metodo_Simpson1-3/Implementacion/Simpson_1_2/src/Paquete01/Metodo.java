package Paquete01;

public class Metodo {
    // aplicación del método Simpson
    double Simpson(double xinf, double xsup, int nInterbalos){
        double deltaX = calcularDeltaX(xsup, xinf, nInterbalos);
        double[] valorInterbalos = calcularInterbalos(xinf, deltaX, nInterbalos);
        
        for(int i=0; i<= nInterbalos; i++){
            if(i==0){
                valorInterbalos[i] = f(valorInterbalos[i]);
            }else if((i%2) == 0){
                valorInterbalos[i] = (f(valorInterbalos[i]) * 2);
            }else if((i%2) != 0){
                valorInterbalos[i] = (f(valorInterbalos[i]) * 4);
            }else if(i == nInterbalos){
                valorInterbalos[i] = f(valorInterbalos[i]);
            }
        }
        double suma = 0;
        for(int i=0; i<=nInterbalos; i++){
            suma = suma + valorInterbalos[i];
        }
        
        return ((deltaX/3)*suma);
    }
    // evalúa x en la función
    double f(double x){
        return Math.pow(x, 2) + 2;
    }
    // calcular delta de X
    double calcularDeltaX(double xsup, double xinf, int nInterbalos){
        return ((xsup - xinf)/nInterbalos);
    }
    // calcular valor de los intérbalos
    double[] calcularInterbalos(double xinf, double deltaX, int nInterbalos){
        double[] vectorInterbalos = new double[nInterbalos+1];
        
        for(int i=0; i<=nInterbalos; i++){
            vectorInterbalos[i] = (xinf + (i * deltaX));
        }
        
        return vectorInterbalos;
    }
}
