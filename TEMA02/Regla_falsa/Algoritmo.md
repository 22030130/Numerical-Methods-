# Algoritmo para el método de la regla falsa

Paso 1: 

Asignar los valores de los límites a aplicar para el método. Asignar un valor para el límite inferior y superior, además del procentaje de error aceptado en el resuultado de la raíz.

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/0daafb51-2090-4b74-9984-7bdf6dcd3f3f)

Paso 2:

Evaluar los valores x1 (límite inferior) y x2 (límite superior) en la función:

Función:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/d8374217-3db0-4ae2-bd2e-911b2dce1ad9)

Evaluación:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/f558c0ea-0dfa-491f-bd34-96d7c6458d9c)

Paso 3: 

Calcular el valor de xr con la fórmula:

![image](https://github.com/22030130/Numerical-Methods-/assets/147437999/89237c65-9bcc-4698-ac58-7886e5ba41f2)

Paso 4:

Si xr < 0 
  Entonces x1 = xr

Si xr > 0
  Entonces x2 = xr

 Paso 5:
 
 Calcular el error relativo:
 Error relativo = ABS( (xr-xrAnterior) / xr  * 100)

Paso 5:
 Si el error es mayor al aceptado volver a iterar.



