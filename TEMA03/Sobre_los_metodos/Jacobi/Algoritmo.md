# Algoritmo para el método Jacobi

1.- Como primer paso se debe revisar que el sistema de ecuaciones tenga una diagonal dominante, es decir, en la diagonal que se forma con los coeficientes del sistema de ecuaciones sea el mayor para cada variable vertical y horizontalmente. 

Analizando el sistema de ecuaciones se observa que necesita reacomodarse para recudir el número de iteraciones:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/a43303c3-23e0-407a-8636-e76ece43fe61)

Haniendo acomodado el sistema de ecuaciones para que tenga una diagonal dominante:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/a5557c28-c145-4cf3-bfb3-5e7da523cd1b)

2.- Al tener el sistema de ecuaciones con diagonal dominante, o lo más cercano posible se despeja el valor de cada variable por cada renglón del sitema de ecuaciones: 

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/d24dec71-8fb5-4971-a461-daba8f209f4a)

3.- Se asignan valores iniciales propuestos, donde se sugiere que sea cero, para posteriormente evaluarlo en los despejes anteriormente calculados:

Asignando el valor cero para cada variable:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/831c8284-ab6e-4364-b773-9160444a0bfa)

Evaluando en los despejes:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/56e9cf18-9a69-4e1a-bd2e-465c9754008f)

4.- Para poder seguir se evalúa el porcentaje de error que sea el menor al aceptado en todas las varibales, pero como es la primera iteración se debe hacen mínimo dos veces, por lo tanto, se continúa con la segunda iteración:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/166d00d3-530b-439e-aaa5-7331b9eebb33)

5.- Continuar con las iteraciones manteniendo el valor nuevo de las variables estáticos en las iteraciones hasta obtener un porcentaje de error menor al error aceptado:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/0d7f768f-05cb-4a97-ba65-113fec3b9a0a)





