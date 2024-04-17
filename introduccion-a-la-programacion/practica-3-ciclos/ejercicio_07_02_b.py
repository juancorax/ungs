# b) Hacer un programa que permita al usuario
# elegir un número m y un n y luego
# muestre todos los naturales entre m y n
# (m, m + 1, m + 2, · · · , n − 1, n).
# Qué pasa si n es menor que m?

m = int(input("Ingrese un numero 'm':\n"))
n = int(input("Ingrese un numero 'n':\n"))

for i in range(m, n + 1):
    print(i)
