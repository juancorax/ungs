# d) Idem anterior para la sucesión an = 1 / (n ** 2).

n = int(input("Ingrese un número para 'n':\n"))
sumaParcial = 0

for i in range(1, n + 1):
    sumaParcial += 1 / (i**2)
    print(sumaParcial)
