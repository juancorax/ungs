# Definir una función que tome un entero n
# y devuelva los primeros n primos


def esPrimo(numero):
    for i in range(2, numero):
        if numero % i == 0:
            return False
    return True


def primerosPrimos(n):
    primos = []

    i = 2
    while len(primos) < n:
        if esPrimo(i):
            primos.append(i)
        i += 1

    return primos


print(primerosPrimos(5))
print(primerosPrimos(10))
