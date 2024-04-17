# Escribir un programa que le pida
# al usuario números
# (la cantidad que el usuario desee)
# y calcule el promedio.

cantidadDeNumeros = int(input("¿Cuántos números desea ingresar?:\n"))
sumaDeNumeros = 0

for i in range(1, cantidadDeNumeros + 1):
    sumaDeNumeros += int(input("Ingrese un números:\n"))

promedio = int(sumaDeNumeros / cantidadDeNumeros)

print("El promedio es de:", promedio)
