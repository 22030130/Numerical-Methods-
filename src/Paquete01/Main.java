
package Paquete01;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String args []){
        DecimalFormat formato = new DecimalFormat("#.##");
        String sx = JOptionPane.showInputDialog("Método de interpolación lineal\n\nIngrese el valor para x");
        String sx0 = JOptionPane.showInputDialog("Ingrese el valor para x0");
        String sx1 = JOptionPane.showInputDialog("Ingrese el valor para x1");
        String sy0 = JOptionPane.showInputDialog("Ingrese el valor para y0");
        String sy1 = JOptionPane.showInputDialog("Ingrese el valor para y1");
        // HALLO www
        double x = Double.parseDouble(sx);
        double x0 = Double.parseDouble(sx0);
        double x1 = Double.parseDouble(sx1);
        double y0 = Double.parseDouble(sy0);
        double y1 = Double.parseDouble(sy1);
        
        Metodo objetoMetodo = new Metodo();
        JOptionPane.showMessageDialog(null,"Resultado:" + formato.format(objetoMetodo.interpolacionLineal(x0, x1, x, y0, y1)) );
    }
}
