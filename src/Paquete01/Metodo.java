
package Paquete01;

public class Metodo {
    // Función para calcular las diferencias divididas
    public static double[] diferenciasDivididas(double[] x, double[] y) {
        int n = x.length;
        double[][] diferencias = new double[n][n];

        // Inicializar la primera columna con los valores de y
        for (int i = 0; i < n; i++) {
            diferencias[i][0] = y[i];
        }

        // Calcular diferencias divididas
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                diferencias[i][j] = (diferencias[i + 1][j - 1] - diferencias[i][j - 1]) / (x[i + j] - x[i]);
            }
        }

        // Extraer la primera fila de diferencias divididas
        double[] coeficientes = new double[n];
        for (int i = 0; i < n; i++) {
            coeficientes[i] = diferencias[0][i];
        }

        return coeficientes;
    }

    // Función para evaluar el polinomio de Newton
    public static double evaluarPolinomio(double[] coeficientes, double[] x, double valor) {
        int n = coeficientes.length;
        double resultado = coeficientes[0];
        double producto = 1.0;

        for (int i = 1; i < n; i++) {
            producto *= (valor - x[i - 1]);
            resultado += coeficientes[i] * producto;
        }

        return resultado;
    }
}
