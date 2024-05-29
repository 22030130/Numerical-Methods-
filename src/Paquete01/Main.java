package Paquete01;

public class Main {
    public static void main (String args []){
        // Valores iniciales
        double x0 = 0.0;
        double y0 = 0.5;
        double xFinal = 16.0;
        double h = 0.8;

        Metodo objeto = new Metodo();
        // Llama al método de Runge-Kutta de cuarto orden
        objeto.rungeKutta(x0, y0, xFinal, h);
    }
}
