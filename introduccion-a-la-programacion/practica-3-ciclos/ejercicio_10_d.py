# d) Hacer un programa que permita
# al usuario elegir un número positivo n
# y luego muestre en pantalla la suma
# de los divisores de n.

n = int(input("Ingrese un número 'n':\n"))
sumaDeDivisores = 0

for i in range(1, n + 1):
    if n % i == 0:
        sumaDeDivisores += i

print("El resultado de la suma de los divisores es:", sumaDeDivisores)
