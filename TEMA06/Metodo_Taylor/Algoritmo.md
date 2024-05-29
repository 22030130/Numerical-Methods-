# Algoritmo

Paso 1: Definir la ecuación diferencial

Se define la ec. dif. ordinara de la forma: dy/dx = f(x,y)

Paso 2: Determinar las dericadas necesarias

Para implementar el método de Taylor de orden 2 se necesita la función f(x,y) y su derivada parcial respecto a x: fx(x,y)

Paso 4: Elegir el tamaño del paso (h):

Seleccionar un tamaño del paso h que determine el intervalo en el que se avanza en la iteración

Paso 5: Iterar utilizando la fórmula del método de Taylor:

y n+1 = yn + hf(xn,yn) + h^2/2 * fx(x,y)

Paso 6: Actualizar los valores y repetir 

Una vez calcularos los valores, actualizarlos hasta obtener el valor esperado en x.
