# Algoritmo

Paso 1: Definir la ec. dif.

Debe ser ordinaria con la forma: dy/dx = f(x,y)

Paso 2: Especificar las conficiones iniciales.

Se definirán los datos iniciales que se necesitan para la implementación de la fórmula como el punto inicial (x0,y0) donde y0 es el valor de la función en x0.

Paso 3: Ejegir el tamlo del paso (h)

Como en los métodos anteriores, definir el tamaño de paso en la función.

Paso 4: Calcular los valores intermedios k:

Los valores intermedios se calculan con las fórmulas:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/284f325c-e77c-4b64-9d80-0a4fee7b76a9)

Paso 5: Actualizar el valor de y

Calculando el nuevo valor de y utilizando:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/c37dc7fb-75a7-4a6e-8d9d-6733e2f1df0a)

Paso 6: Actializar el valor de x

Incrementar x en h:

xn + 1 = xn + h

Paso 7: Reperir iteraciones 

Repetir hasta obtener el calor esperado en x
