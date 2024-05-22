# Algoritmo

Paso 1:
Elija valores iniciales inferior, xl , y superior, xu, que encierren la raíz, de forma tal que la función cambie de signo en el intervalo. Esto se verifica comprobando que 

f(xl) f(xu) < 0

Paso 2:
Una aprocximación de la raíz xr se determina mediante:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/883fe236-abd1-4b51-b0dd-c40ad0efce94)

Paso 3:
Realice las siguientes evaluaciones para determinar en qué subintérvalo está la raíz:
a) Si f(x1)f(xr) < 0

Entonces la raíz se encuentra dentro del sibintérbalo inferior o isquierdo. Por lo tanto, haga xu = xr y vuelva al paso 2.

b) Si f(x1)f(xr) > 0

Entonces la raíz se encuntra dentro del subintérvalo superior o derecho. Por lo tanto, haga x1 = xr y vuelva al paso 2.

c) Si f(x)f(xr) = 0

Entonces la raíz es igual a xr; termina el cálculo.
