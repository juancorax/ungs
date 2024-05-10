# Escribir una función llamada maximoIndice
# que tome una lista de números y devuelva el
# índice del máximo elemento.


def maximoIndice(lista):
    numeroMaximo = lista[0]
    indiceDelMaximo = 0

    for i in range(0, len(lista)):
        if lista[i] > numeroMaximo:
            numeroMaximo = lista[i]
            indiceDelMaximo = i

    return indiceDelMaximo


print(maximoIndice([1, 2, 3, 4, 5]))
print(maximoIndice([5, 4, 3, 2, 1]))
print(maximoIndice([2, 5, 1, 3, 4]))
