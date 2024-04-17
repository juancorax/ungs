# a) Hacer un programa que permita
# al usuario elegir un número positivo n
# y luego muestre en pantalla las n
# primeras sumas parciales de la sucesión
# an = 2n.
# Es decir, 2 6 12 20...

n = int(input("Ingrese un número para 'n':\n"))
sumaParcial = 0

for i in range(1, n + 1):
    sumaParcial += 2 * i
    print(sumaParcial)
