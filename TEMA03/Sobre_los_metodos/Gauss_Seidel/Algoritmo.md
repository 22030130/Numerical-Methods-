# Algoritmo para el método de Gauss Seidel

1.- Acomodar el sistema de ecuaciones de manera que tegna una diagonal dominante, (que el coeficiente relativo de la variable sea mayor en el eje vertical y horizontal) en caso de no serlo, tratar de acomodarlo de la manera más cercana a una diagonal dominante.

Sistema de ecuaciones: 
![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/150ee71a-32bd-423b-86fe-63898edcc6c5)

Acomodo del sistema de ecuaciones: 
![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/915defa6-faaa-44ba-8886-e18dbb99fb0a)

2.- Despejar el valor de cada variable respecto al renglón del sistema:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/cd305275-8e35-4ed3-91f2-033c16353936)

3.- Asignar un valor inicial propuesto para todas las variables y sustituir en los despejes obtenidos:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/0fd15237-f387-4865-9f8e-64b52059705e)

4.- Continuar iterando hasta que el error relativo sea menor al error admitido. En la primera iteración no es posible debido a que no hay suficientes datos para realizar la fórmula para el cálculo del error, la cual es: 

Er = | 1 - (Valor anterior / Valor nuevo) |

Repitiendo el cálculo del error en cada variable. 

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/d28d0863-1ee8-4049-b0d8-bf27ccef7b23)

5.- Continuar con las iteraciones; sustituyendo el valor obtenido en un renglón del sistema sistituyendolo en el siguiente renglón de la escuación hasta que el error relativo sea menor al error admitido. 

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/4f0d2569-ae2e-4c17-b281-18a525b2bcf0)


![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/4ba99b01-051f-4f7b-a33f-4677fca266a6)



