# Definir una función que tome un entero n
# y devuelva la lista de los primos que
# aparecen al factorear n.
# Ejemplo, para 24, la lista debe ser: [2, 2, 2, 3]


def factorizarPrimos(n):
    primos = []
    divisor = 2

    while n > 1:
        while n % divisor == 0:
            primos.append(divisor)
            n //= divisor

        divisor += 1

    return primos


print(factorizarPrimos(12))
print(factorizarPrimos(24))
print(factorizarPrimos(50))
