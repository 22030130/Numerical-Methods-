# Algoritmo para el método de Newton

Paso 1: Recolectar los puntos de datos

• El número de conjunto de números 
• Los puntos n

Paso 2: Calcular las diferencias divididas 

Diferencias divididas de orden 0:

f(xi) = yi para i = 0, 1, 2, ..., n

Difernencias divividas de orden superior:

f(xi, xi+1) = f(xi+1) - f(xi) / (xi+1) - xi

Paso 3: Construir el polinomio interpolador de Newton 

El polinomio de Newton (px) se construye usando las diferencias divididas calculadas:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/012c604f-842a-40c1-997c-ace22aa4d6cd)

Paso 4: Evaluar el polinomio en el punto deseado
