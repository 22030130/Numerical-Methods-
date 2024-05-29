
public class Main {
    public static void main (String args []){
        // Valores iniciales
        double x0 = 0.0;
        double y0 = 0.5;
        double xFinal = 2.0;
        double h = 0.2;
        
        Metodo objeto = new Metodo();
        // Llama al método de Euler
        objeto.euler(x0, y0, xFinal, h);
    }
}
