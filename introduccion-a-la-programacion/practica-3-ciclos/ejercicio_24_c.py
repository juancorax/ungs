# c) Escribir un programa que pida
# al usuario un número n y muestre
# n líneas de 2n − 1 asteriscos
# respectivamente.
# Ejemplo, para n = 5,
# el programa deberá mostrar:
#
# *
# ***
# *****
# *******
# *********

n = int(input("Ingrese un número para 'n':\n"))

for i in range(1, n + 1):
    print((2 * i - 1) * "*")
