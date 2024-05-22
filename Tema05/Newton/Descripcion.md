# Método de interpolación Newton

Es un método de interpolación polinómica. Aunque solo existe un único polinomio que interpola una serie de puntos, existen diferentes formas de calcularlo. Este método es útil para situaciones que requieran un número bajo de puntos para interpolar, ya que a medida que crece el número de puntos, también lo hace el grado del polinomio.

Existen ciertas ventajas en el uso de este polinomio respecto al polinomio interpolador de Lagrange. Por ejemplo, si fuese necesario añadir algún nuevo punto o nodo a la función, tan solo habría que calcular este último punto, dada la relación de recurrencia existente y demostrada anteriormente.

Recuerde que el método de Newton-Raphson del capítulo 6 es un método abierto que
permite encontrar la raíz x de una función de tal manera que f(x) = 0. El método se resume como:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/be3985c2-c52b-472d-8770-b36bf347f5f5)

Se utiliza un método abierto similar para encontrar un valor óptimo de f(x) al definir una nueva función, g(x) = ƒ′(x). Así, como el mismo valor óptimo x* satisface ambas funciones:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/628781cd-783c-4f47-820e-47bb2efe5ff7)

Es una técnica para encontrar el mínimo o máximo de f(x). Se deberá observar que
esta ecuación también se obtiene escribiendo una serie de Taylor de segundo orden para
f(x) e igualando la derivada de la serie a cero. El método de Newton es abierto y similar
al de Newton-Raphson, pues no requiere de valores iniciales que contengan al óptimo.
Además, también tiene la desventaja de que llega a ser divergente. Por último, usualmente es una buena idea verificar que la segunda derivada tenga el signo correcto para
confirmar que la técnica converge al resultado deseado

