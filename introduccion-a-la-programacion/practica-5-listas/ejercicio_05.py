# Definir una función llamada sonFactores que tome un entero n
# y una lista de enteros, y devuelva True si los números de la
# lista son factores de n (es decir, si n es divisible por todos
# ellos).


def sonFactores(numeroEntero, listaDeEnteros):
    for elemento in listaDeEnteros:
        if numeroEntero % elemento != 0:
            return False
    return True


print(sonFactores(4, [1, 2, 4]))
print(sonFactores(4, [1, 2, 3, 4]))
