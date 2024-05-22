package Paquete01;

public class Parser {
    // Método para evaluar una expresión matemática y devolver el resultado
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1; // Avanza al siguiente carácter en la expresión
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar(); // Ignora los espacios en blanco
                if (ch == charToEat) {
                    nextChar(); // Avanza al siguiente carácter si coincide con el carácter a comer
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar(); // Avanza al primer carácter
                double x = parseExpression(); // Parsea la expresión
                if (pos < str.length()) throw new RuntimeException("Carácter inesperado: " + (char)ch); // Lanza una excepción si hay caracteres inesperados al final
                return x; // Retorna el resultado
            }

            double parseExpression() {
                double x = parseTerm(); // Parsea el término
                for (;;) {
                    if (eat('+')) x += parseTerm(); // Suma el siguiente término si encuentra un operador de suma
                    else if (eat('-')) x -= parseTerm(); // Resta el siguiente término si encuentra un operador de resta
                    else return x; // Retorna el resultado
                }
            }

            double parseTerm() {
                double x = parseFactor(); // Parsea el factor
                for (;;) {
                    if (eat('*')) x *= parseFactor(); // Multiplica por el siguiente factor si encuentra un operador de multiplicación
                    else if (eat('/')) x /= parseFactor(); // Divide por el siguiente factor si encuentra un operador de división
                    else return x; // Retorna el resultado
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // Retorna el resultado si encuentra un operador de suma
                if (eat('-')) return -parseFactor(); // Retorna el resultado si encuentra un operador de resta

                double x;
                int startPos = this.pos;
                if (eat('(')) { 
                    x = parseExpression(); // Parsea la expresión dentro de paréntesis
                    eat(')'); // Consume el paréntesis de cierre
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { 
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar(); // Avanza a través de los dígitos y el punto decimal
                    x = Double.parseDouble(str.substring(startPos, this.pos)); // Convierte la cadena de dígitos en un número
                } else if (ch >= 'a' && ch <= 'z') { 
                    while (ch >= 'a' && ch <= 'z') nextChar(); // Avanza a través de las letras
                    String func = str.substring(startPos, this.pos); // Obtiene el nombre de la función
                    x = parseFactor(); // Parsea el argumento de la función
                    if (func.equals("sqrt")) x = Math.sqrt(x); // Evalúa la función raíz cuadrada
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x)); // Evalúa la función seno
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x)); // Evalúa la función coseno
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x)); // Evalúa la función tangente
                    else throw new RuntimeException("Función desconocida: " + func); // Lanza una excepción si la función es desconocida
                } else {
                    throw new RuntimeException("Carácter inesperado: " + (char)ch); // Lanza una excepción si encuentra un carácter inesperado
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // Parsea el exponente si encuentra un operador de potencia

                return x; // Retorna el resultado
            }
        }.parse(); // Parsea la expresión y retorna el resultado
    }
}
