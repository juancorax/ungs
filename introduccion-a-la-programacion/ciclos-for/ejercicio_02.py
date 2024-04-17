# Escribir un programa que le pregunte
# al usuario un número entero positivo N,
# y que calcule su factorial ( N! )
# (ej: 5! = 5*4*3*2*1)

numeroSolicitado = int(input("Ingrese un número entero positivo N:\n"))
factorial = 1

for i in range(factorial, numeroSolicitado + 1):
    factorial *= i

print("El factorial de", numeroSolicitado, "es", factorial)
