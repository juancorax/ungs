# b) Hacer un programa que permita
# al usuario elegir un número positivo n
# y luego muestre en pantalla todos
# los divisores pares de n.

n = int(input("Ingrese un número para 'n':\n"))

for i in range(1, n + 1):
    if n % i == 0 and i % 2 == 0:
        print(i)
