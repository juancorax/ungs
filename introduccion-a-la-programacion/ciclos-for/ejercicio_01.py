# Realizar un programa que imprima
# la tabla del número que el usuario desee
# (desde el 1 al 10).
# Hacer ahora una versión con ciclos for.

numeroSolicitado = int(input("Ingrese un número:\n"))

for i in range(1, 11):
    print(numeroSolicitado, "*", i, "=", numeroSolicitado * i)
