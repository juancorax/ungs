# a) Hacer un programa que permita al
# usuario elegir un número positivo n
# y luego muestre en pantalla los n
# primeros términos de la sucesión
# an = 2n. Es decir 2, 4, 6...

n = int(input("Ingrese un número para 'n':\n"))

for i in range(1, n + 1):
    print(2 * i)
