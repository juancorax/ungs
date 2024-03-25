# Escribir un programa que pida al usuario
# dos enteros y los guarde en dos variables.
# Si el primero de los valores fuera menor que el segundo,
# el programa deberá además intercambiar los
# valores de las variables y mostrarlos de mayor a menor.

numeroEntero1 = int(input("Ingrese un número entero:\n"))
numeroEntero2 = int(input("Ingrese otro número entero:\n"))

if numeroEntero1 < numeroEntero2:
    variableAuxiliar = numeroEntero1
    numeroEntero1 = numeroEntero2
    numeroEntero2 = variableAuxiliar

print(numeroEntero1)
print(numeroEntero2)
