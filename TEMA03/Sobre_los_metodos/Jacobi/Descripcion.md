# Método Jacobi

Tanto el método de Gauss Seidel como el de Jacobi son los procesos de aproximaciones sucesivas para resolver sistemas de ecuaciones lineales compatibles determinados. Ambos requieren de la verificación de un criterio de convergencia comúnmente conocido como diagonal pesada.

Consisten en despejar cada variable del sistema de ecuaciones para después asignar un valor propuesto, que en su mayoría de ocasiones (y por facilidad matemática) es cero el valor propuesto, para que porsteriormente se evalúen los resultdados de cada variable de manera iterativa hasta tener un porcentaje de error aceptable.

A diferencia del método Gauss Seidel, el método Jacobi no reemplaza el valor de las variables conforme sale cálculo, pues en Gauss Seidel al evaluar en primer renglón obtenido del despeje del sistema de ecuaciones se reemplazaba en el segundo renglón. Ahora, en Jacobi, esos valores permanecen estáticos durante toda la iteracion.
