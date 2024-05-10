# Escribir una función llamada maximo que tome una lista
# de números y devuelva el valor del máximo elemento.


def maximo(lista):
    numeroMaximo = lista[0]

    for elemento in lista:
        if elemento > numeroMaximo:
            numeroMaximo = elemento

    return numeroMaximo


print(maximo([1, 2, 3, 4, 5]))
print(maximo([5, 4, 3, 2, 1]))
print(maximo([1, 5, 3, -1, 9]))
