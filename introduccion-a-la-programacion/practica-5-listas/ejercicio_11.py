# Escribir una función llamada maximoEntre que tome
# una lista de números y dos enteros a y b menores
# que la longitud de la lista y devuelva el índice
# del máximo elemento considerando solo los que están
# entre el índice a y el índice b.


def maximoEntre(lista, a, b):
    numeroMaximo = lista[a]
    indiceDelMaximo = a

    for i in range(a, b + 1):
        if lista[i] > numeroMaximo:
            numeroMaximo = lista[i]
            indiceDelMaximo = i

    return indiceDelMaximo


print(maximoEntre([1, 2, 3, 4, 5], 1, 3))
print(maximoEntre([5, 4, 3, 2, 1], 1, 3))
print(maximoEntre([3, 1, 5, 4, 2], 1, 3))
