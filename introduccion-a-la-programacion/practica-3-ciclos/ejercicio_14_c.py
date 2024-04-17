# c) Idem anterior para la sucesión an = n ** 3 − n ** 2.

n = int(input("Ingrese un número para 'n':\n"))
sumaParcial = 0

for i in range(1, n + 1):
    sumaParcial += i**3 - i**2
    print(sumaParcial)
