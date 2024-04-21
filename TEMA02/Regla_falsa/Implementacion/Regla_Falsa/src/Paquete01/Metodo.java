
package Paquete01;

public class Metodo {
   public double reglaFalsa(double x1, double x2, double er){
       double xr = 0; double xrAnterior;
       double erCalculado = 100;
       
       do{
           double fx1 = f(x1); // EVALÚA LA FUNCIÓN EN x1
           double fx2 = f(x2); // EVALÚA LA FUNCIÓN EN x2
           
           xrAnterior = xr; // GUARDA EL VALOR DE xr ANTERIOR PARA PODER HACER DESPUÉS EL CÁLCULO DEL ERROR
           
           xr = x1 - ( (fx1*(x2-x1))/(fx2-fx1) ); // calcula xr
           
           erCalculado = Math.abs( ((xr-xrAnterior)/xr)*100 ); // calcula el error en porcentaje, es decir, el relativo
           
           if(xr>0){
               x2 = xr;
           }else if(xr<0){
               x1 = xr;
           }else{
               erCalculado = 0;
           }
           
       }while(erCalculado > er); // mientras el error calculado sea mayor que el esperado se repetirá
       
       return xr; // dispara el valor guardado en xr
   } 
   
   
   double f(double x){ // función
    return 2*Math.pow(x, 3) + x - 1;
    }
}


