# c) Hacer un programa que permita
# al usuario elegir un número positivo n
# y luego muestre en pantalla la cantidad
# de divisores de n.

n = int(input("Ingrese un número para 'n':\n"))
cantidadDeDivisores = 0

for i in range(1, n + 1):
    if n % i == 0:
        cantidadDeDivisores += 1

print(cantidadDeDivisores)
